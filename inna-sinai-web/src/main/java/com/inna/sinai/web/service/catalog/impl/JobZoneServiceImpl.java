package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.JobZoneDAO;
import com.inna.sinai.web.service.catalog.JobZoneService;
import com.inna.sinai.web.vo.JobZone;

public class JobZoneServiceImpl extends AbstractService implements JobZoneService{

  private JobZoneDAO dao;


  public void setDao(JobZoneDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<JobZone> getAll() {
	return dao.search(null);
  }
  
  @Override
  public List<JobZone> searchByBusinessUnit(Integer businessUnitId) {
	return dao.search(new JobZone(0, businessUnitId));
  }

  @Override
  public JobZone searchById(Integer id) {
	List<JobZone> jobZones = dao.search(new JobZone(id));
	return jobZones.size() == 1 ? jobZones.get(0) :  null;
  }

  @Override
  public List<JobZone> search(JobZone toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(JobZone row) {
	dao.insert(row);
  }

  @Override
  public void delete(String rowIds) {
	String [] ids = rowIds.split(",");
	for(int i=0;i<ids.length;i++){
	  dao.delete(Integer.valueOf(ids[i]));	
	}
  }

  @Override
  public void update(JobZone row) {
	dao.update(row);
  }

}
