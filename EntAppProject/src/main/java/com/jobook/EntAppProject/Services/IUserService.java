package com.jobook.EntAppProject.Services;


import com.jobook.EntAppProject.model.User;


public interface IUserService {
	/**
	 * pulls user info based on provided login infomation
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
