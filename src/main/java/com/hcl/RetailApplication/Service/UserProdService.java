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
	public List<UserProdMetrics> getMetrics(int userId)
	{
		return userProdRepository.findByUserId(userId);
	}
	public UserProdMetrics save(UserProdMetrics user)
	{
		return userProdRepository .save(user);
	}
	
	
}
