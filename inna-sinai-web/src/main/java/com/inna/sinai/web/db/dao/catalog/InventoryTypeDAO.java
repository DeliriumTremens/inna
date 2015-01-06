package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.LocalInventoryType;

public interface InventoryTypeDAO {
	
  public List<LocalInventoryType> search(LocalInventoryType toSearch);
  public void insert(LocalInventoryType row);
  public void delete(Integer rowId);
  public void update(LocalInventoryType row);

}
