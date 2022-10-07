package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestMPEditDataModulValid {

	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditDataModulValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	

	@Given("TSMP018001 Admin berhasil masuk form edit modul")
	public void tsmp018001_admin_berhasil_masuk_form_edit_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("psikotestCoba");
		modulPage.enter();
		modulPage.clickBtnEditModul();
		extentTest.log(LogStatus.PASS, "Admin berhasil masuk form edit modul");
	}

	@When("^TSMP018001 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018001_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit dua field data modul");
		
	}

	@When("TSMP018001 Admin klik tombol update")
	public void tsmp018001_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, "Admin klik tombol update");
	}


	@When("TSMP018001 Data modul berhasil diedit")
	public void tsmp018001_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}
	
	@When("^TSMP018002 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018002_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit tiga field data modul");
		
	}

	@When("TSMP018002 Admin klik tombol update")
	public void tsmp018002_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, " Admin klik tombol update");
	}


	@When("TSMP018002 Data modul berhasil diedit")
	public void tsmp018002_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}

	
	@When("^TSMP018003 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018003_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit empat field data modul");
		
	}

	@When("TSMP018003 Admin klik tombol update")
	public void tsmp018003_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, " Admin klik tombol update");
	}


	@When("TSMP018003 Data modul berhasil diedit")
	public void tsmp018003_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}
	
	
	@When("^TSMP018004 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018004_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit lima field data modul");
		
	}

	@When("TSMP018004 Admin klik tombol update")
	public void tsmp018004_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, " Admin klik tombol update");
	}


	@When("TSMP018004 Data modul berhasil diedit")
	public void tsmp018004_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}
	
	@When("^TSMP018005 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018005_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit enam field  data modul");
		
	}

	@When("TSMP018005 Admin klik tombol update")
	public void tsmp018005_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, " Admin klik tombol update");
	}


	@When("TSMP018005 Data modul berhasil diedit")
	public void tsmp018005_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}
	
	@When("^TSMP018006 Admin edit field (.*), (.*), (.*), (.*),(.*), (.*), (.*) modul$")
	public void tsmp018006_admin_edit_field_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_status_modul_modul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {

		modulPage.updateDataModul(namaModul, tipeModul, waktuPengerjaan, jumlahSoal, kategori, deskripsi, statusModul);
		
		extentTest.log(LogStatus.PASS, "Admin edit enam field  data modul");
		
	}

	@When("TSMP018006 Admin klik tombol update")
	public void tsmp018006_admin_klik_tombol_update() {
	   modulPage.clickBtnUpdateModul();
	   extentTest.log(LogStatus.PASS, " Admin klik tombol update");
	}


	@When("TSMP018006 Data modul berhasil diedit")
	public void tsmp018006_data_modul_berhasil_diedit() {
		String strDoneUpdate = "Modul Berhasil Ditambahkan";
		assertTrue(modulPage.getTxtEditModul().contains(strDoneUpdate));
		extentTest.log(LogStatus.PASS, "Data modul berhasil diedit");
	}
}
