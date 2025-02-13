package com.MovieApp.MovieApp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller()
public class ProfileController {
	@GetMapping("/profile")
	public String Profile() {
		return "movieprofile";
	}

}
