package com.inna.sinai.web.vo;

public class InventoryType {
	
  private Integer id;
  private String name;
  private String description;
  private Float cost;
  
  public InventoryType(){
	  
  }
  
  public InventoryType(Integer id){
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
  
}
