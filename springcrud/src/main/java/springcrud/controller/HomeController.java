package springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springcrud.dao.ProductDao;
import springcrud.model.Product;

@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping(path = "/home")
	public String home(Model m) {
		List<Product> products = productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	@RequestMapping(path = "/add")
	public String addProduct(Model m ) {
		m.addAttribute("title", "Add Product");
		return "add_Product";
	}
	@RequestMapping(path = "/handle_product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product) {
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("add");
		return redirectView;
	}
	@RequestMapping(path = "/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id") int id) {
		productDao.delete(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("add");
		return redirectView;
	}
	
	@RequestMapping(path = "/update/{id}")
	public String update(@PathVariable("id") int id,Model m) {
		Product singeProduct = this.productDao.getSingeProduct(id);
		m.addAttribute("product", singeProduct);
		return "update_form";
	}

}
