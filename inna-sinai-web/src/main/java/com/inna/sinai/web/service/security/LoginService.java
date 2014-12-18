package com.inna.sinai.web.service.security;

import com.inna.sinai.web.vo.Session;
import com.inna.sinai.web.vo.UserCredential;

public interface LoginService {
	
	public UserCredential getFullCredential(UserCredential credential);
	public Boolean isPasswordCorrect(UserCredential toTestCredential
                      , UserCredential credential) throws Exception;
	public Session getSession(Integer userId);

}
