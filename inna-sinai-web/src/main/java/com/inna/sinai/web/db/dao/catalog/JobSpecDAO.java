package com.inna.sinai.web.db.dao.catalog;

import java.util.List;

import com.inna.sinai.web.vo.JobSpec;

public interface JobSpecDAO {

  public List<JobSpec> search(JobSpec toSearch);
  public void insert(JobSpec row);
  public void delete(Integer rowId);
  public void update(JobSpec row);
  
}
