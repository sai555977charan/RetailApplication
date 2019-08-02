package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.Products;

@Repository
public interface ProductsRepository  extends JpaRepository<Products,Integer>{


List<Products> findByProductId(int productId);
@Query("select e.productCount,e.productId from Products e group by e.productId")
List<?> getAnalytics();
}
