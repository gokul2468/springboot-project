package com.tnsif.adminservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tnsif.adminservice.entity.Product;
import com.tnsif.adminservice.repository.ProductRepository;

public class ProductServiceimpl implements ProductService {
	@Autowired
	
	ProductRepository productRepo;
	
	
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
	Optional<Product> product= productRepo.findById(id);
	if(product.isPresent())
	 {
		return product.get();
	 }
	else
	{
		return null;
	}
	
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Long id) {
		// TODO Auto-generated method stub
		
		Optional<Product> p=      productRepo.findById(id);
		if(p.isPresent())
		{
			Product updateProduct = p.get();
			Product.setId(id);
			updateProduct.setName(Product.getName ());
			updateProduct.setPrice(Product.getPrice ());
			updateProduct.setMdate(Product.GetMdate ());
			
			return productRepo.save(product);
			}
	}
