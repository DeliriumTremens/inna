package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.InventoryType;

public interface InventoryTypeDAO {
	
  public List<InventoryType> search(InventoryType toSearch);
  public void insert(InventoryType row);
  public void delete(Integer rowId);
  public void update(InventoryType row);

}
