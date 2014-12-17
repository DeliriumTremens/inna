package com.inna.sinai.web.bean.vo;

import java.util.Date;

public class ReportSearch {
	
  private Date initialDate;
  private Date finalDate;
  
  public Date getInitialDate() {
	return initialDate;
  }
  public void setInitialDate(Date initialDate) {
	this.initialDate = initialDate;
  }
  public Date getFinalDate() {
	return finalDate;
  }
  public void setFinalDate(Date finalDate) {
	this.finalDate = finalDate;
  }

}
