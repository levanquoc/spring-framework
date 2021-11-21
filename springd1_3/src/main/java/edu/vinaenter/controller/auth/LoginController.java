package edu.vinaenter.controller.auth;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.daos.UsersDao;
import edu.vinaenter.models.Users;



@Controller
@RequestMapping("/auth")
public class LoginController {
	private static final String ERR_LOGIN = "Invalid username or password!";
	private static final String ERR_ACTIVE = "Account has been locked!";
	@Autowired
	private UsersDao usersDao;
	@GetMapping("/login")
	public String index() {
		
		return "login";
	}
	@PostMapping("/login")
	String login(@ModelAttribute Users user,RedirectAttributes re,HttpSession session) {
		List<Users> listUsers =usersDao.getUsers();
		for (Users users : listUsers) {
			if(user.getPassword().equals(users.getPassword()) && user.getUsername().equals(users.getUsername())) {
				if(users.getActive().equals("de-active")) {
					re.addFlashAttribute("msg", ERR_ACTIVE);
					return "redirect:/auth/login";
				}
				session.setAttribute("user", user);
				return "redirect:/blog/home";
			}
			
		}
		re.addFlashAttribute("msg", ERR_LOGIN);
		return "redirect:/auth/login";
	}
}
