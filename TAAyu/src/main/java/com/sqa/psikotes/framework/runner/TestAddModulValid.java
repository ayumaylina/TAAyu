package com.sqa.psikotes.framework.runner;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.sqa.psikotes.framework.page.ModulPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddModulValid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestAddModulValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMP003 Admin berhasil membuka form add data modul")
	public void tsmp003_admin_berhasil_membuka_form_add_data_modul() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSMP003 Admin klik input nama_modul, tipe_modul, waktu_pengerjaan, jumlah_soal, kategori, deskripsi, dan status_modul")
	public void tsmp003_admin_klik_input_nama_modul_tipe_modul_waktu_pengerjaan_jumlah_soal_kategori_deskripsi_dan_status_modul() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSMP003 Admin klik save")
	public void tsmp003_admin_klik_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSMP003 Admin klik ok")
	public void tsmp003_admin_klik_ok() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSMP003 Admin klik ok1")
	public void tsmp003_admin_klik_ok1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("TSMP003 Data modul baru berhasil ditambahkan")
	public void tsmp003_data_modul_baru_berhasil_ditambahkan() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
