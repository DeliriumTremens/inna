package com.inna.sinai.web.view.controller.core.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Session;

@Controller
@RequestMapping("admin/changePassword")
public class ChangePasswordController extends SinaiController {
  
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	return "admin/changePassword/main";
  }
}
