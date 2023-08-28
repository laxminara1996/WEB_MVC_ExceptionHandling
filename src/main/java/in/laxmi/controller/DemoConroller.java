package in.laxmi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoConroller {
	private Logger logger = LoggerFactory.getLogger(DemoConroller.class);
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msg = "welcome to page";
		model.addAttribute("msg", msg);
		String s = null;
		s.length();
		return "index";

	}
	
	@GetMapping("/welcome")
	public String getWishMsg(Model model) {
		String msg = "Good Evening";
		model.addAttribute("msg", msg);
		int i = 10/0;
		return "index";

	}
	@ExceptionHandler(value=Exception.class)
	public String handleAE(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
	return "errorPage";
		
	}
}
