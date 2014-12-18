package com.inna.sinai.web.vo;

import com.inna.sinai.common.bean.AbstractBean;


public class MasterUser extends AbstractBean {
	
	private User user = new User();
	private UserCredential credential = new UserCredential();
	private UserAdditionalInformation additionalInformation = new UserAdditionalInformation();
	private Profile profile = new Profile();
	
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
