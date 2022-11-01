package com.kindsonthegenius.fleetmvs2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	//create a method to return the index page.
	
	@GetMapping("/index")
	public String home() {
		
		return "index";
	}

}
