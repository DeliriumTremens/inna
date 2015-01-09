package com.inna.sinai.web.view.controller.core.finance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Session;

@Controller
@RequestMapping("finance/payRoll")
public class PayRollController extends SinaiController {
  
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	return "finance/payRoll/main";
  }
  
  @RequestMapping("/search.do")
  public String  search(ModelMap model, @ModelAttribute Session session){
	return "finance/payRoll/_payRoll";
  }
}
