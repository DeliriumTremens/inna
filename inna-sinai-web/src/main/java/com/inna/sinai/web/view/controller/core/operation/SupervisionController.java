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
import com.inna.sinai.web.vo.Session;
import com.inna.sinai.web.vo.Supervision;
import com.inna.sinai.web.vo.WorkTeam;

@Controller
@RequestMapping("operation/supervision")
public class SupervisionController extends SinaiController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	model.put("toSearch", new Supervision());
	model.addAttribute("jobZones", getJobZonesByBusinessUnit(session.getUser()
			                                           .getBusinessUnitId())); 
	return "operation/supervision/supervision";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @ModelAttribute Session session) {
	model.put("newRow", new Supervision());  
    return "operation/supervision/newSupervision";
  }
  
  @RequestMapping("/seach.do")
  public String  search(ModelMap model, @ModelAttribute("toSearch") Supervision toSearch) {
	List<Supervision> data = new ArrayList<Supervision>();
	Supervision supervision = null;
	List<WorkTeam> workTeam = new ArrayList<WorkTeam>();
	WorkTeam worker = new WorkTeam();
	supervision = new Supervision();
	supervision.setId(1);
	supervision.setOpenedDate(new Date());
	supervision.setSupervisorName("Benjamin Galindo Flores");
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
    supervision.setContract(contract);
    data.add(supervision);
    
    model.addAttribute("data", data); 
	return "operation/supervision/_supervisionTable";
  }
}
