package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.PromotionDAO;
import com.inna.sinai.web.vo.Promotion;

@SuppressWarnings("unchecked")
public class PromotionDAOImpl extends AbstractDAO implements PromotionDAO {

	
  public List<Promotion> search(Promotion toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
	sqlQuery.append("SELECT COP.ID ID ,COP.NAME NAME , COP.DESCRIPTION DESCRIPTION")
			.append("      , COP.COST COST COP.IS_ACTIVE IS_ACTIVE")
		    .append("FROM CAT_OP_PROMOTION COP");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
		 sqlQuery.append(" AND COP.ID = ? ");
		 params.add(toSearch.getId());
	  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
		 sqlQuery.append(" AND COP.NAME LIKE ? ");
		 params.add("%" + toSearch.getName() + "%");
	  }
	  if(toSearch.isActive()) {
		sqlQuery.append(" AND COP.IS_ACTIVE = ? ");
		params.add(toSearch.isActive());
	  }
	}
	return (List<Promotion>) getJdbcTemplate().query(sqlQuery.toString()
					 , params.toArray(), getMapperFor(Promotion.class));
  }
				  
  public void insert(Promotion row){
    String sqlQuery = "INSERT INTO CAT_OP_PROMOTION(NAME, DESCRIPTION, COST, IS_ACTIVE) " 
				    + "VALUES (?,?,?,?)";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
					    , row.getDescription(), row.getCost(), row.isActive()});
  }
				  
  public void delete(Integer rowId){
	String sqlQuery = "DELETE FROM CAT_OP_PROMOTION WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }
				  
  public void update(Promotion row){
	String sqlQuery = "UPDATE CAT_OP_PROMOTION SET NAME = ?, DESCRIPTION = ? "
				    + "                            , COST = ? , IS_ACTIVE = ?"
					+ "WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{row.getName(), row.getDescription()
			                            , row.getCost(), row.getId(), row.isActive()});		  
  }
}
