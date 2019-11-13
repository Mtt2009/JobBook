package com.jobook.EntAppProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobook.EntAppProject.Services.IUserService;
import com.jobook.EntAppProject.model.Customer;
import com.jobook.EntAppProject.model.Employee;
import com.jobook.EntAppProject.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceUnitTests {
	@Autowired
	IUserService userService;

	@Test
	public void customerLogin()
	{
		User user = userService.login("test", "Password");
		assertTrue(user instanceof Customer);
		assertNotNull(user);
	}

	@Test
	public void employeeLogin()
	{
		User user = userService.login("testEmployee", "Password");
		assertTrue(user instanceof Employee);
		assertNotNull(user);
	}

	@Test
	public void badLogin()
	{
		User user = userService.login("test", "PasswordWrong");
		assertNull(user);
	}

	@Test
	public void lookupUserById()
	{
		User user = userService.getUserInfoById(0);
		assertNotNull(user);
	}

	@Test
	public void badLookupUserById()
	{
		User user = userService.getUserInfoById(5);
		assertNull(user);
	}
}
