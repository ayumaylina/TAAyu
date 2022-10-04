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

public class TestMPAddSoalPilihanGandaValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddSoalPilihanGandaValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP009 Admin berhasil membuka form add soal pilihan ganda")
	public void tsmp009_admin_berhasil_membuka_form_add_soal_pilihan_ganda() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pilihanganda");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add soal pilihan ganda");
	}

	@When("^TSMP009 Admin input soal, pilihan A, pilihan B, pilihan C, pilihan D, pilihan E, (.*)$")
	public void tsmp009_admin_input_soal_pilihan_a_pilihan_b_pilihan_c_pilihan_d_pilihan_e_kunci_jawaban_dan_file_gambar(String kunci_jawaban) {
	    modulPage.insertAddSoalPilihanGanda(kunci_jawaban);
	    extentTest.log(LogStatus.PASS, "Admin input Soal Pilihan Ganda");
	}

	@When("TSMP009 Admin klik add soal")
	public void tsmp009_admin_klik_add_soal() {
	    modulPage.clickBtnAddSoal();
	    extentTest.log(LogStatus.PASS, "Admin klik Add Soal");
	}

	@Then("TSMP009 Data soal berhasil diupload")
	public void tsmp009_data_soal_berhasil_diupload() {
	    modulPage.getTxtAddSoal();
	    assertTrue(modulPage.getTxtAddSoal().contains("Berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan soal pilihan ganda");
	}
}
