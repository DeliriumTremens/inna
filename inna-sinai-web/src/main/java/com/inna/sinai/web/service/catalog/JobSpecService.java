package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.JobSpec;

public interface JobSpecService {
	
  public List<JobSpec> getAll();
  public JobSpec searchById(Integer id);
  public List<JobSpec> search(JobSpec toSearch);
  public void insert(JobSpec row);
  public void delete(String rowIds);
  public void update(JobSpec row);

}
