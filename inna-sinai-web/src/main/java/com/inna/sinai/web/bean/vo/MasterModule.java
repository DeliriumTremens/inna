package com.inna.sinai.web.bean.vo;

import java.util.List;

import com.inna.sinai.web.bean.vo.dto.Authority;
import com.inna.sinai.web.bean.vo.dto.Module;

public class MasterModule {
	
	private Module module;
	List<Authority> autorities;
	
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public List<Authority> getAutorities() {
		return autorities;
	}
	public void setAutorities(List<Authority> autorities) {
		this.autorities = autorities;
	}
	
	

}
