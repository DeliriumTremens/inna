package com.inna.sinai.web.vo;

public class JobSpec {

  private Integer id;
  private Integer businessUnitId;
  private String businessUnitDescription;
  private String name;
  private String description;
  private Float cost;
  
  public JobSpec(){
  }
  
  public JobSpec(Integer id){
	this.id = id;
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
  public Float getCost() {
	return cost;
  }
  public void setCost(Float cost) {
	this.cost = cost;
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

}
