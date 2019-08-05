package com.hcl.RetailApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.UserCatMetrics;
import com.hcl.RetailApplication.Entity.UserProdMetrics;
import com.hcl.RetailApplication.Repository.UserCatRepository;
import com.hcl.RetailApplication.Repository.UserProdRepository;
@Service
public class UserProdService {
	@Autowired 
	UserProdRepository userProdRepository;
	public UserProdMetrics getMetrics(int userId,int productId)
	{
		return userProdRepository.findByUserIdAndProdId(userId,productId);
	}
	public List<UserProdMetrics> getMetrics1(int userId)
	{
		return userProdRepository.findByUserId(userId);
	}
	public void update(UserProdMetrics user)
	{
		int prodCount=user.getProdCount();
		prodCount++;
		 userProdRepository .update(user.getUserId(),user.getProdId(),prodCount);
	}
	
	
}
