package edu.vinaenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.daos.NewsDao;
import edu.vinaenter.models.News;

@Controller
@RequestMapping("news")
public class NewsController {
	
	@Autowired // DI
	private NewsDao newsDao;
	
	public static final String MSG_ERR = "KhÃ´ng tim tháº¥y id, vui lÃ²ng Ä‘á»�c tin khÃ¡c!";
	
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("datas", newsDao.getList());
		return "news/list";
	}

//	@GetMapping("detail")
//	public String detail(@RequestParam int id, Model model) {
//		News findNews = new News();
//		for (News news : newsDao.getList()) {
//			if(news.getId() == id) {
//				findNews = news;
//				break;
//			}
//		}
//		model.addAttribute("news", findNews);
//		return "news/detail";
//	}
	
	@GetMapping("detail/{id}/{author}") //news/detail/1
	public String detail(@PathVariable(name = "id") int id, 
			@PathVariable String author, Model model, RedirectAttributes re) {
		News findNews = null;
		for (News news : newsDao.getList()) {
			if(news.getId() == id) {
				findNews = news;
				break;
			}
		}
		
		// If doesn't find id then redirect to the list
		if(findNews == null) {
			re.addFlashAttribute("msg", MSG_ERR);
			return "redirect:/news/list";
		}
		model.addAttribute("news", findNews);
		return "news/detail";
	}
}
