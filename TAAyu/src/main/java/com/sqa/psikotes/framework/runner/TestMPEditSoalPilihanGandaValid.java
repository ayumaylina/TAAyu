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

public class TestMPEditSoalPilihanGandaValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private boolean isSoalEmpty;
	private boolean isPilihanAEmpty;
	private boolean isPilihanBEmpty;
	private boolean isPilihanCEmpty;
	private boolean isPilihanDEmpty;
	private boolean isPilihanEEmpty;
	private boolean isKunciJawabanEmpty;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestMPEditSoalPilihanGandaValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
		
		this.isSoalEmpty = true;
		this.isPilihanAEmpty = true;
		this.isPilihanBEmpty = true;
		this.isPilihanCEmpty = true;
		this.isPilihanDEmpty = true;
		this.isPilihanEEmpty = true;
		this.isKunciJawabanEmpty = true;
	}
	
	@Given("TSMP014 Admin berhasil membuka form edit soal pilihan ganda")
	public void tsmp014_admin_berhasil_membuka_form_edit_soal_pilihan_ganda() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickSearch();
		modulPage.search("pilihanganda");
		modulPage.enter();
		modulPage.clickBtnBuatSoal();
		modulPage.clickBtnEditSoalPG();
		extentTest.log(LogStatus.PASS, "Admin berhasil membuka form edit soal pilihan ganda");
	}

	@When("^TSMP014 Admin edit (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void tsmp014_admin_edit_soal_pilihan_a_pilihan_b_pilihan_c_pilihan_d_pilihan_e_dan_kunci_jawaban(String soal, String pilihanA, String pilihanB, String pilihanC, String pilihanD, String pilihanE, String kunciJawaban){
	    if(!soal.equals("")) {
	    	this.isSoalEmpty = false;
	    }
	    
	    if(!pilihanA.equals("")) {
	    	this.isPilihanAEmpty = false;
	    }
	    
	    if(!pilihanB.equals("")) {
	    	this.isPilihanBEmpty = false;
	    }
	    
	    if(!pilihanC.equals("")) {
	    	this.isPilihanCEmpty = false;
	    }
	    
	    if(!pilihanD.equals("")) {
	    	this.isPilihanDEmpty = false;
	    }
	    
	    if(!pilihanE.equals("")) {
	    	this.isPilihanEEmpty = false;
	    }
	    
	    if(!kunciJawaban.equals("")) {
	    	this.isKunciJawabanEmpty = false;
	    }
	    
	   
	    modulPage.editSoalPG(soal, pilihanA, pilihanB, pilihanC, pilihanD, pilihanE, kunciJawaban);
	    extentTest.log(LogStatus.PASS, "Admin edit Soal Pilihan Ganda");
	}

	@When("TSMP014 Admin klik update soal")
	public void tsmp014_admin_klik_update_soal() {
	    modulPage.clickBtnUpdateSoalPG();
	    extentTest.log(LogStatus.PASS, "Admin klik Update Soal");
	}

	@Then("TSMP014 Data soal berhasil di update")
	public void tsmp014_data_soal_berhasil_di_update() {
		 modulPage.getTxtEditSoal();
		 assertTrue(modulPage.getTxtEditSoal().contains("Berhasil"));
		 extentTest.log(LogStatus.PASS, "Admin berhasil update soal pilihan ganda");
	}
}
