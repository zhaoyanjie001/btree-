package com.yjb.business.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yjb.business.app.dto.RequestUserDto;
import com.yjb.business.app.form.RequestLoginDto;
import com.yjb.business.app.form.RequestRegistDto;
import com.yjb.business.app.service.LoginService;
//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/getUserByPwd")
	public String getUserByPwd( RequestLoginDto login) {
		return loginService.getUserByPwd(login);
	}
	@GetMapping("/getUserCnt")
	public String getUserCnt( String username) {
		return loginService.getUserCnt(username);
	}
	
	@GetMapping("/getLimitUserCount")
	public String getLimitUserCount( Integer limit) {
		return loginService.getLimitUserCount(limit);
	}
	
	@PostMapping("/regist")
	public String insertUser(RequestRegistDto RequestRegistDto) {
		return loginService.insertUser(RequestRegistDto);
	}
	
	@PostMapping("/insertUser")
	public String insertUserTest(RequestRegistDto RequestRegistDto) {
		return null;
//		return loginService.insertUser(RequestRegistDto);
	}
	@DeleteMapping("/deleteUser")
	public String deleteUserTest(RequestRegistDto RequestRegistDto) {
		return null;
//		return loginService.deleteUser(RequestRegistDto);
	}
}
