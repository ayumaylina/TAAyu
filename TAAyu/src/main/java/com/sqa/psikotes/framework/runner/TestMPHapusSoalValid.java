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

public class TestMPHapusSoalValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPHapusSoalValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}

	@Given("TSMP017001 Admin berhasil masuk form template soal pilihan ganda")
	public void tsmp017001_admin_berhasil_masuk_form_template_soal_pilihan_ganda() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pilihanganda");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form template soal pilihan ganda");
	}

	@When("TSMP017001 Admin klik button hapus")
	public void tsmp017001_admin_klik_button_hapus() {
		modulPage.clickBtnHapusSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus soal");
	}

	@When("TSMP017001 Admin klik button iya")
	public void tsmp017001_admin_klik_button_iya() {
		 modulPage.clickBtnIyaHapus();
		 extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP017001 Data soal berhasil dihapus")
	public void tsmp017001_data_soal_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}

	@Given("TSMP017002 Admin berhasil masuk form template soal esai free text")
	public void tsmp017002_admin_berhasil_masuk_form_template_soal_esai_free_text() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("esaifreetext");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form template soal esai free text");
	}

	@When("TSMP017002 Admin klik button hapus")
	public void tsmp017002_admin_klik_button_hapus() {
		modulPage.clickBtnHapusSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus soal");
	}

	@When("TSMP017002 Admin klik button iya")
	public void tsmp017002_admin_klik_button_iya() {
		modulPage.clickBtnIyaHapus();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP017002 Data soal berhasil dihapus")
	public void tsmp017002_data_soal_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}

	@Given("TSMP017003 Admin berhasil masuk form template soal enum")
	public void tsmp017003_admin_berhasil_masuk_form_template_soal_enum() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("enum(ya/tidak)");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form template soal enum");
	}

	@When("TSMP017003 Admin klik button hapus")
	public void tsmp017003_admin_klik_button_hapus() {
		modulPage.clickBtnHapusSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus soal");
	}

	@When("TSMP017003 Admin klik button iya")
	public void tsmp017003_admin_klik_button_iya() {
		modulPage.clickBtnIyaHapus();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP017003 Data soal berhasil dihapus")
	public void tsmp017003_data_soal_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}

	@Given("TSMP017004 Admin berhasil masuk form template soal esai length")
	public void tsmp017004_admin_berhasil_masuk_form_template_soal_esai_length() {
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

	@When("TSMP017004 Admin klik button hapus")
	public void tsmp017004_admin_klik_button_hapus() {
		modulPage.clickBtnHapusSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus soal");
	}

	@When("TSMP017004 Admin klik button iya")
	public void tsmp017004_admin_klik_button_iya() {
		modulPage.clickBtnIyaHapus();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP017004 Data soal berhasil dihapus")
	public void tsmp017004_data_soal_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}

	@Given("TSMP017005 Admin berhasil masuk form template soal pilihan ab")
	public void tsmp017005_admin_berhasil_masuk_form_template_soal_pilihan_ab() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pilihanA/B");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form add soal pilihan AB");
	}

	@When("TSMP017005 Admin klik button hapus")
	public void tsmp017005_admin_klik_button_hapus() {
		modulPage.clickBtnHapusSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin berhasil klik button hapus soal");
	}

	@When("TSMP017005 Admin klik button iya")
	public void tsmp017005_admin_klik_button_iya() {
		modulPage.clickBtnIyaHapus();
		extentTest.log(LogStatus.PASS, "Admin berhasil klik button iya pada pop up");
	}

	@Then("TSMP017005 Data soal berhasil dihapus")
	public void tsmp017005_data_soal_berhasil_dihapus() {
		modulPage.getTxtHapusModul();
	    assertTrue(modulPage.getTxtHapusModul().contains("berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menghapus data modul");
	}
}
