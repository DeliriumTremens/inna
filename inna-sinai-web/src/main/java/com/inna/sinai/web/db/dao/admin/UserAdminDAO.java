package com.inna.sinai.web.db.dao.admin;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.inna.sinai.web.bean.vo.MasterUser;

public interface UserAdminDAO {
	
	public List<MasterUser> searchMasterUsers(MasterUser toSearch);
	public Integer findUserIdByMail(String mail);
	public Integer findUserIdByNickName(String nickName);
	@Transactional(rollbackFor=Exception.class)
	public void insertMasterUser(MasterUser masterUser);
	@Transactional(rollbackFor=Exception.class)
	public void deleteMasterUser(Integer userId);
	@Transactional(rollbackFor=Exception.class)
	public void updateMasterUserInformation(MasterUser masterUser);
	public MasterUser getMasterUser(Integer userId);

}
