//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMPAddDeskripsiValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulPage modulPage = new ModulPage();
	
	public TestMPAddDeskripsiValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSMP019001
	@Given("TSMP019001 Admin sudah login dan sudah membuka halaman modul")
	public void TSMP019001_admin_sudah_login_dan_sudah_membuka_halaman_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		extentTest.log(LogStatus.PASS, "Admin sudah login dan sudah membuka halaman modul");
	}

	@When("TSMP019001 Admin klik icon plus")
	public void TSMP019001_admin_klik_icon_plus() {
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin klik icon plus");
	}

	@Then("TSMP019001 Muncul pop up")
	public void TSMP019001_muncul_pop_up() {
	    assertTrue(modulPage.getTxtJudulDesk().contains("Deskripsi"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}
	
//	TSMP019002
	@Given("TSMP019002 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void TSMP019002_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}
	
	@When("TSMP019002 Admin mengisi field Deskripsi modul")
	public void TSMP019002_admin_mengisi_field_deskripsi_modul() {
	    String desk = "Ini Deskripsi";
	    modulPage.insertDesk(desk);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Deskripsi modul");
	}

	@When("TSMP019002 Admin klik tombol ADD")
	public void TSMP019002_admin_klik_tombol_add() {
	    modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMP019002 Deskripsi bertambah")
	public void TSMP019002_deskripsi_bertambah() {
	    assertEquals(modulPage.getTxtDeskModul(), "Ini Deskripsi");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}

	@Then("TSMP019002 Deskripsi dihapus")
	public void TSMP019002_deskripsi_dihapus() {
	    modulPage.clickDeleteDesk();
	    modulPage.clickYaDesk();
	    modulPage.clickOKDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Deskripsi dihapus");
	}
	
//	TSMP019003
	@Given("TSMP019003 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void TSMP019003_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}

	@When("TSMP019003 Admin mengisi field Ketentuan soal")
	public void TSMP019003_admin_mengisi_field_ketentuan_soal() {
	    String ketSoal = "Ini ketentuan soal";
	    modulPage.insertKetSoal(ketSoal);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Ketentuan soal");
	}

	@When("TSMP019003 Admin klik tombol ADD")
	public void TSMP019003_admin_klik_tombol_add() {
		modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMP019003 Deskripsi bertambah")
	public void TSMP019003_deskripsi_bertambah() {
	    assertEquals(modulPage.getTxtKetSoal(), "Ini ketentuan soal");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}

	@Then("TSMP019003 Deskripsi dihapus")
	public void TSMP019003_deskripsi_dihapus() {
		modulPage.clickDeleteDesk();
	    modulPage.clickYaDesk();
	    modulPage.clickOKDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Deskripsi dihapus");
	}
	
//	TSMP019004
	@Given("TSMP019004 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void TSMP019004_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}

	@When("TSMP019004 Admin mengisi field Deskripsi modul")
	public void TSMP019004_admin_mengisi_field_deskripsi_modul() {
		String desk = "Ini Deskripsi";
	    modulPage.insertDesk(desk);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Deskripsi modul");
	}

	@When("TSMP019004 Admin mengisi field Ketentuan soal")
	public void TSMP019004_admin_mengisi_field_ketentuan_soal() {
		String ketSoal = "Ini ketentuan soal";
	    modulPage.insertKetSoal(ketSoal);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Ketentuan soal");
	}

	@When("TSMP019004 Admin klik tombol ADD")
	public void TSMP019004_admin_klik_tombol_add() {
		modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMP019004 Deskripsi bertambah")
	public void TSMP019004_deskripsi_bertambah() {
		assertEquals(modulPage.getTxtDeskModul(), "Ini Deskripsi");
		assertEquals(modulPage.getTxtKetSoal(), "Ini ketentuan soal");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}
}
