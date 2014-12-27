package com.inna.sinai.web.view.controller;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.common.service.core.CatalogTemplateService;
import com.inna.sinai.web.service.catalog.JobSpecService;
import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.service.catalog.PromotionService;

@SessionAttributes({"session"})
public class CommonController extends AbstractController {
	
  protected CatalogTemplateService ctService = null;
  protected JobZoneService jzService = null;
  protected JobSpecService jsService = null;
  protected PromotionService pService = null;

  public void setCtService(CatalogTemplateService ctService) {
	this.ctService = ctService;
  }

  public void setJzService(JobZoneService jzService) {
	this.jzService = jzService;
  }

  public void setJsService(JobSpecService jsService) {
	this.jsService = jsService;
  }

  public void setpService(PromotionService pService) {
	this.pService = pService;
  }

}
