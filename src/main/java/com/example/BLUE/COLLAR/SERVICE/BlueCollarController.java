package com.example.BLUE.COLLAR.SERVICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class BlueCollarController {
	
	private List<BlueCollarItem> bluelistItems = new ArrayList<BlueCollarItem>();
	private static int index = 1;
	
	
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
	@GetMapping("/bluecollarlist")
	public ModelAndView getBluebluelist() {
		
		
		bluelistItems.clear();
		bluelistItems.add(new BlueCollarItem("Customer1","8.8","Good","Work hard",index++));
		bluelistItems.add(new BlueCollarItem("Customer2","9","very Good","Cool",index++));
		bluelistItems.add(new BlueCollarItem("Customer3","10","nice","i like it",index++));
		bluelistItems.add(new BlueCollarItem("Customer4","6","bad","i dont recommend",index++));
		
		
		String viewName = "bluecollarlist";
		
		
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("bluelistItems", bluelistItems);
		
		return new ModelAndView(viewName,model);
		
	}
	
	

}
