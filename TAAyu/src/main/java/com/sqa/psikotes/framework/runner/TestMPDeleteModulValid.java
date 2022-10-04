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

public class TestMPDeleteModulValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPDeleteModulValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}

	@Given("TSMP007 Admin berhasil masuk halaman modul")
	public void tsmp007_admin_berhasil_masuk_halaman_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pikotestCoba");
		modulPage.enter();
		modulPage.clickPageTwo();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk halaman modul dan search modul yang ingin dihapus");
	}

	@When("TSMP007 Admin klik button hapus")
	public void tsmp007_admin_klik_button_hapus() {
	    modulPage.clickBtnHapusModul();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus modul");
	}

	@When("TSMP007 Admin klik button iya")
	public void tsmp007_admin_klik_button_iya() {
	    modulPage.clickBtnIyaHapus();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP007 Data modul baru berhasil dihapus")
	public void tsmp007_data_modul_baru_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}
}
