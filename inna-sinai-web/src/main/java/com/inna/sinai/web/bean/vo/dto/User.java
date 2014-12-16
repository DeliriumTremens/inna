package com.inna.sinai.web.bean.vo.dto;

import com.inna.sinai.common.bean.AbstractBean;


public class User extends AbstractBean{
	
  private Integer id;
  private String name;
  private String lastName;
  private String middleName;
  private String mail;
  private Integer businessUnitId;
  private Integer employeeRolId;
  private String businessUnitName = null;
  private String employeeTypeName = null;
	
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getEmployeeRolId() {
		return employeeRolId;
	}
	public void setEmployeeRolId(Integer employeeRolId) {
		this.employeeRolId = employeeRolId;
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
  public String getEmployeeTypeName() {
	return employeeTypeName;
  }
  public void setEmployeeTypeName(String employeeTypeName) {
	this.employeeTypeName = employeeTypeName;
  }

}
