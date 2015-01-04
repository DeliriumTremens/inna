package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.InventoryType;

public interface InventoryTypeService {
	
  public List<InventoryType> getAll();
  public InventoryType searchById(Integer id);
  public List<InventoryType> search(InventoryType toSearch);
  public void insert(InventoryType row);
  public void delete(String rowIds);
  public void update(InventoryType row);

}
