package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.Promotion;

public interface PromotionService {
	
  public List<Promotion> getAll();
  public Promotion searchById(Integer id);
  public List<Promotion> search(Promotion toSearch);
  public void insert(Promotion row);
  public void delete(String rowIds);
  public void update(Promotion row);

}
