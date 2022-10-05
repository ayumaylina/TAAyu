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

public class TestMPAddSoalPilihanABValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPAddSoalPilihanABValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}

	@Given("TSMP013 Admin berhasil membuka form add soal pilihan ab")
	public void tsmp013_admin_berhasil_membuka_form_add_soal_pilihan_ab() {
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

	@When("^TSMP013 Admin input pilihan A, pilihan B, (.*) dan (.*)$")
	public void tsmp013_admin_input_pilihan_a_pilihan_b_kunci_jawaban_dan_gambar(String kunciJawaban, String gambar) {
		if (gambar.equals("")) {
			 modulPage.insertAddSoalPilihanAB(kunciJawaban, gambar);
			 System.out.println("tidak ada gambar");
	    }
		else {
			 System.out.println(" ada gambar");
		    gambar = System.getProperty("user.dir")+gambar;
		    modulPage.insertAddSoalPilihanAB(kunciJawaban, gambar);
		}
		    extentTest.log(LogStatus.PASS, "Admin berhasil input pilihan A, B, kunci jawaban dan gambar");
	}

	@When("TSMP013 Admin klik add soal")
	public void tsmp013_admin_klik_add_soal() {
		 modulPage.clickBtnAddSoal();
		    extentTest.log(LogStatus.PASS, "Admin klik add soal");
	}

	@Then("TSMP013 Data soal berhasil diupload")
	public void tsmp013_data_soal_berhasil_diupload() {
		modulPage.getTxtAddSoal();
	    assertTrue(modulPage.getTxtAddSoal().contains("Berhasil"));
	    extentTest.log(LogStatus.PASS, "Admin berhasil menambahkan soal pilihan A/B");
	}
}
