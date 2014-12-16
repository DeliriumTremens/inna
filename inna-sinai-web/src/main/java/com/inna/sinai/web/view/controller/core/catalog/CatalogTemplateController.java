package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.bean.core.CatalogTemplateConfig;
import com.inna.sinai.common.service.core.CatalogTemplateService;

@Controller
@RequestMapping("catalog/template")
public class CatalogTemplateController {
	
  private CatalogTemplateService service = null;
 
  public void setService(CatalogTemplateService service) {
	this.service = service;
  }
  
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @RequestParam String templateName){
	CatalogTemplateConfig config =   service.getTemplate(templateName);
	model.put("config", config);
	model.put("toSearch", new CatalogTemplate());
    return "catalog/template/catalogTemplate";
  }
  
  @RequestMapping("/seach.do")
  public String  searchUser(ModelMap model
		             , @ModelAttribute("toSearch") CatalogTemplate toSearch
		             , @RequestParam String templateName) {
	CatalogTemplateConfig config =   service.getTemplate(templateName);
	model.put("config", config);
    model.addAttribute("data", service.search(toSearch, config.getTarget())); 
    return "catalog/template/_rows";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @RequestParam String templateName) {
	CatalogTemplateConfig config =   service.getTemplate(templateName);
    model.put("config", config);
    model.addAttribute("newRow", new CatalogTemplate());
    return "catalog/template/_create";
  }
  
  @RequestMapping("/create.do")
  public String  create(ModelMap model
		             , @ModelAttribute("newRow") CatalogTemplate newRow
		             , @RequestParam String templateName) {
	service.insert(newRow, service.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.insertOK");
	return searchUser(model, newRow, templateName);
  }
  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam String templateName
		                                       , @RequestParam Integer id) {
	CatalogTemplateConfig config =   service.getTemplate(templateName);
    model.put("config", config);
    model.addAttribute("editRow", service.searchById(id, config.getTarget()));
    return "catalog/template/_edit";
  }
  
  @RequestMapping("/update.do")
  public String  update(ModelMap model
                    , @ModelAttribute("editRow") CatalogTemplate editRow
                    , @RequestParam String templateName) {
	service.update(editRow, service.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.updateOK");
    return searchUser(model, editRow, templateName);
  }
  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model, @RequestParam String templateName) {
	CatalogTemplateConfig config =   service.getTemplate(templateName);
    model.put("config", config);
    return "catalog/template/_delete";
  }
  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model
		                     , @RequestParam String templateName) {
	service.delete(rowIds, service.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.deleteOK");
	return searchUser(model, null, templateName);
  }
  
}
