package com.inna.sinai.web.vo;

public class JobSpec {

  private Integer id;
  private String name;
  private String description;
  private Float jobCost;
  private Float transferCost;
  private Boolean isActive = true;
  
  public JobSpec(){
  }
  
  public JobSpec(Integer id){
	this.id = id;
  }
  
  public JobSpec(Boolean isActive){
	this.isActive = isActive;
  }

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
	this.id = id;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getDescription() {
	return description;
  }

  public void setDescription(String description) {
	this.description = description;
  }

  public Float getJobCost() {
	return jobCost;
  }

  public void setJobCost(Float jobCost) {
	this.jobCost = jobCost;
  }

  public Float getTransferCost() {
	return transferCost;
  }

  public void setTransferCost(Float transferCost) {
	this.transferCost = transferCost;
  }

  public Boolean getIsActive() {
	return isActive;
  }

  public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
  }
  
}
