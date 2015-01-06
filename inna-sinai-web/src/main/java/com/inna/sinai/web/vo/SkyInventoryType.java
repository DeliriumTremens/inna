package com.inna.sinai.web.vo;

import java.util.Date;

public class SkyInventoryType {
	
  private Integer id;
  private Integer typeId;
  private String typeDescription;
  private Integer statusId;
  private String statusDescription;
  private Integer businessUnitId;
  private String businessUnitDescription;
  private String serial;
  private Date arrivalDate;
  
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public Integer getTypeId() {
	return typeId;
  }
  public void setTypeId(Integer typeId) {
	this.typeId = typeId;
  }
  public String getTypeDescription() {
	return typeDescription;
  }
  public void setTypeDescription(String typeDescription) {
	this.typeDescription = typeDescription;
  }
  public Integer getStatusId() {
	return statusId;
  }
  public void setStatusId(Integer statusId) {
	this.statusId = statusId;
  }
  public String getStatusDescription() {
	return statusDescription;
  }
  public void setStatusDescription(String statusDescription) {
	this.statusDescription = statusDescription;
  }
  public Integer getBusinessUnitId() {
	return businessUnitId;
  }
  public void setBusinessUnitId(Integer businessUnitId) {
	this.businessUnitId = businessUnitId;
  }
  public String getBusinessUnitDescription() {
	return businessUnitDescription;
  }
  public void setBusinessUnitDescription(String businessUnitDescription) {
	this.businessUnitDescription = businessUnitDescription;
  }
  public String getSerial() {
	return serial;
  }
  public void setSerial(String serial) {
	this.serial = serial;
  }
  public Date getArrivalDate() {
	return arrivalDate;
  }
  public void setArrivalDate(Date arrivalDate) {
	this.arrivalDate = arrivalDate;
  }
 
}
