package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.RetailApplication.Entity.UserCatMetrics;

@Repository
public interface  UserCatRepository  extends JpaRepository<UserCatMetrics,String>{
List<UserCatMetrics> findByUserIdAndCatId(int userId,int categoryId);
List<UserCatMetrics> findByUserId(int userId);

}
