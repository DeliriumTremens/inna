package com.inna.sinai.web.view.controller;

import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.common.service.core.CatalogTemplateService;

public class CommonController extends AbstractController {
	
	protected CatalogTemplateService ctService = null;

	public CatalogTemplateService getCtService() {
		return ctService;
	}

	public void setCtService(CatalogTemplateService ctService) {
		this.ctService = ctService;
	}
  
}
