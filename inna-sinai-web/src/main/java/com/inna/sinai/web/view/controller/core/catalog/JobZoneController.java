package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.view.controller.CommonController;
import com.inna.sinai.web.vo.JobZone;

@Controller
@RequestMapping("catalog/jobZones")
public class JobZoneController extends CommonController {
	
  private JobZoneService service;
  
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new JobZone());
	return "catalog/jobZones/jobZones";
  }
  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") JobZone toSearch) {
    model.addAttribute("data", service.search(toSearch)); 
    return "catalog/jobZones/_rows";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model) {
    model.addAttribute("newRow", new JobZone());
    return "catalog/jobZones/_create";
  }
  
  @RequestMapping("/create.do")
  public String  create(ModelMap model
		             , @ModelAttribute("newRow") JobZone newRow) {
	  service.insert(newRow);
	model.addAttribute("infMessage", "msg.insertOK");
	return search(model, newRow);
  }
  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam Integer id) {
    model.addAttribute("editRow", service.searchById(id));
    return "catalog/jobZones/_edit";
  }
  
  @RequestMapping("/update.do")
  public String  update(ModelMap model, @ModelAttribute("editRow") JobZone editRow) {
	service.update(editRow);
	model.addAttribute("infMessage", "msg.updateOK");
    return search(model, editRow);
  }
  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model) {
    return "catalog/jobZones/_delete";
  }
  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model) {
    service.delete(rowIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return search(model, null);
  }

}