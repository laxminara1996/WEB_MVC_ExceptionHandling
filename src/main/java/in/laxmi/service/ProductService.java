package in.laxmi.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
public String getProductById(Integer id) {
	int i = 10/0;
	return "mouse";
}
}
