package com.hcl.RetailApplication.Controller;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.RetailApplication.Dto.UserDto;
import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.ProductDisplay;
import com.hcl.RetailApplication.Entity.Products;
import com.hcl.RetailApplication.Entity.User;
import com.hcl.RetailApplication.Entity.UserCatMetrics;
import com.hcl.RetailApplication.Entity.UserProdMetrics;
import com.hcl.RetailApplication.Service.CategoryService;
import com.hcl.RetailApplication.Service.LoginService;
import com.hcl.RetailApplication.Service.ProductDescService;
import com.hcl.RetailApplication.Service.ProductService;
import com.hcl.RetailApplication.Service.RegisterService;
import com.hcl.RetailApplication.Service.UserCatService;
import com.hcl.RetailApplication.Service.UserProdService;

@RestController
@RequestMapping("/retailApplication")
public class RetailApplicationController {
	@Autowired
	RegisterService registerService;
	@PostMapping("/register")
	public ResponseEntity<String> register(UserDto user) {
		User userDetails = new User();
		BeanUtils.copyProperties(user, userDetails);
		registerService.addUser(userDetails);
		return new ResponseEntity<String>("user added successfully", HttpStatus.CREATED);
	}

	@Autowired
	LoginService loginService;
	@Autowired
	CategoryService categoryService;
	@PostMapping("/login")
	public ResponseEntity login(UserDto user1) {
		User userDetails1 = new User();
		BeanUtils.copyProperties(user1, userDetails1);
		User user2 = loginService.login(userDetails1.getUserName(), userDetails1.getPassword());
		List<Categories> category = categoryService.getall();
		if (user1.getUserName() == user2.getUserName() && user1.getPassword() == user2.getPassword())
			return new ResponseEntity<List<Categories>>(category, HttpStatus.OK);
		else
			return new ResponseEntity<List<Categories>>(category, HttpStatus.OK);
	}

	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService1;
	@Autowired
	UserCatService userService;
	@GetMapping("/product/{categoryId}/{userId}")
	public ResponseEntity getProduct(@PathVariable int categoryId, @PathVariable int userId) {
		List<ProductDisplay> productDisplay = productService.getall(categoryId);
		Categories categories1 = categoryService1.getall(categoryId);
		categoryService1.update(categories1);
		UserCatMetrics userCatMetrics=	userService.getMetrics(userId, categoryId);
		userService.update(userCatMetrics);
		return new ResponseEntity<List<ProductDisplay>>(productDisplay, HttpStatus.OK);
	}

	@Autowired
	ProductDescService productDescService;
	@Autowired
	UserProdService userProdService;
	@GetMapping("/products/{productId}/{userId}")
	public ResponseEntity getProductDetails(@PathVariable int productId, @PathVariable int userId) {
		Products products = productDescService.getById(productId);
		UserProdMetrics userProdMetrcs = userProdService.getMetrics(userId, productId);
		userProdService.update(userProdMetrcs);
		productDescService.update(products);
		return new ResponseEntity<Products>(products, HttpStatus.OK);
	}

	@Autowired
	UserCatService userCatService;
	@GetMapping("/catMetrics/{userId}")
	public ResponseEntity catmetrics(@PathVariable int userId) {
		List<UserCatMetrics> userCatMetrics = userCatService.getMetrics1(userId);		
		return new ResponseEntity<List<UserCatMetrics>>(userCatMetrics, HttpStatus.OK);
	}

	@Autowired
	UserProdService userProdService1;
	@GetMapping("/prodMetrics/{userId}")
	public ResponseEntity prodmetrics(@PathVariable int userId) {
		List<UserProdMetrics> userProdmetrics = userProdService1.getMetrics1(userId);
		return new ResponseEntity<List<UserProdMetrics>>(userProdmetrics, HttpStatus.OK);
	}

	@Autowired
	CategoryService categoryservice;
	@GetMapping("/catanalytics")
	public List<?> getAnalytics() {
		return categoryservice.getAnalytics();
	}

	@Autowired
	ProductDescService prodDescService;
	@GetMapping("/prodanalytics")
	public List<?> getProdAnalytics() {
		return prodDescService.getProdAnalytics();
	}
}
