package com.HDAP.Entities.ExceptionsHandling;

import java.util.List;

public class BusinessException extends RuntimeException {

	private List<ErrorModel> errorlist;

	public List<ErrorModel> getErrorlist() {
		return errorlist;
	}

	public void setErrorlist(List<ErrorModel> errorlist) {
		this.errorlist = errorlist;
	}

	public BusinessException(List<ErrorModel> errorlist) {
		super();
		this.errorlist = errorlist;
	}


}
