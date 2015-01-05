package com.inna.sinai.web.view.controller.core.operation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.SinaiController;
import com.inna.sinai.web.vo.Contract;
import com.inna.sinai.web.vo.ServiceOrder;
import com.inna.sinai.web.vo.Session;
import com.inna.sinai.web.vo.WorkTeam;

@Controller
@RequestMapping("operation/serviceOrder")
public class ServiceOrderController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	model.put("toSearch", new ServiceOrder());
	model.addAttribute("jobZones", getJobZonesByBusinessUnit(session.getUser()
			                                           .getBusinessUnitId())); 
	return "operation/serviceOrder/serviceOrder";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @ModelAttribute Session session) {
	model.put("newRow", new ServiceOrder());  
    return "operation/serviceOrder/newServiceOrder";
  }
  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") ServiceOrder toSearch) {
	List<ServiceOrder> data = new ArrayList<ServiceOrder>();
	ServiceOrder serviceOrder = null;
	List<WorkTeam> workTeam = new ArrayList<WorkTeam>();
	WorkTeam worker = new WorkTeam();
	serviceOrder = new ServiceOrder();
	serviceOrder.setId(1);
	serviceOrder.setTypeDescription("Garantia");
	serviceOrder.setStatusDescription("Abierto");
	serviceOrder.setOpenedDate(new Date());
	workTeam = new ArrayList<WorkTeam>();
	worker = new WorkTeam();
	Contract contract = new Contract();
	contract.setId(1);
	contract.setContract("63991450");
	contract.setAccount("501091988060");
    contract.setOpenedDate(new Date());
    contract.setJobZoneDescription("SAT / CUAUTITLAN IZTALLI");
    worker.setTypeId(1);
    worker.setToUserName("Armando Muños Reyes");
    workTeam.add(worker);
    worker = new WorkTeam();
    worker.setTypeId(2);
    worker.setToUserName("Pedro Gomez Campos");
    workTeam.add(worker);
    contract.setWorkTeam(workTeam);
    serviceOrder.setContract(contract);
    data.add(serviceOrder);
    
    serviceOrder = new ServiceOrder();
	serviceOrder.setId(1);
	serviceOrder.setTypeDescription("Cambio de Coordenadas");
	serviceOrder.setStatusDescription("Abierto");
	serviceOrder.setOpenedDate(new Date());
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
    worker = new WorkTeam();
    worker.setTypeId(2);
    worker.setToUserName("Armando Muños Reyes");
    workTeam.add(worker);
    contract.setWorkTeam(workTeam);
    serviceOrder.setContract(contract);
    data.add(serviceOrder);
    
    model.addAttribute("data", data); 
	return "operation/serviceOrder/_serviceOrderTable";
  }
}
