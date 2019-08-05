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
	
	public Products getById(int productId){
		return  productsRepository.findByProductId(productId);
		
	}
	public void update(Products products)
	{
		int prodCount=products.getProductCount();
		prodCount++;
	  productsRepository.update(products.getProductId(),products.getProductName(),prodCount);
	}
	public List<?> getProdAnalytics(){
		return productsRepository.getAnalytics();
	}

}
