package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.PromotionDAO;
import com.inna.sinai.web.vo.Promotion;

@SuppressWarnings("unchecked")
public class PromotionDAOImpl extends AbstractDAO implements PromotionDAO {

	
  @Override
  public List<Promotion> search(Promotion toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
	sqlQuery.append("SELECT COP.ID ID , COP.NAME NAME, COP.DESCRIPTION DESCRIPTION")
		    .append("     , COP.INSTALLATION_COST INSTALLATION_COST, COP.IS_ACTIVE IS_ACTIVE")
		    .append("     , COP.BUSINESS_UNIT_ID BUSINESS_UNIT_ID, CGBU.NAME BUSINESS_UNIT_NAME ")
			.append("FROM CAT_OP_PROMOTION COP, CAT_GL_BUSINESS_UNIT CGBU ")
			.append("WHERE COP.BUSINESS_UNIT_ID = CGBU.ID");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
		sqlQuery.append(" AND COP.ID = ? ");
		params.add(toSearch.getId());
	  }
	  if(toSearch.getBusinessUnitId() != null && toSearch.getBusinessUnitId() > 0) {
			sqlQuery.append(" AND COP.BUSINESS_UNIT_ID = ? ");
			params.add(toSearch.getBusinessUnitId());
		  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
		sqlQuery.append(" AND COP.NAME LIKE ? ");
		params.add("%" + toSearch.getName() + "%");
	  }
	  if(toSearch.getIsActive()){
		sqlQuery.append(" AND COP.IS_ACTIVE = ? ");
		params.add(toSearch.getIsActive());
	  }
	}
	return (List<Promotion>) getJdbcTemplate().query(sqlQuery.toString()
		             , params.toArray(), getMapperFor(Promotion.class));
  }

  @Override
  public void insert(Promotion row) {
	String sqlQuery = "INSERT INTO CAT_OP_PROMOTION(BUSINESS_UNIT_ID, NAME"
			        + "            , DESCRIPTION, INSTALLATION_COST, IS_ACTIVE) " 
	    	        + "VALUES (?,?,?,?,?)";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getBusinessUnitId()
    		   , row.getName(), row.getDescription() , row.getInstallationCost()
    		                                              , row.getIsActive()});	
  }

  @Override
  public void delete(Integer rowId) {
	String sqlQuery = "DELETE FROM CAT_OP_PROMOTION WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }

  @Override
  public void update(Promotion row) {
	String sqlQuery = "UPDATE CAT_OP_PROMOTION SET NAME = ?, DESCRIPTION = ?"
                    + "             , BUSINESS_UNIT_ID = ?, INSTALLATION_COST = ?"
                    + "             , IS_ACTIVE = ? "
                    + "WHERE ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
                                     , row.getDescription(), row.getBusinessUnitId()
                                     , row.getInstallationCost(), row.getIsActive()
                                     , row.getId()});		
  }

}
