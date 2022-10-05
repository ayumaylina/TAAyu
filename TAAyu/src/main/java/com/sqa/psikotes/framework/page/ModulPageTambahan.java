//Author : Ayu
//Created-date: 29-09-2022 13.00

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class ModulPageTambahan extends LoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public ModulPageTambahan() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Button
	@FindBy(xpath = "//h3[@id='ui-id-9']")
	private WebElement menuTask;
	
	@FindBy(xpath = "//span[normalize-space()='Modul']")
	private WebElement menuModul;
	
	@FindBy(xpath = "//button[@id='53332_query']/span")
	private WebElement btnUpdateDesk;
	
	@FindBy(xpath = "//td[8]/div/table/tbody/tr/td/div/img")
	private WebElement btnEditDesk;
	
	@FindBy(xpath = "//td[8]/div/table/tbody/tr/td[2]/div/img")
	private WebElement btnDeleteDesk;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])/following::span[2]")
	private WebElement btnYaDeleteDesk;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnOKDeleteDesk;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnOKUpdateDesk;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='IYA'])[1]/following::span[1]")
	private WebElement btnTidakDeleteDesk;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
	private WebElement btnDeskripsi;
	
	@FindBy(linkText = ">>")
	private WebElement btnLast;
	
	@FindBy(xpath = "//button[@id='53069_query']/span")
	private WebElement btnAddDesk;
	
	@FindBy(xpath = "//button[@id='53201_query']/span")
	private WebElement btnSave;
	
//	Field Add Deskripsi
	@FindBy(id = "tl_user_activity--53077_text")
	private WebElement fDeskripsiModul;
	
	@FindBy(id = "tl_user_activity--53055_text")
	private WebElement fKetentuanSoal;
	
//	Field Edit Deskripsi
	@FindBy(id = "tl_edit_desk--53340_text")
	private WebElement fEditDesk;
	
	@FindBy(id = "tl_edit_desk--53338_text")
	private WebElement fEditKetSoal;
	
	//Validation
	@FindBy(xpath = "//input[@id='tl_user_activity--53043_text']")
	private WebElement txtJudulDesk;
	
	@FindBy(id = "tl_edit_desk--53303_text")
	private WebElement txtEditDesk;
	
	@FindBy(id = "tl_user_activity--53064-cell-0-3")
	private WebElement txtDeskModul;
	
	@FindBy(id = "tl_user_activity--53064-cell-0-4")
	private WebElement txtKetSoal;
	
	@FindBy(xpath = "//td[@id='tl_user_activity--53064-cell-1-4']")
	private WebElement txtKetSoalRow2;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtDihapus;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtDisimpan;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtConfirmDelete;
	
	//CLICK
	public void clickMenuTask() {
		menuTask.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSubmenuModul() {
		menuModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickLast() {
		btnLast.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDeskripsi() {
		btnDeskripsi.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickAddDesk() {
		btnAddDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditDesk() {
		btnEditDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickUpdateDesk() {
		btnUpdateDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickOKEditDesk() {
		btnOKUpdateDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDeleteDesk() {
		btnDeleteDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickTidakDesk() {
		btnTidakDeleteDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickYaDesk() {
		btnYaDeleteDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickOKDeleteDesk() {
		btnOKDeleteDesk.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	//Insert
	public void insertDesk(String desk) {
		this.fDeskripsiModul.sendKeys(desk);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void insertKetSoal(String soal) {
		this.fKetentuanSoal.sendKeys(soal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void editDesk(String desk) {
		this.fEditDesk.clear();
		this.fEditDesk.sendKeys(desk);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void editKetSoal(String soal) {
		this.fEditKetSoal.clear();
		this.fEditKetSoal.sendKeys(soal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clearDesk() {
		this.fEditDesk.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clearKetSoal() {
		this.fEditKetSoal.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	//Validation
	public String getTxtJudulDesk() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtJudulDesk);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtJudulDesk.getAttribute("value");
	}
	
	public String getTxtEditDesk() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEditDesk);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtEditDesk.getAttribute("value");
	}
	
	public String getTxtDeskModul() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDeskModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtDeskModul.getText();
	}
	
	public String getTxtKetSoal() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtKetSoal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtKetSoal.getText();
	}
	
	public String getTxtKetSoalRow2() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtKetSoalRow2);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtKetSoalRow2.getText();
	}
	
	public String getTxtDisimpan() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDisimpan);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtDisimpan.getText();
	}
	
	public String getTxtDihapus() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDihapus);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtDihapus.getText();
	}
	
	public String getTxtConfirmDelete() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtConfirmDelete);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtConfirmDelete.getText();
	}
	
}
