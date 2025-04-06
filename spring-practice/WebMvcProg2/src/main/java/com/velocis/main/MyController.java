package com.velocis.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.velocis.bean.User;

@Controller
public class MyController {
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		
		System.out.println("open HelloPage() method executed");
		
		ModelAndView mav= new ModelAndView();
		
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		
		System.out.println("open AboutUs() method executed");
		return "about-us";
	}

	@GetMapping("/myForm")
	public String openmyFormPage() {
		
		return "myForm";
	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req) {
//		
//		String myname=req.getParameter("name1");
//		String myemail=req.getParameter("email1");
//		String myphone=req.getParameter("phoneno1");
//		
//		
//		System.out.println("name: "+ myname);
//		System.out.println("Email Id: "+ myemail);
//		System.out.println("Phone no: "+ myphone);
//		
//		return "profile";
//		
//	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			      @RequestParam("name1") String myname,
//			      @RequestParam("email1") String myemail,
//			      @RequestParam("phoneno1") String myphone,
//			      Model model
//			) {
//		
//		System.out.println("name: "+ myname);
//		System.out.println("Email Id: "+ myemail);
//		System.out.println("Phone no: "+ myphone);
//		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phno", myphone);
//		
//		return "profile";
//	}
	
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			      @RequestParam("name1") String myname,
//			      @RequestParam("email1") String myemail,
//			      @RequestParam("phoneno1") String myphone,
//			      Model model
//			) {
//		
//		System.out.println("name: "+ myname);
//		System.out.println("Email Id: "+ myemail);
//		System.out.println("Phone no: "+ myphone);
//		
//		User user =new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphone);
//		
//		model.addAttribute("model_user", user);
//		
//		return "profile";
//	}
	
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute User user) {
		
		System.out.println("name: "+ user.getName());
		System.out.println("Email Id: "+ user.getEmail());
		System.out.println("Phone no: "+ user.getPhoneno());
			
		return "profile";
	}
}
