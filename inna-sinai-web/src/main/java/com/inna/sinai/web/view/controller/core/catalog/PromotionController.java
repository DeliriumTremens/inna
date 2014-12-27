package com.inna.sinai.web.view.controller.core.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.view.controller.CommonController;
import com.inna.sinai.web.vo.Promotion;

@Controller
@RequestMapping("catalog/promotions")
public class PromotionController extends CommonController {

  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new Promotion());
	return "catalog/promotions/promotions";
  }
	  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") Promotion toSearch) {
	model.addAttribute("data", pService.search(toSearch)); 
	return "catalog/promotions/_rows";
  }
	  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model) {
	model.addAttribute("newRow", new Promotion());
	return "catalog/promotions/_create";
  }
	  
  @RequestMapping("/create.do")
  public String  create(ModelMap model, @ModelAttribute("newRow") Promotion newRow) {
	pService.insert(newRow);
	model.addAttribute("infMessage", "msg.insertOK");
	return search(model, newRow);
  }
	  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdate(ModelMap model, @RequestParam Integer id) {
	model.addAttribute("editRow", pService.searchById(id));
	return "catalog/promotions/_edit";
  }
	  
  @RequestMapping("/update.do")
  public String  update(ModelMap model, @ModelAttribute("editRow") Promotion editRow) {
    pService.update(editRow);
	model.addAttribute("infMessage", "msg.updateOK");
	return search(model, editRow);
  }
	  
  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model) {
	return "catalog/promotions/_delete";
  }
	  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String rowIds, ModelMap model) {
	pService.delete(rowIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return search(model, null);
  }

}
