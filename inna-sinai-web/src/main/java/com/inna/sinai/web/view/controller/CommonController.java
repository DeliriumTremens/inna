package com.inna.sinai.web.view.controller;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.common.service.core.CatalogTemplateService;
import com.inna.sinai.web.service.catalog.InventoryTypeService;
import com.inna.sinai.web.service.catalog.JobSpecService;
import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.service.catalog.ProductService;
import com.inna.sinai.web.service.catalog.PromotionService;

@SessionAttributes({"session"})
public class CommonController extends AbstractController {
	
  protected CatalogTemplateService ctService = null;
  protected JobZoneService jzService = null;
  protected JobSpecService jsService = null;
  protected InventoryTypeService itService = null;
  protected ProductService pService = null;
  protected PromotionService prService = null;

  public void setCtService(CatalogTemplateService ctService) {
	this.ctService = ctService;
  }

  public void setJzService(JobZoneService jzService) {
	this.jzService = jzService;
  }

  public void setJsService(JobSpecService jsService) {
	this.jsService = jsService;
  }

  public void setItService(InventoryTypeService itService) {
	this.itService = itService;
  }

  public void setpService(ProductService pService) {
	this.pService = pService;
  }

  public void setPrService(PromotionService prService) {
	this.prService = prService;
  }

}
