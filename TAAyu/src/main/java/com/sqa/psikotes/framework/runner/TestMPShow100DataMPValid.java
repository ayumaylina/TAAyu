package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMPShow100DataMPValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPShow100DataMPValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP008 Admin berhasil masuk halaman modul")
	public void tsmp008_admin_berhasil_masuk_halaman_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman modul");
	}

	@When("TSMP008001 admin klik dropdown show data100")
	public void tsmp008001_admin_klik_dropdown_show_data100() {
	    modulPage.selectAHundred();
	    extentTest.log(LogStatus.PASS, "Tampil dropdown show data100");
	}

	@Then("TSMP008001 Tampil100 data modul")
	public void tsmp008001_tampil100_data_modul() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 100 data modul");
	}

	@When("TSMP008002 admin klik button page1")
	public void tsmp008002_admin_klik_button_page1() {
		modulPage.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Tampil 100 data modul pada page1");
	}

	@Then("TSMP008002 Tampil100 data modul pada page ke1")
	public void tsmp008002_tampil100_data_modul_pada_page_ke1() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 100 data modul pada page ke1");
	}
}
