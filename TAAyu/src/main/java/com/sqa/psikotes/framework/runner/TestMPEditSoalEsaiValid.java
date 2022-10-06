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

public class TestMPEditSoalEsaiValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isSoalEmpty;
	private boolean isScoreEmpty;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditSoalEsaiValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		
		this.isSoalEmpty = true;
		this.isScoreEmpty = true;
	}
	
	@Given("TSMP015001 Admin berhasil membuka form edit soal esai free text")
	public void tsmp015001_admin_berhasil_membuka_form_edit_soal_esai_free_text() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("esaifreetext");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		modulPage.clickBtnEditSoalPG();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit soal esai free text");
	}

	@When("TSMP015001 Admin edit soal")
	public void tsmp015001_admin_edit_soal() {
	    modulPage.editSoalEsaiFreeText();
	    extentTest.log(LogStatus.PASS, "Admin berhasil edit soal esai free text");
	}

	@When("TSMP015001 Admin klik update soal")
	public void tsmp015001_admin_klik_update_soal() {
	    modulPage.clickBtnUpdateSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin klik Update Soal");
	}

	@Then("TSMP015001 Data soal berhasil di update")
	public void tsmp015001_data_soal_berhasil_di_update() {
		 modulPage.getTxtEditSoal();
		 assertTrue(modulPage.getTxtEditSoal().contains("Berhasil"));
		 extentTest.log(LogStatus.PASS, "Admin berhasil update soal esai free text");
	}

	@Given("TSMP015002 Admin berhasil membuka form edit soal esai length")
	public void tsmp015002_admin_berhasil_membuka_form_edit_soal_esai_length() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("esailength");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		modulPage.clickBtnEditSoalPG();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit soal esai length");
	}

	@When("^TSMP015002 Admin edit (.*) dan (.*)$")
	public void tsmp015002_admin_edit_soal_dan_score(String soal, String score) {
		if(!soal.equals("")) {
	    	this.isSoalEmpty = false;
	    }
	    
	    if(!score.equals("")) {
	    	this.isScoreEmpty = false;
	    }
		
		modulPage.editSoalEsaiLength(soal, score);
	    extentTest.log(LogStatus.PASS, "Admin edit Soal Esai Length");
	}

	@When("TSMP015002 Admin klik update soal")
	public void tsmp015002_admin_klik_update_soal() {
		 modulPage.clickBtnUpdateSoalPG();
		 extentTest.log(LogStatus.PASS, "Admin klik Update Soal");
	}

	@Then("TSMP015002 Data soal berhasil di update")
	public void tsmp015002_data_soal_berhasil_di_update() {
		modulPage.getTxtEditSoal();
		assertTrue(modulPage.getTxtEditSoal().contains("Berhasil"));
		extentTest.log(LogStatus.PASS, "Admin berhasil update soal Esai Length");
	}
}
