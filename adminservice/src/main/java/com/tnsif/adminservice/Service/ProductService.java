package com.tnsif.adminservice.Service;

import java.util.List;

import com.tnsif.adminservice.entity.Product;

public interface ProductService {
	
	public List<Product> getProduct();
	public Product getProduct (Long id);
	public Product createProduct (Product product);
	public Product updateProduct (Product product, Long id);
	public void deleteProduct(Long id);

}
