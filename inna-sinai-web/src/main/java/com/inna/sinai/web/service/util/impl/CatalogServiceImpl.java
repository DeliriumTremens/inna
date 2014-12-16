package com.inna.sinai.web.service.util.impl;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.BusinessUnitDAO;
import com.inna.sinai.web.db.dao.catalog.EmployeeRolDAO;
import com.inna.sinai.web.db.dao.catalog.ProfileDAO;
import com.inna.sinai.web.service.util.CatalogService;

public class CatalogServiceImpl extends AbstractService implements CatalogService{
	
  private BusinessUnitDAO businessUnitDAO;
  private EmployeeRolDAO employeeRolDAO;
  private ProfileDAO profileDAO;
  
  public BusinessUnitDAO getBusinessUnitDAO() {
	return businessUnitDAO;
  }
  public void setBusinessUnitDAO(BusinessUnitDAO businessUnitDAO) {
	this.businessUnitDAO = businessUnitDAO;
  }
  public EmployeeRolDAO getEmployeeRolDAO() {
	return employeeRolDAO;
  }
  public void setEmployeeRolDAO(EmployeeRolDAO employeeRolDAO) {
	this.employeeRolDAO = employeeRolDAO;
  }
  public ProfileDAO getProfileDAO() {
	return profileDAO;
  }
  public void setProfileDAO(ProfileDAO profileDAO) {
	this.profileDAO = profileDAO;
  }

}
