package com.inna.sinai.web.view.controller.core.operation;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Contract;
import com.inna.sinai.web.vo.Session;

@Controller
@RequestMapping("operation/contract")
public class ContractController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	model.put("toSearch", new Contract());
	model.addAttribute("jobZones", getJobZonesByBusinessUnit(session.getUser()
			                                           .getBusinessUnitId())); 
	return "operation/contract/searchContract";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @ModelAttribute Session session) {
	model.put("newRow", new Contract());
	model.addAttribute("jobSpecs", getAllJobSpecs());
	model.addAttribute("paymentTypes", getAllPaymentTypes());
	model.addAttribute("saleForces", getAllSaleForces());
	model.addAttribute("activityPlaces", getAllActivityPlaces());
	model.addAttribute("jobZones", getJobZonesByBusinessUnit(session.getUser()
                                                       .getBusinessUnitId()));  
    return "operation/contract/newContract";
  }

}
