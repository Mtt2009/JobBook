package com.jobook.EntAppProject.Services;

import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.dto.UserDTO;

@Component
public class UserServiceStub2 {

	public UserDTO fetchById(int id) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(12);
		userDTO.setUserName("BearcatUC");
		return userDTO;
	}
	
	public void save(UserDTO userDTO) {
	}
}