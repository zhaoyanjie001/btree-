package com.yjb.business.app.service;

import com.yjb.business.app.dto.RequestUserDto;
import com.yjb.business.app.form.RequestLoginDto;
import com.yjb.business.app.form.RequestRegistDto;

public interface LoginService {
	
	public String getUserCnt(String userName);
    public String getUserByPwd(RequestLoginDto loginRequest);
    public String insertUser(RequestRegistDto RequestRegistDto);
    public String getLimitUserCount(int limit);
    
}
