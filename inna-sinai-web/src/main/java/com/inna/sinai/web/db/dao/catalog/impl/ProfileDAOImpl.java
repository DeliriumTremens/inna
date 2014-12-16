package com.inna.sinai.web.db.dao.catalog.impl;

import java.util.List;

import com.inna.sinai.common.dao.AbstractDAO;
import com.inna.sinai.web.bean.vo.dto.Profile;
import com.inna.sinai.web.db.dao.catalog.ProfileDAO;

@SuppressWarnings("unchecked")
public class ProfileDAOImpl extends AbstractDAO implements ProfileDAO {
	
  public List<Profile> getAll(){
	String sqlQuery = "SELECT * FROM CAT_SEC_PROFILES";
	return (List<Profile>) getJdbcTemplate().query(sqlQuery
				            , getMapperFor(Profile.class));
  }

}
