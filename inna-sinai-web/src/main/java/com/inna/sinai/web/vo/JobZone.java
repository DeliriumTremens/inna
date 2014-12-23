package com.inna.sinai.web.vo;

public class JobZone {
	
	private Integer id;
	private Integer businessUnitId;
	private String businessUnitDescription;
	private String name;
	private String description;
	
	public JobZone(){	
	}
	
	public JobZone(Integer id){
	  this.id = id;
	}
	
	public JobZone(Integer id, Integer businessUnitId){
	  this.id = id;
	  this.businessUnitId = businessUnitId;
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
	public String getBusinessUnitDescription() {
		return businessUnitDescription;
	}
	public void setBusinessUnitDescription(String businessUnitDescription) {
		this.businessUnitDescription = businessUnitDescription;
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

}
