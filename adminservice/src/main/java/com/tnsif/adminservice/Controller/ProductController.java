package com.tnsif.adminservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.adminservice.Service.ProductService;
import com.tnsif.adminservice.entity.Product;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public List<Product> getProduct()
	{
		return service.getProduct();
		
	}
	
	@GetMapping("/{id}")
	public Product <Product> getProduct(@PathVariable Long id)
	{
		return service.getProduct(id);
		
		
	}
	
	@PostMapping
	Public Product create Product(@RequestBody Product product)
	
	{
		return service.createProduct(product);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProduct (@PathVariable Long id)
	{
		service.deleteProduct(id;)
	}

}
