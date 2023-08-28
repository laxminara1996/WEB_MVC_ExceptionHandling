package in.laxmi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/user")
	public String getWishMsg(Model model) {
		String msg = "Good Evening";
		model.addAttribute("msg", msg);
		int i = 10/0;
		return "index";

	}
	// local  controller specific Exception
	@ExceptionHandler(value=Exception.class)
	public String handleAE(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
	return "errorPage";
		
	}
}
