package com.inna.sinai.web.view.controller.core.validation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Session;

@Controller
@RequestMapping("validation/remittence")
public class RemittenceController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	return "validation/remittence/main";
  }
  
  @RequestMapping("/setupNew.do")
  public String  setupNew(ModelMap model, @ModelAttribute Session session){
	return "validation/remittence/newRemittence";
  }
  
  @RequestMapping("/setupLoadResponse.do")
  public String setupLoadResponse(ModelMap model, @ModelAttribute Session session){
	return "validation/remittence/loadResponse";
  }
  
  @RequestMapping("/loadResponse.do")
  public String loadResponse(ModelMap model, @ModelAttribute Session session){
	return "validation/remittence/_response";
  }

}
