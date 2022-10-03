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
	
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnAddModul;
	
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnSave;
	
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
	
//	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li/a")
//	private WebElement pagePreviousI;
	
	@FindBy(xpath = "//div[4]//ul[1]//li[8]//a[1]")
	private WebElement pageNext; 
	
	@FindBy(xpath = "//div[4]//ul[1]//li[3]//a[1]")
	private WebElement pageNextI; 
	
	
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
	
	
	//Locator AddModul	
	@FindBy(id="tl_add_modul--53182_text")
	private WebElement namaModul;
	
	@FindBy(id="tl_add_modul--53206_text")
	private WebElement tipeModul;
	
	@FindBy(id="tl_add_modul--53183_text")
	private WebElement waktuPengerjaan;
	
	@FindBy(id="tl_add_modul--53184_text")
	private WebElement jumlahSoal;
	
	@FindBy(id="tl_add_modul--53185_text")
	private WebElement kategori;
	
	@FindBy(id="tl_add_modul--53207_text")
	private WebElement deskripsi;
	
	@FindBy(id="tl_add_modul--53186_text")
	private WebElement status;
	
	//CLICK
	public void clickMenuTask() {
		menuTask.click();
	}
	
	public void clickSubmenuModul() {
		menuModul.click();
	}
	
	public void clickSearch() {
		tabSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public void clickBtnHijau() {
		btnHijau.click();
	}
	
	public void clickPageOne() {
		pageOne.click();
	}
	
	public void clickPageTwo() {
		pageTwo.click();
	}
	
	
	public void clickPageThree() {
		pageThree.click();
	}
	
	public void clickPageFour() {
		pageFour.click();
	}
	
	public void clickPageFive() {
		pageFive.click();
	}
	
	public void clickPageSix() {
		pageSix.click();
	}
	
	public void clickPagePrevious() {
		pagePrevious.click();
	}
	
	
	public void clickPageNext() {
		pageNext.click();
	}
	
	public void clickPageNextI() {
		pageNextI.click();
	}
	
	public void clickDropJumlahData() {
		Utils.scrollDownByVisibleElement(dropJumlahData, driver);
		dropJumlahData.click();
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
}
