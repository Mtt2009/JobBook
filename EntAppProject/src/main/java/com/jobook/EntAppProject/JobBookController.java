package com.jobook.EntAppProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobBookController {
	
	@RequestMapping("/JBLogin")
	public String login() {
		return "JBLogin";
	}
	
	@RequestMapping("/JBWelcomeScreen")
	public String welcome() {
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
	public String UserProfile() {
		return "JBUserProfile";
	}
	
}
