package com.inna.sinai.web.view.controller;

import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.web.service.util.CatalogService;

public class CommonController extends AbstractController {
	
  protected CatalogService catService;

  public void setCatService(CatalogService catService) {
	this.catService = catService;
  }
  
}
