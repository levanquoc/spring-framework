package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CauChaoController {

	@RequestMapping(method = RequestMethod.GET, value = "/cauchao")
	public String index() {
		return "cauchao/cauchao";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/cauchao")
	public String incauchao(@RequestParam String name,Model model) {
		
		model.addAttribute("name", name);
		return "cauchao/cauchao";
	}

}
