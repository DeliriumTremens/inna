package com.inna.sinai.web.vo;

public class Promotion {

  private Integer id;
  private String name;
  private String description;
  private boolean isActive;
  private Float cost;
  
  public Promotion(){
  }
  
  public Promotion(Integer id){
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

  public boolean isActive() {
	return isActive;
  }

  public void setActive(boolean isActive) {
	this.isActive = isActive;
  }
	
}
