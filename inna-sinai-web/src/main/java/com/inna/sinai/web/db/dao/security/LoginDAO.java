package com.inna.sinai.web.db.dao.security;

import java.util.List;

import com.inna.sinai.web.bean.vo.dto.Authority;
import com.inna.sinai.web.bean.vo.dto.Module;
import com.inna.sinai.web.bean.vo.dto.Profile;
import com.inna.sinai.web.bean.vo.dto.User;
import com.inna.sinai.web.bean.vo.dto.UserCredential;


public interface LoginDAO {
	
	public UserCredential getFullCredential(UserCredential credential);
	public User getUser(Integer userId);
	public Profile getProfile(Integer userId);
	public List<Authority> getMasterAuthorities(Integer profileId, Integer moduleId);
	public List<Module> getModules(Integer profileId);
	public void updateCredentials(UserCredential credentials);

}
