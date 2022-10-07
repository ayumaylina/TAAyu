//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

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

public class TestMPEditDeskripsiValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulPage modulPage = new ModulPage();
	
	public TestMPEditDeskripsiValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSMP002001
	@Given("TSMP020001 Admin sudah membuka tambah deskripsi")
	public void TSMP020001_admin_sudah_membuka_tambah_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka tambah deskripsi");
	}

	@When("TSMP020001 Admin klik icon edit")
	public void TSMP020001_admin_klik_icon_edit() {
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@Then("TSMP020001 Muncul pop up")
	public void TSMP020001_muncul_pop_up() {
	    assertTrue(modulPage.getTxtEditDesk().contains("EDIT DESKRIPSI"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}
	
//	TSMP020002
	@Given("TSMP020002 Admin sudah masuk ke pop up edit deskripsi")
	public void TSMP020002_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMP020002 Admin isi field Deskripsi soal")
	public void TSMP020002_admin_isi_field_deskripsi_soal() {
	    String editDesk = "Ini deskripsi baru";
	    modulPage.editDesk(editDesk);
	    extentTest.log(LogStatus.PASS, "Admin isi field Deskripsi soal");
	}

	@When("TSMP020002 Admin klik tombol UPDATE")
	public void TSMP020002_admin_klik_tombol_update() {
	    modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMP020002 Muncul pop up")
	public void TSMP020002_muncul_pop_up() {
	    assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMP020002 Admin klik OK")
	public void TSMP020002_admin_klik_ok() {
	    modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMP020003
	@Given("TSMP020003 Admin sudah masuk ke pop up edit deskripsi")
	public void TSMP020003_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMP020003 Admin isi field Ketentuan soal")
	public void TSMP020003_admin_isi_field_ketentuan_soal() {
		String editKetentuan = "Ini ketentuan soal baru";
	    modulPage.editKetSoal(editKetentuan);
	    extentTest.log(LogStatus.PASS, "Admin isi field Ketentuan soal");
	}

	@When("TSMP020003 Admin klik tombol UPDATE")
	public void TSMP020003_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMP020003 Muncul pop up")
	public void TSMP020003_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMP020003 Admin klik OK")
	public void TSMP020003_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMP020004
	@Given("TSMP020004 Admin sudah masuk ke pop up edit deskripsi")
	public void TSMP020004_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMP020004 Admin isi field Deskripsi soal")
	public void TSMP020004_admin_isi_field_deskripsi_soal() {
		String editDesk = "Ini deskripsi baru lagiii";
	    modulPage.editDesk(editDesk);
	    extentTest.log(LogStatus.PASS, "Admin isi field Deskripsi soal");
	}

	@When("TSMP020004 Admin isi field Ketentuan soal")
	public void TSMP020004_admin_isi_field_ketentuan_soal() {
		String editKetentuan = "Ini ketentuan soal baru lagiiii";
	    modulPage.editKetSoal(editKetentuan);
	    extentTest.log(LogStatus.PASS, "Admin isi field Ketentuan soal");
	}

	@When("TSMP020004 Admin klik tombol UPDATE")
	public void TSMP020004_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMP020004 Muncul pop up")
	public void TSMP020004_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMP020004 Admin klik OK")
	public void TSMP020004_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMP020005
	@Given("TSMP020005 Admin sudah masuk ke pop up edit deskripsi")
	public void TSMP020005_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMP020005 Admin hapus value di field Deskripsi soal")
	public void TSMP020005_admin_hapus_value_di_field_deskripsi_soal() {
	    modulPage.clearDesk();
	    extentTest.log(LogStatus.PASS, "Admin hapus value di field Deskripsi soal");
	}

	@When("TSMP020005 Admin klik tombol UPDATE")
	public void TSMP020005_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMP020005 Muncul pop up")
	public void TSMP020005_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMP020005 Admin klik OK")
	public void TSMP020005_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

//	TSMP020006
	@Given("TSMP020006 Admin sudah masuk ke pop up edit deskripsi")
	public void TSMP020006_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMP020006 Admin hapus value di field Ketentuan soal")
	public void TSMP020006_admin_hapus_value_di_field_ketentuan_soal() {
		modulPage.clearKetSoal();
	    extentTest.log(LogStatus.PASS, "Admin hapus value di field Ketentuan soal");
	}

	@When("TSMP020006 Admin klik tombol UPDATE")
	public void TSMP020006_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMP020006 Muncul pop up")
	public void TSMP020006_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMP020006 Admin klik OK")
	public void TSMP020006_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

}

