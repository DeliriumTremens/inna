package com.inna.sinai.web.vo;

import java.util.Date;

public class ServiceOrder {
	
  private Integer id;
  private Integer statusId;
  private String statusDescription;
  private Integer typeId;
  private String typeDescription;
  private Integer solutionId;
  private String solutionDescription;
  private Float cost;
  private String serviceNumber;
  private Date openedDate;
  private Date closedDate;
  private String comments;
  private Contract contract;
  
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
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
  public Integer getSolutionId() {
	return solutionId;
  }
  public void setSolutionId(Integer solutionId) {
	this.solutionId = solutionId;
  }
  public String getSolutionDescription() {
	return solutionDescription;
  }
  public void setSolutionDescription(String solutionDescription) {
	this.solutionDescription = solutionDescription;
  }
  public Float getCost() {
	return cost;
  }
  public void setCost(Float cost) {
	this.cost = cost;
  }
  public String getServiceNumber() {
	return serviceNumber;
  }
  public void setServiceNumber(String serviceNumber) {
	this.serviceNumber = serviceNumber;
  }
  public Date getOpenedDate() {
	return openedDate;
  }
  public void setOpenedDate(Date openedDate) {
	this.openedDate = openedDate;
  }
  public Date getClosedDate() {
	return closedDate;
  }
  public void setClosedDate(Date closedDate) {
	this.closedDate = closedDate;
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
