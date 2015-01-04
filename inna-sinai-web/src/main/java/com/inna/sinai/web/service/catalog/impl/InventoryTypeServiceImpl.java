package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.InventoryTypeDAO;
import com.inna.sinai.web.service.catalog.InventoryTypeService;
import com.inna.sinai.web.vo.InventoryType;

public class InventoryTypeServiceImpl extends AbstractService 
                                implements InventoryTypeService{

  private InventoryTypeDAO dao;

  public void setDao(InventoryTypeDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<InventoryType> getAll() {
	return dao.search(null);
  }

  @Override
  public InventoryType searchById(Integer id) {
	List<InventoryType> InventoryTypes = dao.search(new InventoryType(id));
	return InventoryTypes.size() == 1 ? InventoryTypes.get(0) : null;
  }

  @Override
  public List<InventoryType> search(InventoryType toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(InventoryType row) {
	dao.insert(row);
  }

  @Override
  public void delete(String rowIds) {
	String [] ids = rowIds.split(",");
	for(int i=0;i<ids.length;i++){
	  dao.delete(Integer.valueOf(ids[i]));	
	}	
  }

  @Override
  public void update(InventoryType row) {
	dao.update(row);	
  }

}
