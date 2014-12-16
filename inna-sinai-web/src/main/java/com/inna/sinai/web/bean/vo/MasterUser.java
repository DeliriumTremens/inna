package com.inna.sinai.web.bean.vo;

import com.inna.sinai.common.bean.AbstractBean;
import com.inna.sinai.web.bean.vo.dto.Profile;
import com.inna.sinai.web.bean.vo.dto.User;
import com.inna.sinai.web.bean.vo.dto.UserAdditionalInformation;
import com.inna.sinai.web.bean.vo.dto.UserCredential;

public class MasterUser extends AbstractBean {
	
	private User user;
	private UserCredential credential;
	private UserAdditionalInformation additionalInformation;
	private Profile profile;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCredential getCredential() {
		return credential;
	}
	public void setCredential(UserCredential credential) {
		this.credential = credential;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public UserAdditionalInformation getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(
			UserAdditionalInformation additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

}
