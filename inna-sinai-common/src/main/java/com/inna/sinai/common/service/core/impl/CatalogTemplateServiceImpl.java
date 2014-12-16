package com.inna.sinai.common.service.core.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.bean.core.CatalogTemplateConfig;
import com.inna.sinai.common.dao.core.CatalogTemplateDAO;
import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.common.service.core.CatalogTemplateService;

public class CatalogTemplateServiceImpl extends AbstractService 
                                        implements CatalogTemplateService {
	
  private CatalogTemplateDAO dao = null;

  private Map<String, CatalogTemplateConfig> templates;
  
  public void setDao(CatalogTemplateDAO dao) {
	this.dao = dao;
  }
  
  public List<CatalogTemplate> getAll(String templateName){
	  return dao.getAll(templates.get(templateName).getTarget());
  }

  public void setTemplates(List<CatalogTemplateConfig> templatesConfig) {
	templates = new HashMap<String, CatalogTemplateConfig>();
	for(CatalogTemplateConfig config : templatesConfig){
	  templates.put(config.getName(), config);
	}
  }
  
  public CatalogTemplate searchById(Integer id, String targetName){
	return dao.searchById(id, targetName);  
  }
  
  public List<CatalogTemplate> search(CatalogTemplate toSearch, String targetName){
	return dao.search(toSearch, targetName);  
  }
  public void insert(CatalogTemplate row, String targetName){
	dao.insert(row, targetName);
  }
  
  public void delete(String rowIds, String targetName){
	String [] userIds = rowIds.split(",");
	for(int i=0;i<userIds.length;i++){
	   dao.delete(Integer.valueOf(userIds[i]), targetName);	
	}
	
  }
  public void update(CatalogTemplate row, String targetName){
	dao.update(row, targetName);
  }
  
  public CatalogTemplateConfig getTemplate(String name){
	return templates.get(name);
  }

}
