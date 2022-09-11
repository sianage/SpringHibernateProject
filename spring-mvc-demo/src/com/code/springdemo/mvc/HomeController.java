//Step 1 - create controller class
package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	
	//Step 2 - define controller method called showPage
	//Step 3 - add request mapping to controller method.
	@RequestMapping("/")
	public String showPage() {
		//Step 4 - return view name
		return "main-menu";
	}

}
