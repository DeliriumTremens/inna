package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.PromotionDAO;
import com.inna.sinai.web.service.catalog.PromotionService;
import com.inna.sinai.web.vo.Promotion;

public class PromotionServiceImpl extends AbstractService 
                                implements PromotionService{

  private PromotionDAO dao;

  public void setDao(PromotionDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<Promotion> getAll() {
	return dao.search(null);
  }

  @Override
  public Promotion searchById(Integer id) {
	List<Promotion> Promotions = dao.search(new Promotion(id));
	return Promotions.size() == 1 ? Promotions.get(0) : null;
  }

  @Override
  public List<Promotion> search(Promotion toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(Promotion row) {
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
  public void update(Promotion row) {
	dao.update(row);	
  }

}
