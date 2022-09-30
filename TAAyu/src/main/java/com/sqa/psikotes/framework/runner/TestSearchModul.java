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

public class TestSearchModul {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestSearchModul() {
		driver = SceneHooks.driver; 
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP002 Admin harus klik field search Data Modul pada halaman Data Modul")
	public void tsmp002_admin_harus_klik_field_search_data_modul_pada_halaman_data_modul() {
		driver.get(Constants.URL);
		modulPage.clickOK();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		
	}

	@When("TSMP002001 admin mengetik nama modul")
	public void tsmp002001_admin_mengetik_nama_modul() {
	    modulPage.search("Leader");
	    extentTest.log(LogStatus.PASS, "Admin mengetik nama modul");
	}

	@And("TSMP002001 admin menekan enter")
	public void tsmp002001_admin_menekan_enter() {
	    modulPage.enter();
	    extentTest.log(LogStatus.PASS, "Admin menekan enter");
	}

	@Then("TSMP002001 Tampil data berdasarkan nama yang dicari")
	public void tsmp002001_tampil_data_berdasarkan_nama_yang_dicari() {
		//assertEquals(modulPage.getTxtSearch(), "Logika");
		assertTrue(modulPage.getTxtSearch().contains("Leader"));
		extentTest.log(LogStatus.PASS, "Tampil data berdasarkan nama yang dicari");
	}

	@When("TSMP002002 admin mengetik nama modul")
	public void tsmp002002_admin_mengetik_nama_modul() {
	   modulPage.search("Leader");
	   extentTest.log(LogStatus.PASS, "Admin mengetik nama modul");
	}

	@And("TSMP002002 admin klik button hijau")
	public void tsmp002002_admin_klik_button_hijau() {
	    modulPage.clickBtnHijau();
	    extentTest.log(LogStatus.PASS, "Admin klik button hijau");
	}

	@Then("TSMP002002 Tampil data berdasarkan nama yang dicari")
	public void tsmp002002_tampil_data_berdasarkan_nama_yang_dicari() {
		assertTrue(modulPage.getTxtSearch().contains("Leader"));
		extentTest.log(LogStatus.PASS, "Tampil data berdasarkan nama yang dicari");
	}

	@When("TSMP002003 admin mengetik nama modul")
	public void tsmp002003_admin_mengetik_nama_modul() {
		 modulPage.search("Leader");
		 extentTest.log(LogStatus.PASS, "Admin mengetik nama modul");
	}

	@And("TSMP002003 admin klik button search")
	public void tsmp002003_admin_klik_button_search() {
	    modulPage.clickBtnSearch();
	}

	@Then("TSMP002003 Tampil data berdasarkan nama yang dicari")
	public void tsmp002003_tampil_data_berdasarkan_nama_yang_dicari() {
		assertTrue(modulPage.getTxtSearch().contains("Leader"));
		extentTest.log(LogStatus.PASS, "Tampil data berdasarkan nama yang dicari");
	}
	
	
	
	

}
