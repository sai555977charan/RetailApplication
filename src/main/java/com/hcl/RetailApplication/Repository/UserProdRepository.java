package com.hcl.RetailApplication.Repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.RetailApplication.Entity.UserCatMetrics;
import com.hcl.RetailApplication.Entity.UserProdMetrics;

@Repository
public interface UserProdRepository  extends JpaRepository<UserProdMetrics,String>{
	List<UserProdMetrics> findByUserId(int userId);
	UserProdMetrics findByUserIdAndProdId(int userId,int productId);
	@Transactional
	@Modifying
	@Query("update UserProdMetrics e set e.prodCount=:prodcount where e.userId=:userid and e.prodId=:prodid")
	void update(@Param("userid") int userId,@Param("prodid") int prodId,@Param("prodcount") int prodCount);

}
