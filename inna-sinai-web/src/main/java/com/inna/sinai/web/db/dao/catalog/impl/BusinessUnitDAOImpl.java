package com.inna.sinai.web.db.dao.catalog.impl;

import static com.inna.sinai.web.constant.Literals.SEARCH_TYPE_ID_NAME;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.bean.criteria.BusinessUnitCriteria;
import com.inna.sinai.web.bean.vo.dto.BusinessUnit;
import com.inna.sinai.web.db.dao.catalog.BusinessUnitDAO;

@SuppressWarnings("unchecked")
public class BusinessUnitDAOImpl extends AbstractDAO implements BusinessUnitDAO{
	
  
  public List<BusinessUnit> getAll(){
	String sqlQuery = "SELECT * FROM CAT_GL_BUSINESS_UNIT";
	return (List<BusinessUnit>) getJdbcTemplate().query(sqlQuery
					        , getMapperFor(BusinessUnit.class));
  }
  
  public List<BusinessUnit> search(BusinessUnitCriteria searchParams) {
	String sqlQuery = "SELECT * FROM CAT_GL_BUSINESS_UNIT";
	List<Object> params = new ArrayList<Object>();
	if(searchParams.getCriteriaType() != null){
	  if(searchParams.getCriteriaType().equals(SEARCH_TYPE_ID_NAME)){
	    sqlQuery += "WHERE NAME LIKE ? " ;
	    params.add("%" + searchParams.getCriteriaValue() + "%");
	  }
	}
	return (List<BusinessUnit>) getJdbcTemplate().query(sqlQuery, params
			              .toArray(), getMapperFor(BusinessUnit.class));
  }
  
  public void insert(BusinessUnit row){
	String sqlQuery = "INSERT INTO CAT_GL_BUSINESS_UNIT (NAME, DESCRIPTION) " 
	    	        + " VALUES (?,?)";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
			                            , row.getDescription()});
  }
  
  public void delete(Integer rowId){
    String sqlQuery = "DELETE FROM CAT_GL_BUSINESS_UNIT WHERE _ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }
  
  public void update(BusinessUnit row){
	String sqlQuery = "UPDATE CAT_GL_BUSINESS_UNIT SET NAME = ?, DESCRIPTION = ? "
		            + "WHERE _ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
			               , row.getDescription(), row.getId()});
	  
  }

}
