package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.Product;

public interface ProductDAO {
	
  public List<Product> search(Product toSearch);
  public void insert(Product row);
  public void delete(Integer rowId);
  public void update(Product row);

}
