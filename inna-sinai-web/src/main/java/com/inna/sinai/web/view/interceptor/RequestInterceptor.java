package com.inna.sinai.web.view.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class RequestInterceptor extends HandlerInterceptorAdapter {
  
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response
		                                    , Object handler) throws Exception {
	return true;
  }

}
