package com.inna.sinai.web.vo;

public class Product {

  private Integer id;
  private Integer businessUnitId;
  private String businessUnitName;
  private String name;
  private String description;
  private boolean isActive;
  private Float bonusCost;
  
  public Product(){
	  
  }
  
  public Product(Integer id){
	this.id = id;
  }
  
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public Integer getBusinessUnitId() {
	return businessUnitId;
  }
  public void setBusinessUnitId(Integer businessUnitId) {
	this.businessUnitId = businessUnitId;
  }
  public String getBusinessUnitName() {
	return businessUnitName;
  }
  public void setBusinessUnitName(String businessUnitName) {
	this.businessUnitName = businessUnitName;
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
  public boolean getIsActive() {
	return isActive;
  }
  public void setIsActive(boolean isActive) {
	this.isActive = isActive;
  }
  public Float getBonusCost() {
	return bonusCost;
  }
  public void setBonusCost(Float bonusCost) {
	this.bonusCost = bonusCost;
  }
  
}
