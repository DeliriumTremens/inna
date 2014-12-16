package com.inna.sinai.web.service.admin;

import java.util.List;

import com.inna.sinai.common.exception.core.SystemException;
import com.inna.sinai.web.bean.criteria.UserCriteria;
import com.inna.sinai.web.bean.vo.MasterUser;
import com.inna.sinai.web.bean.vo.dto.Profile;


public interface UserAdminService {
	
	public List<MasterUser> searchMasterUsers(UserCriteria searchParams);
	public MasterUser getMasterUser(Integer userId);
	public void insertMasterUser(MasterUser masterUser) throws SystemException;
	public void updateMasterUserInformation(MasterUser masterUser);
	public void deleteMasterUsers(String chainIds);
	public boolean existUserMail(String mail);
	public boolean existUserNickName(String nickName);
}
