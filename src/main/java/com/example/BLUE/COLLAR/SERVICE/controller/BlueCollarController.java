package com.example.BLUE.COLLAR.SERVICE.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.model.User;
import com.example.BLUE.COLLAR.SERVICE.service.JobService;
import com.example.BLUE.COLLAR.SERVICE.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;


//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class BlueCollarController {
	@Autowired
	private JobService jobService;
	@Autowired
	private UserService userService;


//	@Autowired
//	private Jwtutil jwtutil;
//	@Autowired
//	private AuthenticationManager authenticationManager;

	private List<User> users = new ArrayList<User>();
	private List<Job> jobs = new ArrayList<>();
	public List<User> jobApplies = new ArrayList<User>();
	private static int index = 1;

	@GetMapping("/bluelistItemForm")
	public ModelAndView showWatchlistItemForm() {
		String viewName = "bluelistItemForm";
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bluelistItem", new User());
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/signup")
	public ModelAndView getBlueSignUp(Model model) {
		String viewName = "signup";
		//Map<String,Object> model = new HashMap<String,Object>();
		User user = new User();
		model.addAttribute("user", user);
		return new ModelAndView(viewName);
	}

	@PostMapping("/add/job")
	public Job save(@RequestBody Job job) {
		return jobService.save(job);
	}

	@RequestMapping("/service")
	public ModelAndView getBlueService() {
		String viewName = "service";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);

	}

	@GetMapping("/about")
	public ModelAndView getBlueAbout() {
		String viewName = "about";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/contact")
	public ModelAndView getBlueContact() {
		String viewName = "contact";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/login")
	public ModelAndView getBlueLogin() {
		String viewName = "login";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);

	}
	@GetMapping("/blueLive")
	public ModelAndView getBlueLive() {
		String viewName = "blueLive";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);

	}
	@RequestMapping("/job")
	public ModelAndView getJob(Model model) {
		String viewName = "job";
		Job job = new Job();
		model.addAttribute("job", job);
		List<Job> allJobs = jobService.listAll();
		model.addAttribute("listjob", allJobs);
		return new ModelAndView(viewName);
	}

	@PostMapping("/job")
	public ModelAndView handleForm(Job job, Model model) {
		//  System.out.println(job.toString());
		jobs.add(job);
		String viewName = "job";
		//Map<String,Object> model = new HashMap<String,Object>();
		//model.put("bluelistItems", new BlueCollarItem());
		List<Job> allJobs = jobService.listAll();
		//System.out.println(allJobs);
		model.addAttribute("listjob", allJobs);
		jobService.save(job);
		return new ModelAndView(viewName);
	}

	@PostMapping("/signup")
	public ModelAndView handleformUser(User user) {
		System.out.println(user.toString());
		jobApplies.add(user);
		String viewName = "login";
		userService.save(user);

		//	model.addAttribute("users",users);
		return new ModelAndView(viewName);
	}

	@GetMapping("/bluecollarlist")
	public ModelAndView getBluebluelist() {
		String viewName = "bluecollarlist";
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("users", users);
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/location")
	public ModelAndView getBluebluelocation() {

		String viewName = "location";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/locationId")
	public ModelAndView getBluebluelocationId() {
		String viewName = "registrationForm";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}


	@GetMapping("/registrationForm")
	public ModelAndView showRegsistration() {
		String viewName = "registrationForm";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}

	@PostMapping("/registrationForm")
	public ModelAndView saveBlueCollarItem() {
		String viewName = "displayform";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);

	}

	@GetMapping("/plumber")
	public ModelAndView getPlumber() {
		String viewName = "plumber";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}

	@GetMapping("/welder")
	public ModelAndView getWelder() {
		String viewName = "welder";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}
	@GetMapping("/gardener")
	public ModelAndView getGardener() {
		String viewName = "gardener";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}
	@GetMapping("/carpenter")
	public ModelAndView getCarpenter() {
		String viewName = "carpenter";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}
	@GetMapping("/electrican")
	public ModelAndView getElectrican() {
		String viewName = "electrican";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}
	@GetMapping("/payment")
	public ModelAndView getPayment() {
		String viewName = "payment";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}


	@GetMapping("/home")
	public ModelAndView showIndex() {
		String viewName = "home";
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView(viewName, model);
	}
	@RequestMapping("/job/byjobtitle/{first}")
		public List<Job> byjobtitle(@PathVariable(value="first") String first) {
			return jobService.byjobtitle(first);

		}

		@RequestMapping("/job/byjoblocation/{second}")
	     public List<Job> byjoblocation(@PathVariable(value="second") String second){
		return jobService.byjoblocation(second);
		}
	@RequestMapping("/job/byjobUser/{third}")
	public List<Job> byjobUser(@PathVariable(value="third") String third){
		return jobService.byjobUser(third);
	}

	}

























