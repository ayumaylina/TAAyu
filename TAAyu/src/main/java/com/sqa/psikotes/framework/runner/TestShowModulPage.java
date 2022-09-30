//Author: Ayu
//Created Date : 30/9/2022
//Modified Date : 

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

public class TestShowModulPage {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestShowModulPage() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP004 Admin memilih icon show page10")
	public void tsmp004_admin_memilih_icon_show_page10() {
		driver.get(Constants.URL);
		modulPage.clickOK();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
	}

	@When("TSMP004001 admin klik button page1")
	public void tsmp004001_admin_klik_button_page1() {
	    modulPage.clickPageOne();
	    extentTest.log(LogStatus.PASS, "Admin klik button page 1");
	}

	@Then("TSMP004001 Tampil10 data modul pada page ke1")
	public void tsmp004001_tampil10_data_modul_pada_page_ke1() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page ke 1");
	}

	@When("TSMP004002 admin klik button page2")
	public void tsmp004002_admin_klik_button_page2() {
		 modulPage.clickPageTwo();
		 extentTest.log(LogStatus.PASS, "Admin klik button page 2");
	}

	@Then("TSMP004002 Tampil10 data modul pada page ke2")
	public void tsmp004002_tampil10_data_modul_pada_page_ke2() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page ke 2");
	}

	@When("TSMP004003 admin klik button page3")
	public void tsmp004003_admin_klik_button_page3() {
		modulPage.clickPageThree();
		extentTest.log(LogStatus.PASS, "Admin klik button page 3");
	}

	@Then("TSMP004003 Tampil10 data modul pada page ke3")
	public void tsmp004003_tampil10_data_modul_pada_page_ke3() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page ke 3");
	}

	@When("TSMP004004 admin klik button page4")
	public void tsmp004004_admin_klik_button_page4() {
		modulPage.clickPageFour();
		extentTest.log(LogStatus.PASS, "Admin klik button page 4");
	}

	@Then("TSMP004004 Tampil10 data modul pada page ke4")
	public void tsmp004004_tampil10_data_modul_pada_page_ke4() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page ke 4");
	}

	@When("TSMP004005 admin klik button page5")
	public void tsmp004005_admin_klik_button_page5() {
		modulPage.clickPageFive();
		extentTest.log(LogStatus.PASS, "Admin klik button page 5");
	}

	@Then("TSMP004005 Tampil10 data modul pada page ke5")
	public void tsmp004005_tampil10_data_modul_pada_page_ke5() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page ke 5");
	}

	@When("TSMP004006 admin klik button page >>")
	public void tsmp004006_admin_klik_button_page() {
		modulPage.clickPageNext();
		 extentTest.log(LogStatus.PASS, "Admin klik button >>");
	}

	@Then("TSMP004006 Tampil10 data modul pada page paling terakhir")
	public void tsmp004006_tampil10_data_modul_pada_page_paling_terakhir() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page paling terakhir");
	}

	@When("TSMP004007 admin klik button page <<")
	public void tsmp004007_admin_klik_button_page() {
		modulPage.clickPagePrevious();
		 extentTest.log(LogStatus.PASS, "Admin klik button page <<");
	}

	@Then("TSMP004007 Tampil10 data modul pada page paling awal")
	public void tsmp004007_tampil10_data_modul_pada_page_paling_awal() {
		assertTrue(modulPage.getTxtPage().contains("Showing"));
	    extentTest.log(LogStatus.PASS, "Tampil 10 data pada page paling awal");
	}
}
