package com.jobook.EntAppProject.DAO.Interfaces;

import com.jobook.EntAppProject.model.User;

public interface IUserProvider {
	public User Login(String email, String password);
}
