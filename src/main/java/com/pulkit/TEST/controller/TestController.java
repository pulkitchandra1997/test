package com.pulkit.TEST.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test")
	public String test() {
		return "Welcome to springboot test";
	}
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}