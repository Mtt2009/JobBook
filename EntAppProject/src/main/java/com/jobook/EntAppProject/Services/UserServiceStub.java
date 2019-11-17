package com.jobook.EntAppProject.Services;

import org.springframework.stereotype.Component;

import com.jobook.EntAppProject.model.Address;
import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
import com.jobook.EntAppProject.model.User;

@Component
public class UserServiceStub implements IUserService {
	
	public User login(String userName, String password) {
		User user = null;
		String trimmedUserName = userName.trim();
		String trimmedPassword = password.trim();
		if ((trimmedUserName.equalsIgnoreCase("test") || trimmedUserName.equalsIgnoreCase("test@test.com")) && trimmedPassword.equals("Password"))
		{
			user = new User(null, "Stub", "Testing", "Test", "Password", "Test@Test.com", 0, null, "C");
			Address address = new Address("Cincinnati", "Ohio", "45206", "123 Test Rd.", "", 0);
			user.setAddress(address);
			user.setAddressId(address.getId());			
		}
		
		if ((trimmedUserName.equalsIgnoreCase("testemployee") || trimmedUserName.equalsIgnoreCase("testemyployee@test.com")) && trimmedPassword.equals("Password"))
		{
			user = new User(null, "Stub", "Testing", "TestEmployee", "Password", "TestEmployee@Test.com", 1, null, "E");
			Address address = new Address("Cincinnati", "Ohio", "45206", "123 Test Rd.", "", 0);
			user.setAddress(address);
			user.setAddressId(address.getId());			
		}
		
		user = convertUser(user);
		return user;
	}

	private User convertUser(User user) {
		if (user != null && user.getUserType().equals("C"))
			user = new Customer(user.getAddress(), user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassword(), user.getEmail(), user.getId(), user.getAddressId(), user.getUserType());
		else if (user != null && user.getUserType().equals("E"))
			user = new Employee(user.getAddress(), user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassword(), user.getEmail(), user.getId(), user.getAddressId(), user.getUserType());
		return user;
	}

	public User getUserInfoById(int userId) {
		User user = null;
		switch (userId) {
			case 0: {
				user = new User(null, "Stub", "Testing", "Test", "Password", "Test@Test.com", 0, null, "C");
				break;
			}
			case 1: {
				user = new User(null, "Stub", "Testing", "TestEmployee", "Password", "TestEmployee@Test.com", 1, null, "E");
				break;
			}
		}
		Address address = new Address("Cincinnati", "Ohio", "45206", "123 Test Rd.", "", 0);
		user.setAddress(address);
		user.setAddressId(address.getId());
		user = convertUser(user);
		return user;
	}

}
