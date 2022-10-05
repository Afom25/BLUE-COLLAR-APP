package com.example.BLUE.COLLAR.SERVICE;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class BlueCollarController {
	

	
	@GetMapping("/service")
	public ModelAndView getBlueService() {
		
		String viewName = "service";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
		
	}
	@GetMapping("/about")
	public ModelAndView getBlueAbout() {
		
		String viewName = "about";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		
		return new ModelAndView(viewName,model);
		
	}
	@GetMapping("/contact")
	public ModelAndView getBlueContact() {
		
		String viewName = "contact";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
	
		
		
		return new ModelAndView(viewName,model);
		
	}
	@GetMapping("/login")
	public ModelAndView getBlueLogin() {
		
		String viewName = "login";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		
		
	
		return new ModelAndView(viewName,model);
		
	}
	
	

}
