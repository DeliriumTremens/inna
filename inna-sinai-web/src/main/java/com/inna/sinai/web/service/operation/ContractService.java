package com.inna.sinai.web.service.operation;

import java.util.List;

import com.inna.sinai.web.vo.Contract;

public interface ContractService {
	
  public List<Contract> search(Contract toSearch);

}
