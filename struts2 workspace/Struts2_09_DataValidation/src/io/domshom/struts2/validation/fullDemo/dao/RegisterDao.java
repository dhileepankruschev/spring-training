package io.domshom.struts2.validation.fullDemo.dao;

import io.domshom.struts2.validation.fullDemo.model.User;

import java.util.HashMap;
import java.util.Map;

public class RegisterDao {
	public static Map<String, User> usermap = new HashMap<String, User>();
	
	public static boolean saveUser(User user){
		boolean isSaved = false;
		usermap.put(user.getEmail(), user);
		System.out.println("user stored successfully : "+user);
		isSaved = true;
		
		return isSaved;
	}
}
