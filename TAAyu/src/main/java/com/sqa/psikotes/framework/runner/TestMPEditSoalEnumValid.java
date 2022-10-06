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

public class TestMPEditSoalEnumValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isSoalEmpty;
	private boolean isKunciJawabanEmpty;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditSoalEnumValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		
		this.isSoalEmpty = true;
		this.isKunciJawabanEmpty = true;
	}
	
	@Given("TSMP016 Admin berhasil membuka form edit soal enum")
	public void tsmp016_admin_berhasil_membuka_form_edit_soal_enum() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("enum(ya/tidak)");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		modulPage.clickBtnEditSoalPG();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit soal enum");
	}

	@When("^TSMP016 Admin edit (.*) dan (.*)$")
	public void tsmp016_admin_edit_soal_dan_kunci_jawaban(String soal, String kunciJawaban) {
		if(!soal.equals("")) {
	    	this.isSoalEmpty = false;
	    }
		if(!kunciJawaban.equals("")) {
	    	this.isKunciJawabanEmpty = false;
	    }
		
		modulPage.editSoalEnum(soal, kunciJawaban);
	    extentTest.log(LogStatus.PASS, "Admin edit Soal Enum");
	}

	@When("TSMP016 Admin klik update soal")
	public void tsmp016_admin_klik_update_soal() {
		modulPage.clickBtnUpdateSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin klik Update Soal");
	}

	@Then("TSMP016 Data soal berhasil di update")
	public void tsmp016_data_soal_berhasil_di_update() {
		modulPage.getTxtEditSoal();
		 assertTrue(modulPage.getTxtEditSoal().contains("Berhasil"));
		 extentTest.log(LogStatus.PASS, "Admin berhasil update soal enum");
	}
}
