package com.inna.sinai.web.view.controller.core.reports;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inna.sinai.web.vo.ReportSearch;
import com.inna.sinai.web.view.controller.CommonController;

@Controller
@RequestMapping("report/warranties")
public class WarrantyReportController extends CommonController{
	
	
  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
	model.put("toSearch", new ReportSearch());
	return "report/warranties/warrantyReport";
  }
  
  @RequestMapping("/search.do")
  public String  search(ModelMap model){
	return "report/warranties/_chart";
  }

}
