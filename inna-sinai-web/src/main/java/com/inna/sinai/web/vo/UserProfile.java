package com.inna.sinai.web.vo;

import com.inna.sinai.common.bean.AbstractBean;


public class UserProfile extends AbstractBean {
	
	private Integer userId;
	private Integer profileId;
	
	public UserProfile(){
		
	}
	
	public UserProfile(Integer userId, Integer profileId){
		this.setUserId(userId);
		this.setProfileId(profileId);
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

}
