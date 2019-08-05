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
	public Categories getall(int catgeoryId){
		return categoriesRepository.findByCategoryId(catgeoryId);
		
	}
	public List<Categories> getall(){
		return categoriesRepository.findAll();
		
	}
	
public void update(Categories categories)

{
	int catCount=categories.getCategoryCount();
	catCount++;
	 categoriesRepository .update(categories.getCategoryId(),categories.getCategoryName(),catCount);
}

public List<?> getAnalytics(){
	return categoriesRepository.getAnalytics();
}
}
