package com.inna.sinai.common.service.core;

import com.inna.sinai.common.exception.core.SystemException;

public interface EncryptionService {
	
	public String encrypt(String plainInput) throws SystemException;
	public Boolean compare(String plainInput, String encryptedInput) 
	                                         throws SystemException;

}
