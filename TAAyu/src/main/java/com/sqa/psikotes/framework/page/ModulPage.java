//Author : Ayu
//Created-date: 29-09-2022 13.00

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class ModulPage extends LoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public ModulPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button
	@FindBy(xpath = "//img[@id='tl_dis_agree--52808_finder']")
	private WebElement btnHijau;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//h3[@id='ui-id-9']")
	private WebElement menuTask;
	
	@FindBy(xpath = "//span[normalize-space()='Modul']")
	private WebElement menuModul;
	
	@FindBy(xpath = "//input[@id='tl_dis_agree--52808_text']")
	private WebElement tabSearch;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[2]//a[1]")
	private WebElement pageOne;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[3]//a[1]")
	private WebElement pageTwo;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[4]//a[1]")
	private WebElement pageThree;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[5]//a[1]")
	private WebElement pageFour;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[6]//a[1]")
	private WebElement pageFive;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[7]//a[1]")
	private WebElement pageSix;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[1]//a[1]")
	private WebElement pagePrevious; 
	
	@FindBy(xpath = "//div[4]//ul[1]//li[8]//a[1]")
	private WebElement pageNext; 
	
	@FindBy(xpath = "//div[4]//ul[1]//li[3]//a[1]")
	private WebElement pageNextI; 
	
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnAddModul;
	
	@FindBy(xpath = "//button[@id='53201_query']/span")
	private WebElement btnSave;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")
	private WebElement btnOkAddModul; 
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[10]/td[10]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/img[1]")
	private WebElement btnHapusModul; //btnhapus di page4 no terakhir
	
	@FindBy(xpath = ".//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")
	private WebElement btnOkHapusModul;
	
	//Field Add Modul	
	@FindBy(id="tl_add_modul--53182_text")
	private WebElement fnamaModul;
		
	@FindBy(id="tl_add_modul--53206_text")
	private WebElement ftipeModul;
		
	@FindBy(id="tl_add_modul--53183_text")
	private WebElement fwaktuPengerjaan;
		
	@FindBy(id="tl_add_modul--53184_text")
	private WebElement fjumlahSoal;
		
	@FindBy(id="tl_add_modul--53185_text")
	private WebElement fkategori;
		
	@FindBy(id="tl_add_modul--53207_text")
	private WebElement fdeskripsi;
		
	@FindBy(id="tl_add_modul--53186_text")
	private WebElement fstatus;
	
	//Dropdown
	@FindBy(xpath = "//select[@id='tl_dis_agree--52812_show_text']")
	private WebElement dropJumlahData;
	
	//select
	@FindBy(xpath = "//option[@value='25']")
	private WebElement selectTwentyFive;
	
	@FindBy(xpath = "//option[@value='50']")
	private WebElement selectFifty;
	
	//Validation
	@FindBy(xpath = "//td[@id='tl_dis_agree--52812-cell-0-1']")
	private WebElement msgSearch; //Leader
	
	@FindBy(xpath = "//input[@id='tl_dis_agree--52809_text']")
	private WebElement msgModul; //Modul Psikotest
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[8]")
	private WebElement txtShowData;
	
	@FindBy(xpath = "//p[normalize-space()='Modul Berhasil Ditambahkan']")
	private WebElement txtAddModul; 
	
	//CLICK
	public void clickMenuTask() {
		menuTask.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSubmenuModul() {
		menuModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSearch() {
		tabSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnHijau() {
		btnHijau.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageOne() {
		pageOne.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageTwo() {
		pageTwo.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageThree() {
		pageThree.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageFour() {
		pageFour.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageFive() {
		pageFive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageSix() {
		pageSix.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPagePrevious() {
		pagePrevious.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageNext() {
		pageNext.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickPageNextI() {
		pageNextI.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDropJumlahData() {
		Utils.scrollDownByVisibleElement(dropJumlahData, driver);
		dropJumlahData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnAddModul() {
		btnAddModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnSave() {
		btnSave.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnOkAddModul() {
		btnOkAddModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	// SELECT
	public void selectTwentyFive() {
		dropJumlahData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropJumlahData).selectByVisibleText("25");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropJumlahData.click();
	}
	
	public void selectFifty() {
		dropJumlahData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropJumlahData).selectByVisibleText("50");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropJumlahData.click();
	}
	
	//Insert
	public void search(String search) {
		this.tabSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void enter() {
		this.tabSearch.sendKeys(Keys.ENTER);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void insertAddModul(String nama_modul, String tipe_modul, String kategori, String deskripsi, String status_modul) {
//		fnamaModul.click();
		this.fnamaModul.sendKeys(nama_modul);
		ftipeModul.click();
		//this.ftipeModul.sendKeys(tipe_modul);
		new Select(ftipeModul).selectByVisibleText(tipe_modul);
//		ftipeModul.click();
//		fwaktuPengerjaan.click();
		this.fwaktuPengerjaan.sendKeys("90");
//		fjumlahSoal.click();
		this.fjumlahSoal.sendKeys("20");
		fkategori.click();
		//this.fkategori.sendKeys(kategori);
		new Select(fkategori).selectByVisibleText(kategori);
//		fkategori.click();
//		fdeskripsi.click();
		this.fdeskripsi.sendKeys(deskripsi);
		fstatus.click();
		//this.fstatus.sendKeys(status_modul);
		new Select(fstatus).selectByVisibleText(status_modul);
//		fstatus.click();
	}
	
	//Validation
	public String getTxtModul() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return msgModul.getAttribute("value");
	}
	
	public String getTxtSearch() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgSearch);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return msgSearch.getText();
	}
	
	public String getTxtPage() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtShowData);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtShowData.getText();
	}
	
	public String getTxtAddModul() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtShowData);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtAddModul.getText();
	}
	
	
}
