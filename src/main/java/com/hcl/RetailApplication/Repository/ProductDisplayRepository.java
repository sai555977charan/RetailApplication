package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.ProductDisplay;
@Repository
public interface ProductDisplayRepository extends JpaRepository<ProductDisplay,String>{
	List<ProductDisplay> findByCategoryId(int categoryId);

}
