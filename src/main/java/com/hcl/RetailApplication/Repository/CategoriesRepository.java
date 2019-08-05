package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.RetailApplication.Entity.Categories;
@Repository

public interface CategoriesRepository extends JpaRepository<Categories,String>{
	Categories findByCategoryId(int categoryId);
	@Transactional
	@Modifying
	@Query("update Categories e set e.categoryCount= :catCount where e.categoryId=:catid and e.categoryName=:catname")
	void update(@Param("catid") int categoryId,@Param("catname") String categoryName,@Param("catCount") int categoryCount);
	@Query("select e.categoryCount,e.categoryId from Categories e group by e.categoryId")
	List<?> getAnalytics();

}
