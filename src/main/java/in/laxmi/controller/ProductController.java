package in.laxmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.laxmi.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;

	@GetMapping("/product")
	public String getproduct(Model model) {
		String name =  ps.getProductById(1001);
         model.addAttribute("msg", name);
         return "index";
	}
}
