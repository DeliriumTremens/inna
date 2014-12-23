package com.inna.sinai.web.service.catalog.impl;

import java.util.List;

import com.inna.sinai.common.service.AbstractService;
import com.inna.sinai.web.db.dao.catalog.JobSpecDAO;
import com.inna.sinai.web.service.catalog.JobSpecService;
import com.inna.sinai.web.vo.JobSpec;

public class JobSpecServiceImpl extends AbstractService 
                                implements JobSpecService{

  private JobSpecDAO dao;

  public void setDao(JobSpecDAO dao) {
	this.dao = dao;
  }

  @Override
  public List<JobSpec> getAll() {
	return dao.search(null);
  }

  @Override
  public JobSpec searchById(Integer id) {
	List<JobSpec> jobSpecs = dao.search(new JobSpec(id));
	return jobSpecs.size() == 1 ? jobSpecs.get(0) : null;
  }

  @Override
  public List<JobSpec> search(JobSpec toSearch) {
	return dao.search(toSearch);
  }

  @Override
  public void insert(JobSpec row) {
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
  public void update(JobSpec row) {
	dao.update(row);	
  }

}
