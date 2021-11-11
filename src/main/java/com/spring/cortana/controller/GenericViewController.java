package com.spring.cortana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.cortana.models.UserRegistration;

@Controller
public class GenericViewController {
	@ResponseBody
	@GetMapping("/welcome/{name}")
	public String doWelcome(@PathVariable String name) {
		return "Welcome "+name +", Nice to have you Here!";
	}
	@GetMapping("/login")
	public String doLogin() {
		return "login.jsp";
	}
	@ResponseBody
	@GetMapping("/addUser")
	public String doAddUser(@RequestBody UserRegistration ur) {
		return "Data Added Successfully";
	}
}
