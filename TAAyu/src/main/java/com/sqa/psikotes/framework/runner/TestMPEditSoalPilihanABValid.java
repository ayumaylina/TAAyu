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

public class TestMPEditSoalPilihanABValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isPilihanA;
	private boolean isPilihanB;
	private boolean isKunciJawabanEmpty;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditSoalPilihanABValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		this.isPilihanA = true;
		this.isPilihanB = true;
		this.isKunciJawabanEmpty = true;
	}

	@Given("TSMP022 Admin berhasil membuka form edit soal pilihan ab")
	public void tsmp022_admin_berhasil_membuka_form_edit_soal_pilihan_ab() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pilihanA/B");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		modulPage.clickBtnEditSoalPG();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit soal pilihan AB");
	}

	@When("^TSMP022 Admin edit (.*), (.*) dan (.*)$")
	public void tsmp022_admin_edit_pilihan_a_pilihan_b_dan_kunci_jawaban(String pilihanA, String pilihanB, String kunciJawaban) {
		if(!pilihanA.equals("")) {
	    	this.isPilihanA = false;
	    }
		
		if(!pilihanB.equals("")) {
	    	this.isPilihanB = false;
	    }
		
		if(!kunciJawaban.equals("")) {
	    	this.isKunciJawabanEmpty = false;
	    }
		
		modulPage.editSoalPilihanAB(pilihanA, pilihanB, kunciJawaban);
	    extentTest.log(LogStatus.PASS, "Admin edit Soal pilihan AB");
	}

	@When("TSMP022 Admin klik update soal")
	public void tsmp022_admin_klik_update_soal() {
		modulPage.clickBtnUpdateSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin klik Update Soal");
	}

	@Then("TSMP022 Data soal berhasil di update")
	public void tsmp022_data_soal_berhasil_di_update() {
		 modulPage.getTxtEditSoal();
		 assertTrue(modulPage.getTxtEditSoal().contains("Berhasil"));
		 extentTest.log(LogStatus.PASS, "Admin berhasil update soal enum");
	}
}
