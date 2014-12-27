package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.view.controller.CommonController;
import com.inna.sinai.web.vo.JobSpec;

@Controller
@RequestMapping("catalog/jobSpecs")
public class JobSpecController extends CommonController{
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new JobSpec());
	model.addAttribute("businessUnits", ctService.getAll("glBusinessUnit")); 
	return "catalog/jobSpecs/jobSpecs";
  }
	  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") JobSpec toSearch) {
	model.addAttribute("data", jsService.search(toSearch)); 
	return "catalog/jobSpecs/_rows";
  }
	  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model) {
	model.addAttribute("newRow", new JobSpec());
	model.addAttribute("businessUnits", ctService.getAll("glBusinessUnit")); 
	return "catalog/jobSpecs/_create";
  }
	  
  @RequestMapping("/create.do")
  public String  create(ModelMap model , @ModelAttribute("newRow") JobSpec newRow) {
    jsService.insert(newRow);
	model.addAttribute("infMessage", "msg.insertOK");
	return search(model, newRow);
  }
	  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam Integer id) {
	model.addAttribute("editRow", jsService.searchById(id));
	model.addAttribute("businessUnits", ctService.getAll("glBusinessUnit")); 
	return "catalog/jobSpecs/_edit";
  }
	  
  @RequestMapping("/update.do")
  public String  update(ModelMap model, @ModelAttribute("editRow") JobSpec editRow) {
    jsService.update(editRow);
	model.addAttribute("infMessage", "msg.updateOK");
	return search(model, editRow);
  }
	  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model) {
	return "catalog/jobSpecs/_delete";
  }
	  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model) {
	jsService.delete(rowIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return search(model, null);
  }

}
