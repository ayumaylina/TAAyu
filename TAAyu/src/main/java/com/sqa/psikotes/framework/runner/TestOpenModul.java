package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOpenModul {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	//private LoginPage loginPage = new LoginPage ();
	private ModulPage modulPage = new ModulPage ();
	
	public TestOpenModul() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}

	@Given("Admin harus membuka halaman utama web")
	public void admin_go_to_page_login() throws InterruptedException {
		driver.get(Constants.URL);
		modulPage.loginValid("developer", "23");
		extentTest.log(LogStatus.PASS, "Admin go to main page");
	}

	@When("TSMP001001 admin klik menu task")
	public void tsmp001001_admin_klik_menu_task() {
	    modulPage.clickMenuTask();
	    extentTest.log(LogStatus.PASS, "admin_click_menu_task");
	}

	@And("TSMP001001 admin klik submenu modul")
	public void tsmp001001_admin_klik_submenu_modul() {
	    modulPage.clickSubmenuModul();
	    extentTest.log(LogStatus.PASS, "admin_click_submenu_modul");
	}
	
	@Then("TSMP001001 admin berhasil buka halaman modul")
	public void tsmp001001_admin_berhasil_buka_halaman_modul() {
//	    modulPage.clickSubmenuModul();
	    assertTrue(modulPage.getTxtModul().contains("Modul"));
	    extentTest.log(LogStatus.PASS, "admin_berhasil_buka halaman_modul");
	}
}
