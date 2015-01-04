package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.ProductDAO;
import com.inna.sinai.web.vo.Product;

@SuppressWarnings("unchecked")
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

	
  @Override
  public List<Product> search(Product toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
	sqlQuery.append("SELECT COPR.ID ID , COPR.NAME NAME, COPR.DESCRIPTION DESCRIPTION")
		    .append("     , COPR.BONUS_COST BONUS_COST, COPR.IS_ACTIVE IS_ACTIVE")
		    .append("     , COPR.BUSINESS_UNIT_ID BUSINESS_UNIT_ID, CGBU.NAME BUSINESS_UNIT_NAME ")
			.append("FROM CAT_OP_PRODUCT COPR, CAT_GL_BUSINESS_UNIT CGBU ")
			.append("WHERE COPR.BUSINESS_UNIT_ID = CGBU.ID");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
		sqlQuery.append(" AND COPR.ID = ? ");
		params.add(toSearch.getId());
	  }
	  if(toSearch.getBusinessUnitId() != null && toSearch.getBusinessUnitId() > 0) {
			sqlQuery.append(" AND COPR.BUSINESS_UNIT_ID = ? ");
			params.add(toSearch.getBusinessUnitId());
		  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
		sqlQuery.append(" AND COPR.NAME LIKE ? ");
		params.add("%" + toSearch.getName() + "%");
	  }
	  if(toSearch.getIsActive()){
		sqlQuery.append(" AND COPR.IS_ACTIVE = ? ");
		params.add(toSearch.getIsActive());
	  }
	}
	return (List<Product>) getJdbcTemplate().query(sqlQuery.toString()
		             , params.toArray(), getMapperFor(Product.class));
  }

  @Override
  public void insert(Product row) {
	String sqlQuery = "INSERT INTO CAT_OP_PRODUCT(BUSINESS_UNIT_ID, NAME"
			        + "            , DESCRIPTION, BONUS_COST, IS_ACTIVE) " 
	    	        + "VALUES (?,?,?,?,?)";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getBusinessUnitId()
    		   , row.getName(), row.getDescription() , row.getBonusCost()
    		                                         , row.getIsActive()});	
  }

  @Override
  public void delete(Integer rowId) {
	String sqlQuery = "DELETE FROM CAT_OP_PRODUCT WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }

  @Override
  public void update(Product row) {
	String sqlQuery = "UPDATE CAT_OP_PRODUCT SET NAME = ?, DESCRIPTION = ?"
                    + "             , BUSINESS_UNIT_ID = ?, BONUS_COST = ?"
                    + "             , IS_ACTIVE = ? "
                    + "WHERE ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
                         , row.getDescription(), row.getBusinessUnitId()
                         , row.getBonusCost(), row.getIsActive(), row.getId()});		
  }

}
