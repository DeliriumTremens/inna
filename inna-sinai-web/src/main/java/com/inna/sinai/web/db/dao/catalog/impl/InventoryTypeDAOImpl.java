package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.ArrayList;
import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.db.dao.catalog.InventoryTypeDAO;
import com.inna.sinai.web.vo.InventoryType;

@SuppressWarnings("unchecked")
public class InventoryTypeDAOImpl extends AbstractDAO 
                                  implements InventoryTypeDAO {

	
  @Override
  public List<InventoryType> search(InventoryType toSearch) {
	StringBuilder sqlQuery = new StringBuilder();
	List<Object> params = new ArrayList<Object>();
	sqlQuery.append("SELECT CSIT.ID ID , CSIT.NAME NAME, CSIT.DESCRIPTION DESCRIPTION")
		    .append("     , CSIT.COST COST")
			.append("FROM CAT_ST_ITEM_TYPE CSIT");
	if(toSearch != null){
	  if(toSearch.getId() != null && toSearch.getId() > 0) {
		sqlQuery.append(" WHERE CSIT.ID = ? ");
		params.add(toSearch.getId());
	  }
	  if(toSearch.getName() != null && ! toSearch.getName().trim().equals("")) {
		if(params.size() > 0){
		  sqlQuery.append(" AND CSIT.NAME LIKE ? ");
		} else {
			sqlQuery.append(" WHERE CSIT.NAME LIKE ? ");
		}
		params.add("%" + toSearch.getName() + "%");
	  }
	}
	return (List<InventoryType>) getJdbcTemplate().query(sqlQuery.toString()
		             , params.toArray(), getMapperFor(InventoryType.class));
  }

  @Override
  public void insert(InventoryType row) {
	String sqlQuery = "INSERT INTO CAT_ST_ITEM_TYPE(NAME, DESCRIPTION, COST) " 
	    	        + "VALUES (?,?,?)";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
				         , row.getDescription(), row.getCost()});	
  }

  @Override
  public void delete(Integer rowId) {
	String sqlQuery = "DELETE FROM CAT_ST_ITEM_TYPE WHERE ID = ?";
	getJdbcTemplate().update(sqlQuery, new Object[]{rowId});
  }

  @Override
  public void update(InventoryType row) {
	String sqlQuery = "UPDATE CAT_ST_ITEM_TYPE SET NAME = ?, DESCRIPTION = ?"
                    + "                          , COST = ? "
                    + "WHERE ID = ?";
    getJdbcTemplate().update(sqlQuery, new Object[]{row.getName()
                                     , row.getDescription(), row.getCost()
                                     , row.getId()});		
  }

}
