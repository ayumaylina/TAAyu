package com.sqa.psikotes.framework.runner;



import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestLoginValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private LoginPage loginPage = new LoginPage ();
	
	public TestLoginValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("Admin go to page login")
	public void admin_go_to_page_login() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Browser open page login");
	}

	@When("TSLP001001 admin enter username and password valid")
	public void tslp001001_admin_enter_username_and_password_valid() throws InterruptedException {
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		loginPage.loginValidTwo(username, password);
		extentTest.log(LogStatus.PASS, "admin_valid_username_and_password");

	}

	@Then("TSLP001001 The system check credentsial login valid")
	public void tslp001001_the_system_check_credentsial_login_valid() {
		
	}
}
