package com.inna.sinai.web.view.controller.core.security;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.vo.UserCredential;
import com.inna.sinai.web.service.security.LoginService;
import com.inna.sinai.web.view.controller.CommonController;

@Controller
public class LoginController extends CommonController {
	
  private LoginService service;
  
  public void setService(LoginService service) {
	this.service = service;
  }

  @RequestMapping("/login.do")
  public String  setupSingUp(ModelMap model){
	 model.addAttribute("userCredential", new UserCredential()); 
     return "security/login";
  }
  
  @RequestMapping("/singUp.do")
  public String singUp(@ModelAttribute UserCredential userCredential
		     , ModelMap model, HttpSession session) throws Exception {
	UserCredential credential = service.getFullCredential(userCredential);
	String errMessage = null;
	if(credential == null){
		errMessage = "err.badUser";
	} else if(credential.getIsLocked()){
		errMessage = "err.lockedUser";
	} else if(!service.isPasswordCorrect(userCredential, credential)){
		errMessage = "err.wrongPassword";
	}
	if(errMessage != null){
	  model.addAttribute("errMessage", errMessage);
	  model.addAttribute("userCredential", userCredential); 
	  return "security/login";
	}
	session.setAttribute("session", service.getSession(credential.getUserId()));
    return "layout/container/main";
  }

}
