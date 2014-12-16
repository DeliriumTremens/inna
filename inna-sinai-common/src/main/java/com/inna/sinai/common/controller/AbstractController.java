package com.inna.sinai.common.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("lastSearchParams")
public abstract class AbstractController {

  protected HttpSession session = null;
  
  public static class ATTR {
	public static final String REQ_ERR_MESSAGE = "errMessage";
	public static final String REQ_INF_MESSAGE = "infMessage";
	public static final String REQ_SEARCH_PARAMS = "searchParams";
	public static final String SES_SESSION = "session";
	public static final String SES_LAST_SEARCH_PARAMS = "lastSearchParams";
	
  }
  
  @ModelAttribute(ATTR.SES_SESSION)
	public void setSession(HttpSession session){
	  this.session = session;
	}
  
}
