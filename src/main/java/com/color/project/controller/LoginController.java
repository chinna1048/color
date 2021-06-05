package com.color.project.controller;


import javax.annotation.security.PermitAll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.color.project.dto.LoginDTO;
import com.color.project.service.LoginService;


@RestController
public class LoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService service;

	@PermitAll
	@RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json")
	public String login(@RequestBody LoginDTO loginDTO) {
		LOGGER.info("login api started");
		String result =  "";
		try {
			result = service.loginValidation(loginDTO);
		} catch (Exception e) {
			result="error";
		}
		LOGGER.info("login api ended");
		return result;
	}
}
