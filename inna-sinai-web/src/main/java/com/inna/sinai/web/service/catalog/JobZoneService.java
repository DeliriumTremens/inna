package com.inna.sinai.web.service.catalog;

import java.util.List;

import com.inna.sinai.web.vo.JobZone;

public interface JobZoneService {
	
  public List<JobZone> getAll();
  public JobZone searchById(Integer id);
  public List<JobZone> search(JobZone toSearch);
  public void insert(JobZone row);
  public void delete(String rowIds);
  public void update(JobZone row);

}
