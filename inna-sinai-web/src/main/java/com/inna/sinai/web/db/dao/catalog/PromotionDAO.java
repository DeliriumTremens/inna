package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.Promotion;

public interface PromotionDAO {

  public List<Promotion> search(Promotion toSearch);
  public void insert(Promotion row);
  public void delete(Integer rowId);
  public void update(Promotion row);
  
}
