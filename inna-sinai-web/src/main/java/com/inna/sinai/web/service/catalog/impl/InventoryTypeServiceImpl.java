package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.InventoryTypeDAO;
import com.inna.sinai.web.service.catalog.InventoryTypeService;
import com.inna.sinai.web.vo.LocalInventoryType;

public class InventoryTypeServiceImpl extends AbstractService 
                                implements InventoryTypeService{

  private InventoryTypeDAO dao;

  public void setDao(InventoryTypeDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<LocalInventoryType> getAll() {
	return dao.search(null);
  }

  @Override
  public LocalInventoryType searchById(Integer id) {
	List<LocalInventoryType> InventoryTypes = dao.search(new LocalInventoryType(id));
	return InventoryTypes.size() == 1 ? InventoryTypes.get(0) : null;
  }

  @Override
  public List<LocalInventoryType> search(LocalInventoryType toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(LocalInventoryType row) {
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
  public void update(LocalInventoryType row) {
	dao.update(row);	
  }

}
