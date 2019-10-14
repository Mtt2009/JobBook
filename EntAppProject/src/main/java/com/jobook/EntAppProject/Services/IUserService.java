package com.jobook.EntAppProject.Services;


import com.jobook.EntAppProject.model.User;


public interface IUserService {
	/**
	 * pulls user info based on provided login information
	 * @param userName the username of the person who is logging in
	 * @param password the password of the person who is logging in
	 * @return the User, if login was successful
	 * @throws Exception any problem in the underlying query
	 */
	User login(String userName, String password) throws Exception;

	/**
	 * pulls available userData when provided with a userId
	 * @param userId the user id whose info you want
	 * @return the user, if found
	 * @throws Exception any problem in the underlying query
	 */
	User getUserInfoById(int userId) throws Exception;
}
