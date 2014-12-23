package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.JobZone;

public interface JobZoneDAO {
	
  public List<JobZone> search(JobZone toSearch);
  public void insert(JobZone row);
  public void delete(Integer rowId);
  public void update(JobZone row);

}
