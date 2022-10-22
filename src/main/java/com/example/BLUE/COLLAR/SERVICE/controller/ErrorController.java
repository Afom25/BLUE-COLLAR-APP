package com.example.BLUE.COLLAR.SERVICE.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	
	public String getErrorPath() {
		return "/error";
	}
	
	@GetMapping("/error")
	public ModelAndView handleError(HttpServletResponse response) {
		int code  = response.getStatus();
		
		
		return new ModelAndView("error");
		
	}

}
