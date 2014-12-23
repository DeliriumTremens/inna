package com.inna.sinai.web.view.controller.core.operation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.view.controller.CommonController;
import com.inna.sinai.web.vo.Contract;

@Controller
@RequestMapping("operation/contract")
public class ContractController extends CommonController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new Contract());
	model.put("jobZones", ctService.searchByIds(new Integer[]{1,2}, "opContractStatus"));
	return "operation/contract/searchContract";
  }

}
