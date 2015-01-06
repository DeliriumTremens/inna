package com.inna.sinai.web.vo;

public class LocalInventoryType {
	
  private Integer id;
  private String name;
  private String description;
  private Integer quantity = 0;
  private Float cost;
  
  public LocalInventoryType(){
	  
  }
  
  public LocalInventoryType(Integer id){
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
  
  public Integer getQuantity() {
	return quantity;
  }

  public void setQuantity(Integer quantity) {
	this.quantity = quantity;
  }
  
  public Float getCost() {
	return cost;
  }
  public void setCost(Float cost) {
	this.cost = cost;
  }
  
}
