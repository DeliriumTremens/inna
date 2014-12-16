package com.inna.sinai.web.service.util;

import com.inna.sinai.web.db.dao.catalog.BusinessUnitDAO;
import com.inna.sinai.web.db.dao.catalog.EmployeeRolDAO;
import com.inna.sinai.web.db.dao.catalog.ProfileDAO;

public interface CatalogService {
	
  public BusinessUnitDAO getBusinessUnitDAO();
  public EmployeeRolDAO getEmployeeRolDAO();
  public ProfileDAO getProfileDAO();

}
