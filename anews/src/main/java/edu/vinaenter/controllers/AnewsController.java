package edu.vinaenter.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.dao.CatDAO;
import edu.vinaenter.models.Category;

@Controller
@RequestMapping("/anews")
public class AnewsController {
	@Autowired
	CatDAO catDao;
	@GetMapping("/home")
	String index(HttpSession session,Model model) {
		List<Category> listCat=catDao.getAll();
		model.addAttribute("listCat", listCat);
		return "anews.index";
	}
	@GetMapping("/add")
	String add(Model model) {
		List<Category> listCat=catDao.getAll();
		model.addAttribute("listCat", listCat);
		return "anews.add";
	}
	@GetMapping("/cat")
	String contact(HttpSession session,Model model) {
		List<Category> listCat=catDao.getAll();
		model.addAttribute("listCat", listCat);
		return "anews.cat";
	}
	@GetMapping("/detail")
	String about(HttpSession session,Model model) {
		List<Category> listCat=catDao.getAll();
		model.addAttribute("listCat", listCat);
		return "anews.detail";
	}
	
}
