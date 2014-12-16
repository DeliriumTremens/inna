package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.bean.vo.dto.EmployeeRol;
import com.inna.sinai.web.db.dao.catalog.EmployeeRolDAO;

@SuppressWarnings("unchecked")
public class EmployeeRolDAOImpl extends AbstractDAO implements EmployeeRolDAO {
	
  
  public List<EmployeeRol> getAll(){
	String sqlQuery = "SELECT * FROM CAT_SEC_EMPLOYEE_ROL";
	return (List<EmployeeRol>) getJdbcTemplate().query(sqlQuery
					        , getMapperFor(EmployeeRol.class));
  }

}
