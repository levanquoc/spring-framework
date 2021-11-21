package edu.vinaenter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.models.Users;

@Controller
@RequestMapping("/blog")
public class BlogController {
	@GetMapping("/home")
	String index(HttpSession session) {
		Users user= (Users)session.getAttribute("user");
		if(user==null) {
			return "redirect:/auth/login";
		}
		return "blog.index";
	}
	@GetMapping("/post")
	String post(HttpSession session) {
		Users user= (Users)session.getAttribute("user");
		if(user==null) {
			return "redirect:/auth/login";
		}
		return "blog.post";
	}
	@GetMapping("/contact")
	String contact(HttpSession session) {
		Users user= (Users)session.getAttribute("user");
		if(user==null) {
			return "redirect:/auth/login";
		}
		return "blog.contact";
	}
	@GetMapping("/about")
	String about(HttpSession session) {
		Users user= (Users)session.getAttribute("user");
		if(user==null) {
			return "redirect:/auth/login";
		}
		return "blog.about";
	}
	
}
