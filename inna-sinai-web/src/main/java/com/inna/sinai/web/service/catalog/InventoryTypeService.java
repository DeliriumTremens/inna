package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.LocalInventoryType;

public interface InventoryTypeService {
	
  public List<LocalInventoryType> getAll();
  public LocalInventoryType searchById(Integer id);
  public List<LocalInventoryType> search(LocalInventoryType toSearch);
  public void insert(LocalInventoryType row);
  public void delete(String rowIds);
  public void update(LocalInventoryType row);

}
