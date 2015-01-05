package com.inna.sinai.web.view.controller.core.operation;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Contract;
import com.inna.sinai.web.vo.Session;
import com.inna.sinai.web.vo.WorkTeam;

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
	model.addAttribute("products", getAllProducts());
	model.addAttribute("promotions", getAllPromotions());
	model.addAttribute("techniques", getUsersByRole(4));
	model.addAttribute("paymentTypes", getAllPaymentTypes());
	model.addAttribute("saleForces", getAllSaleForces());
	model.addAttribute("activityPlaces", getAllActivityPlaces());
	model.addAttribute("jobZones", getJobZonesByBusinessUnit(session.getUser()
                                                       .getBusinessUnitId()));  
    return "operation/contract/newContract";
  }
  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") Contract toSearch) {
	List<Contract> data = new ArrayList<Contract>();
	Contract contract = null;
	List<WorkTeam> workTeam = new ArrayList<WorkTeam>();
	WorkTeam worker = new WorkTeam();
	contract = new Contract();
	contract.setId(1);
	contract.setContract("63991450");
	contract.setAccount("501091988060");
    contract.setOpenedDate(new Date());
    contract.setJobZoneDescription("CHIMALHUACAN");
    worker.setTypeId(1);
    worker.setToUserName("Armando Muños Reyes");
    workTeam.add(worker);
    contract.setWorkTeam(workTeam);
    data.add(contract);
    
	workTeam = new ArrayList<WorkTeam>();
	worker = new WorkTeam();
	contract = new Contract();
	contract.setId(2);
	contract.setContract("63991451");
	contract.setAccount("501091988061");
    contract.setOpenedDate(new Date());
    contract.setJobZoneDescription("SAT / CUAUTITLAN IZTALLI");
    worker.setTypeId(1);
    worker.setToUserName("Armando Muños Reyes");
    workTeam.add(worker);
    contract.setWorkTeam(workTeam);
    data.add(contract);
    
	workTeam = new ArrayList<WorkTeam>();
	worker = new WorkTeam();
	contract = new Contract();
	contract.setId(3);
	contract.setContract("63991452");
	contract.setAccount("501091988062");
    contract.setOpenedDate(new Date());
    contract.setJobZoneDescription("SAT / NEZAHUALCOYOTL");
    worker.setTypeId(1);
    worker.setToUserName("Armando Muños Reyes");
    workTeam.add(worker);
    contract.setWorkTeam(workTeam);
    data.add(contract);
    model.addAttribute("data", data); 
	return "operation/contract/_contractTable";
  }
  
  @RequestMapping("/seachInventory.do")
  public String  seachInventory(ModelMap model, @RequestParam Integer techId) {
	 return "operation/contract/_inventory";
  }

}
