package com.MovieApp.MovieApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/MovieApp")
public class ProfileController {
	@GetMapping("/profile")
	public String Profile() {
		return "movieprofile";
	}

}
