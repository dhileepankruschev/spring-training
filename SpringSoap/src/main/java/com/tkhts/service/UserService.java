package com.tkhts.service;

import com.tkhts.entity.User;

public interface UserService {
	public User getUserDetails(String userId);
	public String saveUserDetails(User user);
}
