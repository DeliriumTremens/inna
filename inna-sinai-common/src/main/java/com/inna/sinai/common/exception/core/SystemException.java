package com.inna.sinai.common.exception.core;

import com.inna.sinai.common.exception.AbstractException;

public class SystemException extends AbstractException {

	private static final long serialVersionUID = -4029919208166094344L;

	public SystemException() {
	    super();
	  }

	  public SystemException(final String message) {
	    super(message);
	  }

	  public SystemException(final String message, final Throwable cause) {
	    super(message, cause);
	  }

	  public SystemException(final Throwable cause) {
	    super(cause);
	  }

	}