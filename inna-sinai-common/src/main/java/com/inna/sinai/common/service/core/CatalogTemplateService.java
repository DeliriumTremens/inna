package com.inna.sinai.common.service.core;

import java.util.List;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.bean.core.CatalogTemplateConfig;

public interface CatalogTemplateService {
	
  public List<CatalogTemplate> getAll(String targetName);
  public List<CatalogTemplate> search(CatalogTemplate toSearch, String targetName);
  public List<CatalogTemplate> searchByIds(Integer[] ids, String targetName);
  public void insert(CatalogTemplate row, String targetName);
  public void delete(String rowIds, String targetName);
  public void update(CatalogTemplate row, String targetName);
  public CatalogTemplateConfig getTemplate(String name);
  public CatalogTemplate searchById(Integer id, String targetName);

}
