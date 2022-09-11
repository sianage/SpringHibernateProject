package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "Form displayed successfully";
	}
}
