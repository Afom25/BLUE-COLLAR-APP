package com.example.BLUE.COLLAR.SERVICE.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class CustomerErrorController implements ErrorController {
	
	
	public String getErrorPath() {
		return "/error";
	}
	
	@GetMapping("/error")
	public ModelAndView handleError(HttpServletResponse response) {
		int code  = response.getStatus();
		
		
		return new ModelAndView("error");
		
	}

}
