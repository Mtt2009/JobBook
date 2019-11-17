package com.jobook.EntAppProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobook.EntAppProject.Services.UserServiceStub2;
import com.jobook.EntAppProject.dto.UserDTO;

@Controller
public class JobBookController {
	
	@Autowired
	private UserServiceStub2 userServiceStub2;
	
	@RequestMapping("/JBLogin")
	public String login() {
		return "JBLogin";
	}
	
	@RequestMapping("/")
	public String home() {
		return "JBLogin";
	}
	
	@RequestMapping("/JBWelcomeScreen")
	public String welcome(Model model) {
		UserDTO userDTO = userServiceStub2.fetchById(12);
		model.addAttribute("userDTO", userDTO);
		return "JBWelcomeScreen";
	}
	
	@RequestMapping("/JBCreateAccount")
	public String CreateAccount() {
		return "JBCreateAccount";
	}
	
	@RequestMapping("/JBCreateJobListing")
	public String CreateJobListing() {
		return "JBCreateJobListing";
	}
	
	@RequestMapping("/JBFindAJob")
	public String FindAJob() {
		return "JBFindAJob";
	}
	
	@RequestMapping("/JBForgotPassword")
	public String ForgotPassword() {
		return "JBForgotPassword";
	}
	
	@RequestMapping("/JBIntroSurvey")
	public String survey() {
		return "JBHIntroSurvey";
	}
	
	@RequestMapping("/JBUserProfile")
	public String UserProfile(Model model) {
		UserDTO userDTO = userServiceStub2.fetchById(12);
		model.addAttribute("userDTO", userDTO);
		return "JBUserProfile";
	}
	
}
