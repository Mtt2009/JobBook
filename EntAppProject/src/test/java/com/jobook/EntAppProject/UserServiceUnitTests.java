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
	
	User user;
	
	@Before
	public void BeforeEachTest()
	{
		user = null;
	}
	
	@Test
	public void customerLogin()
	{
		customerUserTriesToLogin();
		
		assertTrue(user instanceof Customer);
		assertNotNull(user);
	}
	
	private void customerUserTriesToLogin() {
		user = userService.login("test", "Password");
	}

	@Test
	public void employeeLogin()
	{
		employeeUserTriesToLogin();
		assertTrue(user instanceof Employee);
		assertNotNull(user);
	}
	
	private void employeeUserTriesToLogin() {
		user = userService.login("testEmployee", "Password");
	}

	@Test
	public void badLogin()
	{
		badUserTriesToLogin();
		assertNull(user);
	}

	private void badUserTriesToLogin() {
		user = userService.login("test", "PasswordWrong");
	}
	
	@Test
	public void lookupUserById()
	{
		user = userService.getUserInfoById(0);
		assertNotNull(user);
	}
	
	@Test 
	public void badLookupUserById()
	{
		user = userService.getUserInfoById(5);
		assertNull(user);
	}
}
