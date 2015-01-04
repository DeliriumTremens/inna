package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.Product;

public interface ProductService {
	
  public List<Product> getAll();
  public Product searchById(Integer id);
  public List<Product> search(Product toSearch);
  public void insert(Product row);
  public void delete(String rowIds);
  public void update(Product row);

}
