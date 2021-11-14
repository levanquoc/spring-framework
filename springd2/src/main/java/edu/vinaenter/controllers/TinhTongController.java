package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TinhTongController {

	@RequestMapping(method = RequestMethod.GET, value = "/tinhtong")
	public String index() {
		return "tinhtong/tinhtong";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/tinhtong")
	public String incauchao(@RequestParam String dayso,Model model) {
		String[] mangso= dayso.split(",");
		
		int sum=0;
		for (String string : mangso) {
			sum+=Integer.valueOf(string);
		}
		model.addAttribute("dayso", dayso);
		model.addAttribute("sum", sum);
		
		return "tinhtong/tinhtong";
	}

}
