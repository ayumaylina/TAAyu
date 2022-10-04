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

public class TestMPAddSoalEnumValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddSoalEnumValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP011 Admin berhasil membuka form add soal Enum")
	public void tsmp011_admin_berhasil_membuka_form_add_soal_enum() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("enum(ya/tidak)");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add soal Enum");
	}

	@When("^TSMP011 Admin input soal dan (.*)$")
	public void tsmp011_admin_input_soal_dan_kunci_jawaban(String kunci_jawaban) {
	    modulPage.insertAddSoalEnum(kunci_jawaban);
	    extentTest.log(LogStatus.PASS, "Admin berhasil input soal dan kunci jawaban");
	}

	@When("TSMP011 Admin klik add soal")
	public void tsmp011_admin_klik_add_soal() {
		 modulPage.clickBtnAddSoal();
		 extentTest.log(LogStatus.PASS, "Admin klik Add Soal");
	}

	@Then("TSMP011 Data soal berhasil diupload")
	public void tsmp011_data_soal_berhasil_diupload() {
		modulPage.getTxtAddSoal();
	    assertTrue(modulPage.getTxtAddSoal().contains("Berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan soal enum (Ya/Tidak)");
	}
}
