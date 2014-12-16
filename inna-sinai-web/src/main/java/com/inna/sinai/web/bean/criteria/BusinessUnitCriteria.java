package com.inna.sinai.web.bean.criteria;

import static com.inna.sinai.web.constant.Literals.NAME;
import static com.inna.sinai.web.constant.Literals.SEARCH_TYPE_ID_NAME;

import java.util.Arrays;
import java.util.List;

import com.inna.sinai.web.bean.vo.CriteriaTypes;

public class BusinessUnitCriteria {
	
  private List<CriteriaTypes> criteriaTypes;
  private Integer criteriaType;
  private String criteriaValue;
  
  public BusinessUnitCriteria(){
	criteriaTypes = Arrays.asList(
              new CriteriaTypes(SEARCH_TYPE_ID_NAME, NAME));
  }

  public List<CriteriaTypes> getCriteriaTypes() {
	return criteriaTypes;
  }

  public void setCriteriaTypes(List<CriteriaTypes> criteriaTypes) {
	this.criteriaTypes = criteriaTypes;
  }

  public Integer getCriteriaType() {
	return criteriaType;
  }

  public void setCriteriaType(Integer criteriaType) {
	this.criteriaType = criteriaType;
  }

  public String getCriteriaValue() {
	return criteriaValue;
  }

  public void setCriteriaValue(String criteriaValue) {
	this.criteriaValue = criteriaValue;
  }
  
}
