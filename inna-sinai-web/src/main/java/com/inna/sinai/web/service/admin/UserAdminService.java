package com.inna.sinai.web.service.admin;

import java.util.List;

import com.inna.sinai.common.exception.core.SystemException;
import com.inna.sinai.web.vo.MasterUser;


public interface UserAdminService {
	
	public List<MasterUser> searchMasterUsers(MasterUser toSearch);
	public MasterUser getMasterUser(Integer userId);
	public void insertMasterUser(MasterUser masterUser) throws SystemException;
	public void updateMasterUserInformation(MasterUser masterUser);
	public void deleteMasterUsers(String chainIds);
	public boolean existUserMail(String mail);
	public boolean existUserNickName(String nickName);
}
