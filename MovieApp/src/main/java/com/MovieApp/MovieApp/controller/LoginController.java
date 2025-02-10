package com.MovieApp.MovieApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("MovieApp")
public class LoginController {
@GetMapping("/login")
public String Login() {
	return"login";
}

@PostMapping("/auth")
public String login(@RequestParam("username") String phone, @RequestParam("password") String password) {
	
    System.out.println("username: " + phone);
    System.out.println("Password: " + password);

    return "redirect:/MovieApp/dashboard";
}
}