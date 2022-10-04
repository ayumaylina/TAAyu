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

public class TestMPShow25DataMPValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPShow25DataMPValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	@Given("TSMP005 Admin memilih icon show page25")
	public void tsmp005_admin_memilih_icon_show_page25() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
//		modulPage.clickDropJumlahData();
		modulPage.selectTwentyFive();
		extentTest.log(LogStatus.PASS, "Admin memilih icon show page25");
	}

	@When("TSMP005001 admin klik button page1")
	public void tsmp005001_admin_klik_button_page1() {
	    modulPage.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik button page 1");
	}

	@Then("TSMP005001 Tampil25 data modul pada page ke1")
	public void tsmp005001_tampil25_data_modul_pada_page_ke1() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 25 data pada page ke 1");
	}

	@When("TSMP005002 admin klik button page >>")
	public void tsmp005002_admin_klik_button_page() {
	    modulPage.clickPageNextI();
	    extentTest.log(LogStatus.PASS, "Admin klik button page terakhir");
	}

	@Then("TSMP005002 Tampil25 data modul pada page terakhir")
	public void tsmp005002_tampil25_data_modul_pada_page_terakhir() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 25 data pada page ke terakhir");
	}

	@When("TSMP005003 admin klik button page2")
	public void tsmp005003_admin_klik_button_page2() {
		modulPage.clickPageTwo();
	    extentTest.log(LogStatus.PASS, "Admin klik button page 2");
	}

	@Then("TSMP005003 Tampil25 data modul pada page ke2")
	public void tsmp005003_tampil25_data_modul_pada_page_ke2() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 26 data pada page ke 2");
	}

	@When("TSMP005004 admin klik button page <<")
	public void tsmp005004_admin_klik_button_page() {
		modulPage.clickPagePrevious();
		extentTest.log(LogStatus.PASS, "Admin klik button <<");
	}

	@Then("TSMP005004 Tampil25 data modul pada page pertama")
	public void tsmp005004_tampil25_data_modul_pada_page_pertama() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 25 data pada page pertama");
	}
}
