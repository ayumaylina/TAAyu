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

public class TestMPAddSoalEsaiFreeText {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isGambarEmpty;
	
	private String strGambar;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddSoalEsaiFreeText() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		
		this.isGambarEmpty = true;
	}
	
	@Given("TSMP010 Admin berhasil membuka form add soal Esai Free Text")
	public void tsmp010_admin_berhasil_membuka_form_add_soal_esai_free_text() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("esaifreetext");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add soal esai free text");
	}

	@When("^TSMP010 Admin input soal dan (.*)$")
	public void tsmp010_admin_input_soal_dan_gambar(String gambar) {
		if (gambar.equals("")) {
			 modulPage.insertAddSoalEsaiFreeText(gambar);
			 System.out.println("tidak ada gambar");
	    }
		else {
			 System.out.println(" ada gambar");
		    gambar = System.getProperty("user.dir")+gambar;
		    modulPage.insertAddSoalEsaiFreeText(gambar);
		}
		//modulPage.insertAddSoalEsaiFreeText(gambar);
	    extentTest.log(LogStatus.PASS, "Admin input soal");
	}

	@When("TSMP010 Admin klik add soal")
	public void tsmp010_admin_klik_add_soal() {
	    modulPage.clickBtnAddSoal();
	    extentTest.log(LogStatus.PASS, "Admin klik add soal");
	}

	@Then("TSMP010 Data soal berhasil diupload")
	public void tsmp010_data_soal_berhasil_diupload() {
		modulPage.getTxtAddSoal();
	    assertTrue(modulPage.getTxtAddSoal().contains("Berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan soal esai free text");
	}
}
