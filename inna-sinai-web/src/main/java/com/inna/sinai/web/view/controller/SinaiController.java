package com.inna.sinai.web.view.controller;

import java.util.List;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.common.controller.AbstractController;
import com.inna.sinai.common.service.core.CatalogTemplateService;
import com.inna.sinai.web.service.admin.UserAdminService;
import com.inna.sinai.web.service.catalog.InventoryTypeService;
import com.inna.sinai.web.service.catalog.JobSpecService;
import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.service.catalog.ProductService;
import com.inna.sinai.web.service.catalog.PromotionService;
import com.inna.sinai.web.vo.LocalInventoryType;
import com.inna.sinai.web.vo.JobSpec;
import com.inna.sinai.web.vo.JobZone;
import com.inna.sinai.web.vo.MasterUser;
import com.inna.sinai.web.vo.Product;
import com.inna.sinai.web.vo.Promotion;

@SessionAttributes({"session"})
public class SinaiController extends AbstractController {
	
  protected CatalogTemplateService ctService = null;
  protected JobZoneService jzService = null;
  protected JobSpecService jsService = null;
  protected InventoryTypeService itService = null;
  protected ProductService pService = null;
  protected PromotionService prService = null;
  protected UserAdminService usrService;

  public void setUsrService(UserAdminService usrService) {
	this.usrService = usrService;
  }

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
  
  protected List<Product> getAllProducts(){
    return pService.getAll();
  }
  
  protected List<Promotion> getAllPromotions(){
	 return prService.getAll();
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
  
  protected List<MasterUser> getUsersByRole(Integer roleId){
	MasterUser toSearch = new MasterUser();
	toSearch.getUser().setEmployeeRolId(roleId);
	return usrService.searchMasterUsers(toSearch);
  }
  
  protected List<CatalogTemplate> getAllBusinessUnits(){
	return ctService.getAll("glBusinessUnit");
  }
  
  protected List<CatalogTemplate> getAllEmployeeRols(){
	return ctService.getAll("secEmployeeRol");
  }
  
  protected List<LocalInventoryType> getAllLocalInventoryTypes(){
	return itService.getAll();
  }
  
  protected List<CatalogTemplate> getAllSkyInventoryTypes(){
		return ctService.getAll("secEmployeeRol");
	  }
  
  
}
