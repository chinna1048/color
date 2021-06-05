package com.color.project.service;

import com.color.project.dto.LoginDTO;

public class LoginService {

	private static String email = "medari@gmail.com";
	private static String password ="medari";
	
	public String loginValidation(LoginDTO loginDTO) {
	
		String result = "";
		if(email.equals(loginDTO.getEmail()) && password.equals(loginDTO.getPassword())) {
			result="verified";
		}else {
			result="not verified";
		}
		return result;
	}
}
