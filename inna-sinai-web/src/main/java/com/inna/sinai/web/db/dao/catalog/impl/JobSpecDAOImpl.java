package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.JobSpecDAO;
import com.inna.sinai.web.vo.JobSpec;

@SuppressWarnings("unchecked")
public class JobSpecDAOImpl extends AbstractDAO implements JobSpecDAO {
	
  
  public List<JobSpec> search(JobSpec toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
	sqlQuery.append("SELECT COJS.ID ID , COJS.NAME NAME")
		    .append("    , COJS.BUSINESS_UNIT_ID BUSINESS_UNIT_ID, COJS.COST COST ")
		    .append("    , COJS.DESCRIPTION DESCRIPTION, CGBU.NAME BUSINESS_UNIT_DESCRIPTION ")
			.append("FROM CAT_OP_JOB_SPEC COJS, CAT_GL_BUSINESS_UNIT CGBU ")
			.append("WHERE COJS.BUSINESS_UNIT_ID = CGBU.ID");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
	    sqlQuery.append(" AND COJS.ID = ? ");
	    params.add(toSearch.getId());
	  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
		 sqlQuery.append(" AND COJS.NAME LIKE ? ");
		 params.add("%" + toSearch.getName() + "%");
	  }
	  if(toSearch.getBusinessUnitId() != null && toSearch.getBusinessUnitId() > 0){
		 sqlQuery.append(" AND COJS.BUSINESS_UNIT_ID = ? ");
		 params.add(toSearch.getBusinessUnitId());
	  }
	}
	return (List<JobSpec>) getJdbcTemplate().query(sqlQuery.toString()
				         , params.toArray(), getMapperFor(JobSpec.class));
  }
			  
  public void insert(JobSpec row){
	String sqlQuery = "INSERT INTO CAT_OP_JOB_SPEC(NAME, DESCRIPTION, COST, BUSINESS_UNIT_ID) " 
			    	+ "VALUES (?,?,?,?)";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
			   , row.getDescription(), row.getCost(), row.getBusinessUnitId()});
  }
			  
  public void delete(Integer rowId){
	String sqlQuery = "DELETE FROM CAT_OP_JOB_SPEC WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }
			  
  public void update(JobSpec row){
    String sqlQuery = "UPDATE CAT_OP_JOB_SPEC SET NAME = ?, DESCRIPTION = ? "
					+ "                   , COST = ? , BUSINESS_UNIT_ID = ? "
					+ "WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName(), row.getDescription()
			                   , row.getCost(), row.getBusinessUnitId(), row.getId()});		  
  }


}
