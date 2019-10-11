package com.jobook.EntAppProject.DAO.Interfaces;

import com.jobook.EntAppProject.model.User;

public interface IUserProvider {
	public User login(String email, String password);
	
	public User getUserInfo(int userId);
}
