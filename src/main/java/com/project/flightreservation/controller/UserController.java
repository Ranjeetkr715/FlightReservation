package com.project.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.flightreservation.entities.User;
import com.project.flightreservation.repo.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userrepository;

	@GetMapping("/showReg")
	public String showRegistrationPage() {
		return "registerUser";
	}
	
	@PostMapping("/registerUser")
	public String register(@ModelAttribute("user") User user) {
		this.userrepository.save(user);
		return "login";
	}
	
	@GetMapping("/showlogin")
	public String showlogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email ,@RequestParam("password")  
	                    String password,ModelMap modelMap) {
		
		  User user = userrepository.findByEmail(email);
		  
		  if(user.getEmail().equals(email)) {
			  return "findFlights";
		  }else {
			  modelMap.addAttribute("msg","Invalid Username or password.please try again.");
		  }
		return "login";
	}
}
