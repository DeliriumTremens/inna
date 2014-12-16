package com.inna.sinai.common.dao.core;

import java.util.List;

import com.inna.sinai.common.bean.core.CatalogTemplate;

public interface CatalogTemplateDAO {
	
  public List<CatalogTemplate> getAll(String targetName);
  public List<CatalogTemplate> search(CatalogTemplate toSearch, String targetName);
  public void insert(CatalogTemplate row, String targetName);
  public void delete(Integer rowId, String targetName);
  public void update(CatalogTemplate row, String targetName);
  public CatalogTemplate searchById(Integer id, String targetName);

}
