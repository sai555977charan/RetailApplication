package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.Categories;
@Repository

public interface CategoriesRepository extends JpaRepository<Categories,String>{
	List<Categories> findByCategoryId(int categoryId);
	@Query("select e.categoryCount,e.categoryId from Categories e group by e.categoryId")
	List<?> getAnalytics();

}
