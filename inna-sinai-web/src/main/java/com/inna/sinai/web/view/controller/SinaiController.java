package com.inna.sinai.web.view.controller;

import java.util.List;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.common.service.core.CatalogTemplateService;
import com.inna.sinai.web.service.catalog.InventoryTypeService;
import com.inna.sinai.web.service.catalog.JobSpecService;
import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.service.catalog.ProductService;
import com.inna.sinai.web.service.catalog.PromotionService;
import com.inna.sinai.web.vo.JobSpec;
import com.inna.sinai.web.vo.JobZone;

@SessionAttributes({"session"})
public class SinaiController extends AbstractController {
	
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

  protected List<JobZone> getJobZonesByBusinessUnit(Integer bussinesUnitId){
	return jzService.searchByBusinessUnit(bussinesUnitId);
  }
  
  protected List<JobSpec> getAllJobSpecs(){
	 return jsService.getAll();
  }
  
  protected List<CatalogTemplate> getAllPaymentTypes(){
    return ctService.getAll("opPaymentType");
  }
  
  protected List<CatalogTemplate> getAllSaleForces(){
	 return ctService.getAll("opSalesForce");
  }
  
  protected List<CatalogTemplate> getAllActivityPlaces(){
	return ctService.getAll("opActivityPlaces");
  }
  
  protected List<CatalogTemplate> getAllProfiles(){
	return ctService.getAll("secProfiles");
  }
  
  protected List<CatalogTemplate> getAllBusinessUnits(){
	return ctService.getAll("glBusinessUnit");
  }
  
  protected List<CatalogTemplate> getAllEmployeeRols(){
	return ctService.getAll("secEmployeeRol");
  }
  
  
}
