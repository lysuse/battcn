package com.battcn.service.exception;

/**
 * 业务自定义异常
 * 
 * @author yujia
 * 
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}

}
