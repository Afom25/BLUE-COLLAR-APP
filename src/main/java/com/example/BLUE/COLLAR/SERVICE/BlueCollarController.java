package com.example.BLUE.COLLAR.SERVICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller

public class BlueCollarController {
	
	private List<BlueCollarItem> bluelistItems = new ArrayList<BlueCollarItem>();
	private static int index = 1;
	
//	@GetMapping ("/blueForm")
//	
//	public ModelAndView showBlueCollarForm() {
//		String viewName = "blueForm";
//		
//		Map<String,Object> model = new HashMap<String,Object>();
//		model.put("bluecollarItem", new BlueCollarItem());
//
//		
//		return new ModelAndView(viewName,model);
//		
//		
//	}
	
	@GetMapping("/bluelistItemForm")
	public ModelAndView showWatchlistItemForm() {
		
		String viewName = "bluelistItemForm";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("watchlistItem", new BlueCollarItem());
		
		return new ModelAndView(viewName,model); 
	}
	
	
	
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
	
	@PostMapping("/bluelistItemForm")
	public ModelAndView submitWatchlistItemForm(BlueCollarItem bluelistItem) {
		
		bluelistItem.setId(index++);
		bluelistItems.add(bluelistItem);
		
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/bluecollarlist");
		
		return new ModelAndView(redirect);
	}
	@GetMapping("/bluecollarlist")
	public ModelAndView getBluebluelist() {
		
		String viewName = "bluecollarlist";
		
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("bluelistItems", bluelistItems);
		
		return new ModelAndView(viewName,model);
		
	}
	
	

}
