package edu.vinaenter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WelComeController {

	@RequestMapping(method = RequestMethod.GET, value = "/welcome")
	public String index(HttpSession session,RedirectAttributes re) {
	String username=(String) session.getAttribute("username");
	String password=(String) session.getAttribute("password");
	if("admin".equals(username) && "12345".equals(password)) {
		session.setAttribute("username", username);
		return "welcome";
	}
	re.addFlashAttribute("msg", "Sai username hoặc password");
	return "redirect:/login";
		
	}

}
