package com.inna.sinai.web.db.dao.admin.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.bean.vo.MasterUser;
import com.inna.sinai.web.bean.vo.dto.Profile;
import com.inna.sinai.web.bean.vo.dto.User;
import com.inna.sinai.web.bean.vo.dto.UserAdditionalInformation;
import com.inna.sinai.web.bean.vo.dto.UserCredential;
import com.inna.sinai.web.bean.vo.dto.UserProfile;
import com.inna.sinai.web.db.dao.admin.UserAdminDAO;
import com.inna.sinai.web.db.mapper.MasterUserMapper;

@SuppressWarnings("unchecked")
public class UserAdminDAOImpl extends AbstractDAO implements UserAdminDAO {

  public MasterUser getMasterUser(Integer userId){
	  String sqlQuery = "SELECT * " 
              + "FROM SEC_USERS USR, SEC_USER_CREDENTIALS CRED " 
              + "    , CAT_SEC_PROFILES PFL, SEC_USER_PROFILES USR_PFL "
              + "    , SEC_USER_ADDITIONAL_INFORMATION SUAI, CAT_GL_BUSINESS_UNIT CGBU "
              + "    , CAT_SEC_EMPLOYEE_ROL CSUER "
	          + "WHERE USR.ID = CRED.USER_ID"
	          + "      AND USR_PFL.USER_ID = USR.ID"
	          + "      AND USR_PFL.PROFILE_ID = PFL.ID"
	          + "      AND SUAI.USER_ID = USR.ID"
	          + "      AND CGBU.ID = USR.BUSINESS_UNIT_ID"
	          + "      AND CSUER.ID = USR.EMPLOYEE_ROL_ID"
	          + "      AND USR.ID = ?";
	return (MasterUser) getJdbcTemplate().queryForObject(sqlQuery
		          , new Object[]{userId},new MasterUserMapper());
  }
	  
  public List<MasterUser> searchMasterUsers(MasterUser toSearch) {
	  String sqlQuery = "SELECT * " 
	                + "FROM SEC_USERS USR, SEC_USER_CREDENTIALS CRED " 
                    + "    , CAT_SEC_PROFILES PFL, SEC_USER_PROFILES USR_PFL "
                    + "    , SEC_USER_ADDITIONAL_INFORMATION SUAI, CAT_GL_BUSINESS_UNIT CGBU "
                    + "    , CAT_SEC_EMPLOYEE_ROL CSUER "
		            + "WHERE USR.ID = CRED.USER_ID"
		            + "      AND USR_PFL.USER_ID = USR.ID"
		            + "      AND USR_PFL.PROFILE_ID = PFL.ID"
		            + "      AND SUAI.USER_ID = USR.ID"
		            + "      AND CGBU.ID = USR.BUSINESS_UNIT_ID"
		            + "      AND CSUER.ID = USR.EMPLOYEE_ROL_ID";
    List<Object> params = new ArrayList<Object>();
    if(toSearch != null){
      if(toSearch.getUser().getName() != null){
        sqlQuery += "AND CONCAT(USR.NAME,' ',USR.LAST_NAME,' ',USR.MIDDLE_NAME) LIKE ? " ;
        params.add("%" + toSearch.getUser().getName() + "%");
      } else if(toSearch.getCredential().getNickName() != null) {
        sqlQuery += "AND (CRED.NICK_NAME LIKE ?) ";
        params.add("%" + toSearch.getCredential().getNickName() + "%");
      } else if(toSearch.getUser().getMail() != null){
        sqlQuery += "AND USR.MAIL LIKE ? ";
        params.add("%" + toSearch.getUser().getMail() + "%");
      } else if(toSearch.getProfile().getName() != null){
          sqlQuery += "AND PFL.ID = ? ";
          params.add(toSearch.getProfile().getName());
      }
    }
    if(! toSearch.getCredential().getIsActive()){
      sqlQuery += "AND CRED.IS_ACTIVE = ?";
      params.add(false);
    }
	return (List<MasterUser>) getJdbcTemplate().query(sqlQuery, params
			                        .toArray(), new MasterUserMapper());
	}
	
  public void insertMasterUser(MasterUser masterUser){
    Integer newUserId;
    insertUser(masterUser.getUser());
    newUserId = findUserIdByMail(masterUser.getUser().getMail());
    masterUser.getCredential().setUserId(newUserId);
    masterUser.getAdditionalInformation().setUserId(newUserId);
    insertUserCredential(masterUser.getCredential());
    insertUserProfile(new UserProfile(newUserId, masterUser.getProfile()
		    		                                           .getId()));
    insertUserAdditionalInformation(masterUser.getAdditionalInformation());
  }
	  
  public void deleteMasterUser(Integer userId){
    deleteUserCredential(userId);
    deleteUserProfile(userId);
    deleteUser(userId);
    deleteUserAdditionalInformation(userId);
  }
  
  
  public Integer findUserIdByMail(String mail){
	  Integer userId;
	  String sqlQuery = "SELECT ID FROM SEC_USERS WHERE MAIL = ?";
	  try{
		  userId = getJdbcTemplate().queryForInt(sqlQuery, new Object[]{mail});
	  } catch(EmptyResultDataAccessException erde) {
		  userId = null;
	  }
	  return userId;
  }
  
  public Integer findUserIdByNickName(String nickName){
    Integer userId;
    String sqlQuery = "SELECT USER_ID FROM SEC_USER_CREDENTIALS WHERE NICK_NAME = ?";
    try{
       userId = getJdbcTemplate().queryForInt(sqlQuery, new Object[]{nickName});
	} catch (EmptyResultDataAccessException erde) {
	   userId = null;
	}
	return userId;
  }
  
  public void updateMasterUserInformation(MasterUser masterUser) {
    updateUser(masterUser.getUser());
    updateUserProfile(masterUser.getProfile(), masterUser.getUser());
    updateUserAdditionaInformation(masterUser.getAdditionalInformation());
  }
  
  private void deleteUser(Integer userId){
    String sqlQuery = "DELETE FROM SEC_USERS WHERE ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{userId});
  }
	
  private void deleteUserCredential(Integer userId){
    String sqlQuery = "DELETE FROM SEC_USER_CREDENTIALS WHERE USER_ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{userId});
  }
	
  private void deleteUserProfile(Integer userId){
    String sqlQuery = "DELETE FROM SEC_USER_PROFILES WHERE USER_ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{userId});
  }
  
  private void deleteUserAdditionalInformation(Integer userId){
	 String sqlQuery = "DELETE FROM SEC_USER_ADDITIONA_INFORMATION WHERE USER_ID = ?";
	 getJdbcTemplate().update(sqlQuery, new Object[]{userId});
  }
	
  private void insertUser(User user){
    String sqlQuery = "INSERT INTO SEC_USERS (NAME, LAST_NAME, MIDDLE_NAME, MAIL) " 
    	            + " VALUES (?,?,?,?)";
    getJdbcTemplate().update(sqlQuery, new Object[]{user.getName(), user
				 .getLastName(), user.getMiddleName(), user.getMail()});
  }
  
  private void insertUserCredential(UserCredential userCredential){
    String sqlQuery = "INSERT INTO SEC_USER_CREDENTIALS VALUES (?,?,?,?,?)";
    getJdbcTemplate().update(sqlQuery, new Object[]{userCredential.getUserId()
    		, userCredential.getNickName(), userCredential.getPassword()
    		, userCredential.getLastLogon(), userCredential.getIsActive()});
    
  }  
  
  private void insertUserAdditionalInformation(UserAdditionalInformation addInf){
	String sqlQuery = "INSERT INTO SEC_USER_ADDITIONAL_INFORMATION VALUES (?,?,?,?,?,?,?,?)";
	 getJdbcTemplate().update(sqlQuery, new Object[]{addInf.getUserId(), addInf.getImei()
			                     , addInf.getPhoneNumber(), addInf.getMailPass()
			                     , addInf.getSkyMobilePass(), addInf.getNit()
			                     , addInf.getNitPass(), addInf.getHeatKey()});
  }
  
  private void insertUserProfile(UserProfile userProfile){
	  String sqlQuery = "INSERT INTO SEC_USER_PROFILES VALUES (?,?)";
	  getJdbcTemplate().update(sqlQuery, new Object[]{userProfile.getUserId()
			                                  , userProfile.getProfileId()});
  }
  
  private void updateUser(User user){
	  String sqlQuery = "UPDATE SEC_USERS SET NAME = ?, LAST_NAME= ?" 
		              + "                   , MIDDLE_NAME = ?, MAIL = ? " 
		              + "WHERE ID = ?";
	  getJdbcTemplate().update(sqlQuery, new Object[]{user.getName()
			          , user.getLastName(), user.getMiddleName(), user.getMail()
			                                                   , user.getId()});
  }
  
  private void updateUserProfile(Profile profile, User user){
	  String sqlQuery = "UPDATE SEC_USER_PROFILES SET PROFILE_ID = ? "
		              + "WHERE USER_ID = ?";
	  getJdbcTemplate().update(sqlQuery, new Object[]{profile.getId()
			                                        , user.getId()});
	  
  }
  
  private void updateUserAdditionaInformation(UserAdditionalInformation addInf){
	String sqlQuery = "UPDATE SEC_USER_ADDITIONAL_INFORMATION SET IMEI = ?"
			        + ", PHONE_NUMBER= ?, MAIL_PASS = ?, SKY_MOBILE_PASS = ?"
			        + ", NIT = ?, NIT_PASS = ?, HEAT_KEY = ?"
			        + "WHERE USER_ID = ?";
	 getJdbcTemplate().update(sqlQuery, new Object[]{addInf.getImei()
				                     , addInf.getPhoneNumber(), addInf.getMailPass()
				                     , addInf.getSkyMobilePass(), addInf.getNit()
				                     , addInf.getNitPass(), addInf.getHeatKey()
				                     , addInf.getUserId()});
	  }
  
}
