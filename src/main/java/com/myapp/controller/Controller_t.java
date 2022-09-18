package com.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller_t {

	@RequestMapping("/tcs")
	public String handler() {

		return "home";
	}

	@RequestMapping("/cont")
	public String contect() {

		return "cont";

	}

	@RequestMapping("/tense")
	public String eng() {
		return "tense";

	}
	@RequestMapping("/mail")
	
	public String EmailWrite() {
		
		return "mail";
	}

}
