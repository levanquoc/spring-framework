package edu.vinaenter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String index() {
		return "login";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String incauchao(@RequestParam String username,@RequestParam String password,HttpSession session,RedirectAttributes re) {
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		if("admin".equals(username) && "12345".equals(password)) {
			
			return "redirect:/welcome";
		}
		re.addFlashAttribute("msg", "Sai username hoặc password");
		return "redirect:/login";
	}

}
