package com.MovieApp.MovieApp.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("movieapp")
public class LoginController {
@GetMapping("/login")
public String Login() {
	return"login";
}

@PostMapping("/auth")
public void login(@RequestParam("username") String phone, @RequestParam("password") String password ,HttpServletResponse rs) throws IOException {
	
    System.out.println("username: " + phone);
    System.out.println("Password: " + password);
    rs.sendRedirect("/dashboard");

}
}