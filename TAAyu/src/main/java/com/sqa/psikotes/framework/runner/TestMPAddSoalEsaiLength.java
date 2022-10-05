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

public class TestMPAddSoalEsaiLength {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddSoalEsaiLength() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP012 Admin berhasil membuka form add soal Esai Length")
	public void tsmp012_admin_berhasil_membuka_form_add_soal_esai_length() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("esailength");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add soal Esai Length");
	}

	@When("^TSMP012 Admin input soal dan (.*) dan (.*)$")
	public void tsmp012_admin_input_soal_dan_score_dan_gambar(String score, String gambar) {
		if (gambar.equals("")) {
			 modulPage.insertAddSoalEsaiLength(score, gambar);
			 System.out.println("tidak ada gambar");
	    }
		else {
			 System.out.println(" ada gambar");
		    gambar = System.getProperty("user.dir")+gambar;
		    modulPage.insertAddSoalEsaiLength(score, gambar);
		}
		//modulPage.insertAddSoalEsaiLength(score);
		    extentTest.log(LogStatus.PASS, "Admin berhasil input soal dan score");
	}

	@When("TSMP012 Admin klik add soal")
	public void tsmp012_admin_klik_add_soal() {
		modulPage.clickBtnAddSoal();
		 extentTest.log(LogStatus.PASS, "Admin klik Add Soal");
	}

	@Then("TSMP012 Data soal berhasil diupload")
	public void tsmp012_data_soal_berhasil_diupload() {
		modulPage.getTxtAddSoal();
	    assertTrue(modulPage.getTxtAddSoal().contains("Berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan soal Esaii Length");
	}
}
