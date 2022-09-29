package com.sqa.psikotes.framework.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;

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
	
	@FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
	private WebElement btnAddModul;
		
	
	//scenario
	public void clickMenuTask() {
		menuTask.click();
	}
	
	public void clickSubmenuModul() {
		menuModul.click();
	}
	
	//actual
	public String getTxtModul() {
		return msgModul.getAttribute("value");
	}
	
	//SEARCH 
	public void search(String search) {
		this.tabSearch.sendKeys(search);
	}
	
	public void enter() {
		try {
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public void clickBtnHijau() {
		btnHijau.click();
	}
	
	public String getTxtSearch() {
		return msgModul.getText();
	}
	
}
