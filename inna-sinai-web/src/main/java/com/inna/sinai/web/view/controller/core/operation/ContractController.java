package com.inna.sinai.web.view.controller.core.operation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.common.bean.core.CatalogTemplate;
import com.inna.sinai.web.view.controller.CommonController;

@Controller
@RequestMapping("operation/contract")
public class ContractController extends CommonController {
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new CatalogTemplate());
	return "operation/contract/searchContract";
  }

}
