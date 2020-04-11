package com.rky.dev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	private final Logger log = LoggerFactory.getLogger(BaseController.class);

	@GetMapping("/say/{name}")
	public String doGreetings(@PathVariable String name) {
		log.info("The name is : {}", name);
		
		return "Hello, Please welcome : "+name;
	}
}
