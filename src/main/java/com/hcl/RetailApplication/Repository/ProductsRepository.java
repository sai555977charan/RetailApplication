package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.RetailApplication.Entity.Categories;
import com.hcl.RetailApplication.Entity.Products;

@Repository
public interface ProductsRepository  extends JpaRepository<Products,Integer>{


Products findByProductId(int productId);
@Transactional
@Modifying
@Query("update Products e set e.productCount= :prodCount where e.productId=:prodid and e.productName=:prodname")
void update(@Param("prodid") int productId,@Param("prodname") String productName,@Param("prodCount") int productCount);
@Query("select e.productCount,e.productId from Products e group by e.productId")
List<?> getAnalytics();
}
