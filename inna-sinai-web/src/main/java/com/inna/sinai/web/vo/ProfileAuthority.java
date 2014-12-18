package com.inna.sinai.web.vo;

import com.inna.sinai.common.bean.AbstractBean;

public class ProfileAuthority extends AbstractBean{
	
	private Integer authorityId;
	private Integer profileId;
	private Integer accessTypeId;
	
	public Integer getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	public Integer getAccessTypeId() {
		return accessTypeId;
	}
	public void setAccessTypeId(Integer accessTypeId) {
		this.accessTypeId = accessTypeId;
	}
	
}
