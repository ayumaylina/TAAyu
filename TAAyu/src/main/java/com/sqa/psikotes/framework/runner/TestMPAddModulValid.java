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

public class TestMPAddModulValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddModulValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP003 Admin berhasil membuka form add data modul")
	public void tsmp003_admin_berhasil_membuka_form_add_data_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickBtnAddModul();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add data modul");
	}

	@When("^TSMP003 Admin klik input (.*), (.*), (.*), (.*) dan (.*)$")
	public void tsmp003_admin_klik_input_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_dan_status_modul(String nama_modul, String tipe_modul, String kategori, String deskripsi, String status_modul) {
	    modulPage.insertAddModul(nama_modul, tipe_modul, kategori, deskripsi, status_modul);
	    extentTest.log(LogStatus.PASS, "Admin input Add Modul");
	}

	@When("TSMP003 Admin klik save")
	public void tsmp003_admin_klik_save() {
	    modulPage.clickBtnSave();
	    extentTest.log(LogStatus.PASS, "Admin klik save");
	}

	@When("TSMP003 Admin klik ok")
	public void tsmp003_admin_klik_ok() {
	    modulPage.clickBtnOkAddModul();
	    extentTest.log(LogStatus.PASS, "Admin klik ok");
	}

	@Then("TSMP003 Data modul baru berhasil ditambahkan")
	public void tsmp003_data_modul_baru_berhasil_ditambahkan() {
	    modulPage.getTxtAddModul();
	    assertTrue(modulPage.getTxtAddModul().contains("Modul"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan modul");
	}
}
