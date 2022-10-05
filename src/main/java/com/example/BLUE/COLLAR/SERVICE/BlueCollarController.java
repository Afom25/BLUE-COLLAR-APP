package com.example.BLUE.COLLAR.SERVICE;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class BlueCollarController {
	
	@GetMapping("/")
	public ModelAndView getBlue() {
		
		String viewName = "/";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("numberOfMovies", "123");
		
		
		return new ModelAndView(viewName,model);
		
	}
	
	@GetMapping("/service")
	public ModelAndView getBlueService() {
		
		String viewName = "service";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("numberOfMovies", "123");
		
		
		return new ModelAndView(viewName,model);
		
	}
	@GetMapping("/about")
	public ModelAndView getBlueAbout() {
		
		String viewName = "about";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("numberOfMovies", "123");
		
		
		return new ModelAndView(viewName,model);
		
	}
	@GetMapping("/contact")
	public ModelAndView getBlueContact() {
		
		String viewName = "about";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("numberOfMovies", "123");
		
		
		return new ModelAndView(viewName,model);
		
	}
	
	

}
