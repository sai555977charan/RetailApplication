package com.hcl.RetailApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.Products;
import com.hcl.RetailApplication.Repository.ProductsRepository;

@Service
public class ProductDescService {
	@Autowired
	ProductsRepository productsRepository;
	
	public List<Products> getById(int productId){
		return  productsRepository.findByProductId(productId);
		
	}
	public Products save(Products products)
	{
		return  productsRepository.save(products);
	}
	public List<?> getProdAnalytics(){
		return productsRepository.getAnalytics();
	}

}
