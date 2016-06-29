package com.tkhts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkhts.dao.UserDao;
import com.tkhts.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User getUserDetails(String userId) {
		return userDao.getUserDetails(userId);
	}

	
	public String saveUserDetails(User user) {
		return userDao.saveUserDetails(user);
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
