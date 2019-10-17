package com.jobook.Services;


import com.jobook.model.User;


public interface IUserService {
	/**
	 * pulls user info based on provided login information
	 * @param userName
	 * @param password
	 * @return
	 */
	User login(String userName, String password);
	
	/**
	 * pulls available userData when provided with a userId
	 * @param userId
	 * @return
	 */
	User getUserInfoById(int userId);
}
