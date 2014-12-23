package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.JobZoneDAO;
import com.inna.sinai.web.vo.JobZone;

@SuppressWarnings("unchecked")
public class JobZoneDAOImpl extends AbstractDAO  implements JobZoneDAO {
	  
  public List<JobZone> search(JobZone toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
    sqlQuery.append("SELECT COJZ.ID ID, COJZ.BUSINESS_UNIT_ID  BUSINESS_UNIT_ID")
			.append("    , CGBU.NAME BUSINESS_UNIT_DESCRIPTION, COJZ.NAME NAME")
			.append("    , COJZ.DESCRIPTION DESCRIPTION ")
			.append("FROM CAT_OP_JOB_ZONE COJZ, CAT_GL_BUSINESS_UNIT CGBU ")
			.append("WHERE COJZ.BUSINESS_UNIT_ID = CGBU.ID");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
		    sqlQuery.append(" AND ID = ? ");
		    params.add(toSearch.getId());
	  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
	    sqlQuery.append(" AND NAME LIKE ? ");
	    params.add("%" + toSearch.getName() + "%");
      }
	  if(toSearch.getBusinessUnitId() != null && toSearch.getBusinessUnitId() > 0){
		sqlQuery.append(" AND BUSINESS_UNIT_ID = ? ");
		params.add(toSearch.getName());
	  }
	}
	return (List<JobZone>) getJdbcTemplate().query(sqlQuery.toString()
			         , params.toArray(), getMapperFor(JobZone.class));
  }
		  
  public void insert(JobZone row){
	String sqlQuery = "INSERT INTO CAT_OP_JOB_ZONE(NAME, DESCRIPTION, BUSINESS_UNIT_ID) " 
		    	    + "VALUES (?,?,?)";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
					          , row.getDescription(), row.getBusinessUnitId()});
  }
		  
  public void delete(Integer rowId){
	String sqlQuery = "DELETE FROM CAT_OP_JOB_ZONE WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }
		  
  public void update(JobZone row){
    String sqlQuery = "UPDATE CAT_OP_JOB_ZONE SET NAME = ?, DESCRIPTION = ? "
				                                  + ", BUSINESS_UNIT_ID = ? "
				    + "WHERE ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
					           , row.getDescription(), row.getBusinessUnitId()
					                                          , row.getId()});		  
  }

}
