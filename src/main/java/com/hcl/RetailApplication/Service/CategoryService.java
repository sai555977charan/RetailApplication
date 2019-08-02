package com.hcl.RetailApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.User;
import com.hcl.RetailApplication.Repository.CategoriesRepository;

@Service
public class CategoryService {
	@Autowired
	CategoriesRepository categoriesRepository;
	public List<Categories> getall(int catgeoryId){
		return categoriesRepository.findByCategoryId(catgeoryId);
		
	}
	public List<Categories> getall(){
		return categoriesRepository.findAll();
		
	}
	
public Categories save(Categories categories)
{
	return categoriesRepository .save(categories);
}

public List<?> getAnalytics(){
	return categoriesRepository.getAnalytics();
}
}
