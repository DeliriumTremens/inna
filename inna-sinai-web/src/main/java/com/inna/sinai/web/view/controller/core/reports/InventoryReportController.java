package com.inna.sinai.web.view.controller.core.reports;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.vo.ReportSearch;
import com.inna.sinai.web.view.controller.SinaiController;

@Controller
@RequestMapping("report/inventory")
public class InventoryReportController extends SinaiController{
	
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new ReportSearch());
	return "report/inventory/inventoryReport";
  }
  
  @RequestMapping("/search.do")
  public String  search(ModelMap model){
	return "report/inventory/_chart";
  }

}
