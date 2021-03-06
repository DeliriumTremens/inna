package com.inna.sinai.web.db.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.inna.sinai.web.vo.MasterUser;
import com.inna.sinai.web.vo.Profile;
import com.inna.sinai.web.vo.User;
import com.inna.sinai.web.vo.UserAdditionalInformation;
import com.inna.sinai.web.vo.UserCredential;

public class MasterUserMapper implements RowMapper {

	public  Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		MasterUser masterUser = new MasterUser();
		masterUser.setUser(getUser(rs));
		masterUser.setCredential(getCredential(rs));
		masterUser.setProfile(getProfile(rs));
		masterUser.setAdditionalInformation(getUserAdditionalInformation(rs));
		return masterUser;
	}
	
	private User getUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setEmployeeRolId(rs.getInt(2));
		user.setBusinessUnitId(rs.getInt(3));
		user.setName(rs.getString(4));
		user.setLastName(rs.getString(5));
		user.setMiddleName(rs.getString(6));
		user.setMail(rs.getString(7));
		return user;
	}
	
	private UserCredential getCredential(ResultSet rs) throws SQLException {
		UserCredential credential = new UserCredential();
		credential.setUserId(rs.getInt(8));
		credential.setNickName(rs.getString(9));
		credential.setPassword(rs.getString(10));
		credential.setLastLogon(rs.getDate(11));
		credential.setIsLocked(rs.getBoolean(12));
		return credential;
	}
	
	private UserAdditionalInformation getUserAdditionalInformation(ResultSet rs) 
			                                               throws SQLException {
	  UserAdditionalInformation addInformation= new UserAdditionalInformation();
	  addInformation.setUserId(rs.getInt(16));
	  addInformation.setImei(rs.getString(19));
	  addInformation.setPhoneNumber(rs.getString(20));
	  addInformation.setMailPass(rs.getString(21));
	  addInformation.setSkyMobilePass(rs.getString(22));
	  addInformation.setNit(rs.getString(23));
	  addInformation.setNitPass(rs.getString(24));
	  addInformation.setHeatKey(rs.getString(25));
	  return addInformation;
	}
	
	private Profile getProfile(ResultSet rs) throws SQLException {
		Profile profile = new Profile();
		profile.setId(rs.getInt(13));
		profile.setName(rs.getString(14));
		profile.setDescription(rs.getString(15));
		return profile;
	}
	
}
