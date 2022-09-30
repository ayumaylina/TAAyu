//Author : Ayu
//Created-date: 29-09-2022 13.00

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	//LocatorOpenModul
	@FindBy(xpath = "//h3[@id='ui-id-9']")
	private WebElement menuTask;
	
	@FindBy(xpath = "//span[normalize-space()='Modul']")
	private WebElement menuModul;
	
	@FindBy(xpath = "//input[@id='tl_dis_agree--52809_text']")
	private WebElement msgModul; //Modul Psikotest
	
	//LocatorSearchModul
	@FindBy(xpath = "//input[@id='tl_dis_agree--52808_text']")
	private WebElement tabSearch;
	
	@FindBy(xpath = "//img[@id='tl_dis_agree--52808_finder']")
	private WebElement btnHijau;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//td[@id='tl_dis_agree--52812-cell-0-1']")
	private WebElement msgSearch; //Logika
	
	//Locator AddModul
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnAddModul;
		
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
	
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnSave;
	
	//LocatorShowData
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[1]/a")
	private WebElement pageOne;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[2]/a")
	private WebElement pageTwo;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[3]/a")
	private WebElement pageThree;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[4]/a")
	private WebElement pageFour;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[5]/a")
	private WebElement pageFive;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[6]/a")
	private WebElement pageSix;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li/a")
	private WebElement pagePrevious;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[9]/ul/li[8]/a")
	private WebElement pageNext;
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[8]")
	private WebElement txtShowData;
	
	////div[@id='tl_dis_agree--52812']/div[8]
//	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[8]")
//	private WebElement pilihSepuluh;
	
	//scenarioMenu
	public void clickMenuTask() {
		menuTask.click();
	}
	
	public void clickSubmenuModul() {
		menuModul.click();
	}
	
	//actual
	public String getTxtModul() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return msgModul.getAttribute("value");
	}
	
	//SEARCH 
	public void clickSearch() {
		tabSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void search(String search) {
		this.tabSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void enter() {
		this.tabSearch.sendKeys(Keys.ENTER);
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public void clickBtnHijau() {
		btnHijau.click();
	}
	
	public String getTxtSearch() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return msgSearch.getText();
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
	
	public String getTxtPage() {
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtShowData.getText();
	}
}
