package com.yjb.business.app.service.impl;

import com.yjb.business.app.service.IService;

public class  BaseService<T> implements IService<T> {

	protected String comm = "BaseService";
	private String getComm() {
		return comm;
	}
}
