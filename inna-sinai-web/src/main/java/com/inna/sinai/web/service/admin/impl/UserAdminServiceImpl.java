package com.inna.sinai.web.service.admin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.inna.sinai.common.exception.core.SystemException;
import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.common.service.core.EncryptionService;
import com.inna.sinai.common.util.Utilities;
import com.inna.sinai.web.bean.vo.MasterUser;
import com.inna.sinai.web.db.dao.admin.UserAdminDAO;
import com.inna.sinai.web.service.admin.UserAdminService;

import static com.inna.sinai.web.constant.Literals.*;

public class UserAdminServiceImpl extends AbstractService 
                                  implements UserAdminService {
	
  private UserAdminDAO dao;
  private EncryptionService encrypter;

  public void setEncrypter(EncryptionService encrypter) {
	this.encrypter = encrypter;
  }

  public void setDao(UserAdminDAO dao) {
    this.dao = dao;
  }
	
  public List<MasterUser> searchMasterUsers(MasterUser toSearch){
	List<MasterUser> masterUsers = new ArrayList<MasterUser>();
	if(toSearch != null){
		masterUsers = dao.searchMasterUsers(toSearch);
	}
    return masterUsers;
  }
	
  public MasterUser getMasterUser(Integer userId){
    return dao.getMasterUser(userId);
  }
	
  public void deleteMasterUsers(String chainIds){
	String [] userIds = chainIds.split(MARK_COMMA);
	for(int i=0;i<userIds.length;i++){
	   dao.deleteMasterUser(new Integer(userIds[i]));	
	}
  }
  
  public void insertMasterUser(MasterUser masterUser) throws SystemException {
	  String randomPassword =  Utilities.getRandomString(8);
	  masterUser.getCredential().setIsLocked(false);
	  masterUser.getCredential().setLastLogon(null);
	  masterUser.getCredential().setPassword(encrypter.encrypt(masterUser
			          .getCredential().getNickName() +  randomPassword));
	  dao.insertMasterUser(masterUser);
  }
  
  public void updateMasterUserInformation(MasterUser masterUser){
	  dao.updateMasterUserInformation(masterUser);
  }
  
  public boolean existUserMail(String mail){
	  return dao.findUserIdByMail(mail) != null;
  }
  
  public boolean existUserNickName(String nickName){
	  return dao.findUserIdByNickName(nickName) != null;
  }

}
