package com.inna.sinai.web.view.controller.core.inventory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Session;


@Controller
@RequestMapping("inventory/sky")
public class SkyInventoryController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	model.addAttribute("types", getAllSkyInventoryTypes()); 
	return "inventory/sky/main";
  }

}
