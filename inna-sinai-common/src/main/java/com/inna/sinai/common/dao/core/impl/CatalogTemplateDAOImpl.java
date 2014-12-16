package com.inna.sinai.common.dao.core.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.common.dao.core.CatalogTemplateDAO;

@SuppressWarnings("unchecked")
public class CatalogTemplateDAOImpl extends AbstractDAO 
                        implements CatalogTemplateDAO {
  
  public List<CatalogTemplate> getAll(String targetName){
	String sqlQuery = "SELECT * FROM " + targetName;
	return (List<CatalogTemplate>) getJdbcTemplate().query(sqlQuery
						    , getMapperFor(CatalogTemplate.class));
  }
	  
  public CatalogTemplate searchById(Integer id, String targetName) {
	String sqlQuery = "SELECT * FROM " + targetName + " WHERE ID = ?";	
	return (CatalogTemplate) getJdbcTemplate().queryForObject(sqlQuery
			 , new Object[]{id}, getMapperFor(CatalogTemplate.class));
  }
  
  public List<CatalogTemplate> search(CatalogTemplate toSearch, String targetName) {
	String sqlQuery = "SELECT * FROM " + targetName;
	List<Object> params = new ArrayList<Object>();
	if(toSearch != null && toSearch.getName() != null && ! toSearch.getName()
			                                            .trim().equals("")) {
	    sqlQuery += " WHERE NAME LIKE ? " ;
	    params.add("%" + toSearch.getName() + "%");
	}
	return (List<CatalogTemplate>) getJdbcTemplate().query(sqlQuery, params
				          .toArray(), getMapperFor(CatalogTemplate.class));
  }
	  
  public void insert(CatalogTemplate row, String targetName){
	String sqlQuery = "INSERT INTO " + targetName + "(NAME, DESCRIPTION) " 
	    	        + "VALUES (?,?)";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
				                        , row.getDescription()});
  }
	  
  public void delete(Integer rowId, String targetName){
	String sqlQuery = "DELETE FROM " + targetName + " WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }
	  
  public void update(CatalogTemplate row, String targetName){
	String sqlQuery = "UPDATE " + targetName + " SET NAME = ?, DESCRIPTION = ? "
			        + "WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
				           , row.getDescription(), row.getId()});		  
  }
  
  

}
