package com.hcl.RetailApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.ProductDisplay;
import com.hcl.RetailApplication.Repository.ProductDisplayRepository;

@Service
public class ProductService {
	@Autowired
	ProductDisplayRepository productDisplayRepository;
	public List<ProductDisplay> getall(int categoryId){
		return  productDisplayRepository.findByCategoryId(categoryId);
		
	}

}
