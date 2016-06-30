package io.domshom.struts2.validation.fullDemo;

import io.domshom.struts2.validation.fullDemo.dao.RegisterDao;
import io.domshom.struts2.validation.fullDemo.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	User user = new User();
	
	@Override
	public User getModel()
	{
		return user;
	}
	
	
	@Override
	public String execute() throws Exception {
		addActionMessage("You have entered correct data");
		boolean isUserSaved = RegisterDao.saveUser(user);
		if(isUserSaved){
			return SUCCESS;
		}
		return ERROR;
	}

	
	
}
