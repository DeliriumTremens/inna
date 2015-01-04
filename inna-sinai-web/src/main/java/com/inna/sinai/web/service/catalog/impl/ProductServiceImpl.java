package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.ProductDAO;
import com.inna.sinai.web.service.catalog.ProductService;
import com.inna.sinai.web.vo.Product;

public class ProductServiceImpl extends AbstractService 
                                implements ProductService{

  private ProductDAO dao;

  public void setDao(ProductDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<Product> getAll() {
	return dao.search(null);
  }

  @Override
  public Product searchById(Integer id) {
	List<Product> Products = dao.search(new Product(id));
	return Products.size() == 1 ? Products.get(0) : null;
  }

  @Override
  public List<Product> search(Product toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(Product row) {
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
  public void update(Product row) {
	dao.update(row);	
  }

}
