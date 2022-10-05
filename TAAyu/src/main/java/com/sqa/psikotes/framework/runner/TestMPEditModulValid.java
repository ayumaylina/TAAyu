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

public class TestMPEditModulValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditModulValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}

	@Given("TSMP018 Admin berhasil membuka form edit data modul")
	public void tsmp018_admin_berhasil_membuka_form_edit_data_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pikotestCoba");
		modulPage.enter();
		modulPage.clickPageThree();
		modulPage.clickBtnEditModul();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit data modul");
	}

	@When("^TSMP018 Admin klik input (.*), (.*), (.*), (.*), (.*), (.*) dan (.*)$")
	public void tsmp018_admin_klik_input_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_dan_status_modul(String nama_modul, String tipe_modul, String waktu_pengerjaan, String jumlah_soal, String kategori, String deskripsi, String status_modul) {
	    modulPage.editModul(nama_modul, tipe_modul, waktu_pengerjaan, jumlah_soal, kategori, deskripsi, status_modul);
	    extentTest.log(LogStatus.PASS, "Admin input Add Modul");
	}

	@When("TSMP018 Admin klik update")
	public void tsmp018_admin_klik_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, "Admin klik update");
	}

	@Then("TSMP018 Data modul berhasil ditambahkan")
	public void tsmp018_data_modul_berhasil_ditambahkan() {
		modulPage.getTxtEditModul();
	    assertTrue(modulPage.getTxtEditModul().contains("Modul"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan modul");
	}
}
