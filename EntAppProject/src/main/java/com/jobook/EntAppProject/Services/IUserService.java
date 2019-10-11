package com.jobook.EntAppProject.Services;

import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.model.User;


public interface IUserService {
	User login(String userName, String password);
	
	User getUserInfoById(int userId);
}
