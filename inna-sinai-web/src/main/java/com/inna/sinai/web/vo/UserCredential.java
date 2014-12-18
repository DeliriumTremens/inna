package com.inna.sinai.web.vo;

import java.util.Date;

import com.inna.sinai.common.bean.AbstractBean;

public class UserCredential extends AbstractBean{
	
	private Integer userId = 0;
	private String nickName = null;
	private String password = null;
	private Date lastLogon = null;
	private Boolean isLocked = false;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastLogon() {
		return lastLogon;
	}
	public void setLastLogon(Date lastLogon) {
		this.lastLogon = lastLogon;
	}
	public Boolean getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

}
