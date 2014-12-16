package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.bean.core.CatalogTemplateConfig;
import com.inna.sinai.web.view.controller.CommonController;

@Controller
@RequestMapping("catalog/template")
public class CatalogTemplateController extends CommonController {
  
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @RequestParam String templateName){
	model.put("config", ctService.getTemplate(templateName));
	model.put("toSearch", new CatalogTemplate());
    return "catalog/template/catalogTemplate";
  }
  
  @RequestMapping("/seach.do")
  public String  searchUser(ModelMap model
		             , @ModelAttribute("toSearch") CatalogTemplate toSearch
		             , @RequestParam String templateName) {
	CatalogTemplateConfig config =   ctService.getTemplate(templateName);
	model.put("config", config);
    model.addAttribute("data", ctService.search(toSearch, config.getTarget())); 
    return "catalog/template/_rows";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @RequestParam String templateName) {
    model.put("config", ctService.getTemplate(templateName));
    model.addAttribute("newRow", new CatalogTemplate());
    return "catalog/template/_create";
  }
  
  @RequestMapping("/create.do")
  public String  create(ModelMap model
		             , @ModelAttribute("newRow") CatalogTemplate newRow
		             , @RequestParam String templateName) {
	ctService.insert(newRow, ctService.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.insertOK");
	return searchUser(model, newRow, templateName);
  }
  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam String templateName
		                                       , @RequestParam Integer id) {
	CatalogTemplateConfig config = ctService.getTemplate(templateName);
    model.put("config", config);
    model.addAttribute("editRow", ctService.searchById(id, config.getTarget()));
    return "catalog/template/_edit";
  }
  
  @RequestMapping("/update.do")
  public String  update(ModelMap model
                    , @ModelAttribute("editRow") CatalogTemplate editRow
                    , @RequestParam String templateName) {
	ctService.update(editRow, ctService.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.updateOK");
    return searchUser(model, editRow, templateName);
  }
  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model, @RequestParam String templateName) {
    model.put("config", ctService.getTemplate(templateName));
    return "catalog/template/_delete";
  }
  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model
		                     , @RequestParam String templateName) {
	ctService.delete(rowIds, ctService.getTemplate(templateName).getTarget());
	model.addAttribute("infMessage", "msg.deleteOK");
	return searchUser(model, null, templateName);
  }
  
}
