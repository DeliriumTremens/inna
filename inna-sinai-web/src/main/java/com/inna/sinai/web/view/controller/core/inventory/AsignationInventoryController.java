package com.inna.sinai.web.view.controller.core.inventory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Session;


@Controller
@RequestMapping("inventory/asignation")
public class AsignationInventoryController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	return "inventory/asignation/main";
  }
  
  @RequestMapping("/search.do")
  public String  search(ModelMap model, @RequestParam Integer techId){
	model.addAttribute("localInventory", getAllLocalInventoryTypes());
	model.addAttribute("testNumber", 2); 
	return "inventory/asignation/_inventory";
  }
}
