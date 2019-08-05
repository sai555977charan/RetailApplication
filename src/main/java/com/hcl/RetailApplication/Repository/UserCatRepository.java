package com.hcl.RetailApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.RetailApplication.Entity.UserCatMetrics;

@Repository
public interface  UserCatRepository  extends JpaRepository<UserCatMetrics,String>{
UserCatMetrics findByUserIdAndCatId(int userId,int categoryId);
List<UserCatMetrics> findByUserId(int userId);
@Transactional
@Modifying
@Query("update UserCatMetrics e set e.catCount=:catcount where e.userId=:userid and e.catId=:catid")
void update(@Param("userid") int userId,@Param("catid") int categoryId,@Param("catcount") int categoryCount);



}
