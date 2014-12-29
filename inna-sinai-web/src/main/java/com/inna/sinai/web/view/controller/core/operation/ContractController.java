package com.inna.sinai.web.view.controller.core.operation;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.CommonController;
import com.inna.sinai.web.vo.Contract;
import com.inna.sinai.web.vo.Session;

@Controller
@RequestMapping("operation/contract")
public class ContractController extends CommonController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model, @ModelAttribute Session session){
	model.put("toSearch", new Contract());
	model.addAttribute("jobZones", jzService.searchByBusinessUnit(session
			                            .getUser().getBusinessUnitId())); 
	return "operation/contract/searchContract";
  }
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model, @ModelAttribute Session session) {
	Contract newContract = new Contract();
	newContract.setOpenedDate(new Date());
	model.put("newRow", newContract);
	model.addAttribute("jobZones", jzService.searchByBusinessUnit(session
                                        .getUser().getBusinessUnitId())); 
    return "operation/contract/newContract";
  }

}
