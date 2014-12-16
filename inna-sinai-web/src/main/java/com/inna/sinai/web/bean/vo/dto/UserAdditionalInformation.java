package com.inna.sinai.web.bean.vo.dto;

public class UserAdditionalInformation {
	
	private Integer userId;
	private String imei;
	private String phoneNumber;
	private String mailPass;
	private String skyMobilePass;
	private String nit;
	private String nitPass;
	private String heatKey;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMailPass() {
		return mailPass;
	}
	public void setMailPass(String mailPass) {
		this.mailPass = mailPass;
	}
	public String getSkyMobilePass() {
		return skyMobilePass;
	}
	public void setSkyMobilePass(String skyMobilePass) {
		this.skyMobilePass = skyMobilePass;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNitPass() {
		return nitPass;
	}
	public void setNitPass(String nitPass) {
		this.nitPass = nitPass;
	}
	public String getHeatKey() {
		return heatKey;
	}
	public void setHeatKey(String heatKey) {
		this.heatKey = heatKey;
	}

}
