package com.velocis.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		
		System.out.println("open HelloPage() method executed");
		
		ModelAndView mav= new ModelAndView();
		
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("aboutUs")
	public String openAboutUsPage() {
		
		System.out.println("open AboutUs() method executed");
		return "about-us";
	}

}
