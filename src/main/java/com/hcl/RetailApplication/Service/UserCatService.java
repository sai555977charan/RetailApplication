package com.hcl.RetailApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.RetailApplication.Entity.User;
import com.hcl.RetailApplication.Entity.UserCatMetrics;
import com.hcl.RetailApplication.Repository.UserCatRepository;

@Service

public class UserCatService {
	@Autowired 
	UserCatRepository userCatRepository;
	public List<UserCatMetrics> getMetrics(int userId,int categoryId)
	{
		return userCatRepository.findByUserIdAndCatId(userId,categoryId);
	}
	public List<UserCatMetrics> getMetrics1(int userId)
	{
		return userCatRepository.findByUserId(userId);
	}
	public UserCatMetrics save(UserCatMetrics user)
	{
		return userCatRepository .save(user);
	}

	

}
