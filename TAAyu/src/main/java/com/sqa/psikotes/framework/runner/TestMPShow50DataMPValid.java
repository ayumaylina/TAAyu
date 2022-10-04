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

public class TestMPShow50DataMPValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPShow50DataMPValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP006 Admin berhasil masuk halaman modul")
	public void tsmp006_admin_berhasil_masuk_halaman_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman modul");
	}

	@When("TSMP006001 admin klik dropdown show data50")
	public void tsmp006001_admin_klik_dropdown_show_data50() {
	    modulPage.clickDropJumlahData();
	    modulPage.selectFifty();
	    extentTest.log(LogStatus.PASS, "Tampil dropdown show data50");
	}

	@Then("TSMP006001 Tampil50 data modul")
	public void tsmp006001_tampil50_data_modul() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 50 data modul");
	}

	@When("TSMP006002 admin klik button page1")
	public void tsmp006002_admin_klik_button_page1() {
	    modulPage.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Tampil 50 data modul pada page1");
	}

	@Then("TSMP006002 Tampil50 data modul pada page ke1")
	public void tsmp006002_tampil50_data_modul_pada_page_ke1() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 50 data modul pada page ke1");
	}
}
