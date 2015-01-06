package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.LocalInventoryType;

@Controller
@RequestMapping("catalog/inventoryTypes")
public class InventoryTypeController extends SinaiController{
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new LocalInventoryType());
	return "catalog/inventoryTypes/inventoryTypes";
  }
	  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") LocalInventoryType toSearch) {
	model.addAttribute("data", itService.search(toSearch)); 
	return "catalog/inventoryTypes/_rows";
  }
	  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model) {
	model.addAttribute("newRow", new LocalInventoryType());
	return "catalog/inventoryTypes/_create";
  }
	  
  @RequestMapping("/create.do")
  public String  create(ModelMap model , @ModelAttribute("newRow") LocalInventoryType newRow) {
    itService.insert(newRow);
	model.addAttribute("infMessage", "msg.insertOK");
	return search(model, newRow);
  }
	  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam Integer id) {
	model.addAttribute("editRow", itService.searchById(id));
	return "catalog/inventoryTypes/_edit";
  }
	  
  @RequestMapping("/update.do")
  public String  update(ModelMap model, @ModelAttribute("editRow") LocalInventoryType editRow) {
    itService.update(editRow);
	model.addAttribute("infMessage", "msg.updateOK");
	return search(model, editRow);
  }
	  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model) {
	return "catalog/inventoryTypes/_delete";
  }
	  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model) {
	itService.delete(rowIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return search(model, null);
  }

}
