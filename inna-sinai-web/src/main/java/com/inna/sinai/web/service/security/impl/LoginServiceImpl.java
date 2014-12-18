package com.inna.sinai.web.service.security.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.common.service.core.EncryptionService;
import com.inna.sinai.web.vo.MasterModule;
import com.inna.sinai.web.vo.Session;
import com.inna.sinai.web.vo.Authority;
import com.inna.sinai.web.vo.Module;
import com.inna.sinai.web.vo.Profile;
import com.inna.sinai.web.vo.User;
import com.inna.sinai.web.vo.UserCredential;
import com.inna.sinai.web.db.dao.security.LoginDAO;
import com.inna.sinai.web.service.security.LoginService;

public class LoginServiceImpl extends AbstractService implements LoginService{
	
	
  private LoginDAO dao;
  private EncryptionService encrypter;
	
  public void setDao(LoginDAO dao) {
    this.dao = dao;
  }

  public void setEncrypter(EncryptionService encrypter) {
	this.encrypter = encrypter;
  }

  public UserCredential getFullCredential(UserCredential credential){
    return dao.getFullCredential(credential);
  }
	
  public Boolean isPasswordCorrect(UserCredential toTestCredential
			                   , UserCredential credential) throws Exception {
    Boolean isPasswordCorrect = encrypter.compare(toTestCredential.getNickName() 
    		        + toTestCredential.getPassword(), credential.getPassword());
    saveLogonAttemp(credential, isPasswordCorrect);
    return isPasswordCorrect;
  }
	
  private void saveLogonAttemp(UserCredential credential, boolean successful) {
    if(successful){
      credential.setLastLogon(new Date());
    } 
    dao.updateCredentials(credential);
  }
  
  public Session getSession(Integer userId){
    Session session = new Session();
    List<MasterModule> masterModules = new ArrayList<MasterModule>();
    MasterModule masterModule;
    User user = dao.getUser(userId);
    Profile profile = dao.getProfile(userId);
    for(Module module: dao.getModules(profile.getId())){
    	masterModule = new MasterModule();
    	masterModule.setModule(module);
    	masterModule.setAutorities(shadowAuthorities(dao
    			       .getMasterAuthorities(profile.getId(), module.getId())));
    	masterModules.add(masterModule);
    }
    session.setUser(user);
    session.setProfile(profile);
    session.setMasterModules(masterModules);
    session.setActiveAuthority(new Authority());
    return session;
  }
  
  private List<Authority> shadowAuthorities(List<Authority> authorities){
	  Integer seed = null;
	  synchronized(Thread.currentThread()){
		  seed = (int) new Date().getTime();
	  }
	  for(int i=0;i<authorities.size();i++){
		  authorities.get(i).setId(authorities.get(i).getId() * seed);
	  }
	  return authorities;
  }

}
