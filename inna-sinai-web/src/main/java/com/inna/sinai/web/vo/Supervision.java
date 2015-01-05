package com.inna.sinai.web.vo;

import java.util.Date;

public class Supervision {
	
  private Integer id;
  private Integer supervisorId;
  private String supervisorName;
  private Date openedDate;
  private String comments;
  private Contract contract;
  
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public Integer getSupervisorId() {
	return supervisorId;
  }
  public void setSupervisorId(Integer supervisorId) {
	this.supervisorId = supervisorId;
  }
  public String getSupervisorName() {
	return supervisorName;
  }
  public void setSupervisorName(String supervisorName) {
	this.supervisorName = supervisorName;
  }
  public Date getOpenedDate() {
	return openedDate;
  }
  public void setOpenedDate(Date openedDate) {
	this.openedDate = openedDate;
  }
  public String getComments() {
	return comments;
  }
  public void setComments(String comments) {
	this.comments = comments;
  }
  public Contract getContract() {
	return contract;
  }
  public void setContract(Contract contract) {
	this.contract = contract;
  }
  
}
