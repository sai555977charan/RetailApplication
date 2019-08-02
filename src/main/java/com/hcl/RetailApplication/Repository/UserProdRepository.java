package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.UserCatMetrics;
import com.hcl.RetailApplication.Entity.UserProdMetrics;

@Repository
public interface UserProdRepository  extends JpaRepository<UserProdMetrics,String>{
	List<UserProdMetrics> findByUserId(int userId);

}
