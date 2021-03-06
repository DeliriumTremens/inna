package com.inna.sinai.common.bean.core;

public class CatalogTemplateConfig {
	
  private String name;
  private String target;
  private String text;
  
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getTarget() {
	return target;
  }
  public void setTarget(String target) {
	this.target = target;
  }
  public String getText() {
	return text;
  }
  public void setText(String text) {
	this.text = text;
  }
  @Override
  public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
  }
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CatalogTemplateConfig other = (CatalogTemplateConfig) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
  }
  
  

}
