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
	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[10]/td[10]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/img[1]")
//	private WebElement btnHapusModul; //btnhapus di page4 no terakhir
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")
	private WebElement btnOkHapusModul;
	
	@FindBy(id="--_text")
	private WebElement btnBuatSoal;
	
	@FindBy(xpath = "//button[@id='53156_query']/span")
	private WebElement btnUploadGambar;
	
	@FindBy(xpath = "//button[@id='53160_query']/span")
	private WebElement btnCekGambar;
	
	@FindBy(xpath = "//button[@id='53143_query']/span")
	private WebElement btnAddSoalPilihanGanda;
	
	@FindBy(xpath = "//td[4]/div/img")
	private WebElement btnHapusModul;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
	private WebElement btnIyaHapus;
	
	@FindBy(xpath = "//td[3]/div/img")
	private WebElement btnEditModul;
	
	@FindBy(xpath = "//button[@id='53292_query']/span")
	private WebElement btnUpdateModul;
	
	@FindBy(xpath = "//td[7]/div/table/tbody/tr/td[2]/div/img")
	private WebElement btnHapusSoal;
	
	@FindBy(xpath = "//td[7]/div/table/tbody/tr/td/div/img")
	private WebElement btnEditSoalPG;
	
	@FindBy(xpath = "//button[@id='53105_query']/span")
	private WebElement btnUpdateSoalPG;
	
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
	
	//Field Add Soal Pilihan Ganda
	@FindBy(id="tl_template_soal--53142_text")
	private WebElement fsoal;
	
	@FindBy(id="tl_template_soal--53146_text")
	private WebElement fPilihanGandaA;
	
	@FindBy(id="tl_template_soal--53144_text")
	private WebElement fPilihanGandaB;
	
	@FindBy(id="tl_template_soal--53145_text")
	private WebElement fPilihanGandaC;
	
	@FindBy(id="tl_template_soal--53151_text")
	private WebElement fPilihanGandaD;
	
	@FindBy(id="tl_template_soal--53152_text")
	private WebElement fPilihanGandaE;
	
	
	//@FindBy(xpath="//input[@id='tl_template_soal--53161_text']")
	@FindBy(id="tl_template_soal--53161_text")
	private WebElement fUploadGambar;
	
	//EditModul
	@FindBy(id="tl_edit_modul--53273_text")
	private WebElement fEditNamaModul;
	
	@FindBy(id="tl_edit_modul--53297_text")
	private WebElement fEditTipeModul;
	
	@FindBy(id="tl_edit_modul--53274_text")
	private WebElement fEditWaktuPengerjaan;
	
	@FindBy(id="tl_edit_modul--53275_text")
	private WebElement fEditJumlahSoal;
	
	@FindBy(id="tl_edit_modul--53276_text")
	private WebElement fEditKategori;
	
	@FindBy(id="tl_edit_modul--53298_text")
	private WebElement fEditDeskripsi;
	
	@FindBy(id="tl_edit_modul--53277_text")
	private WebElement fEditStatus;
	
	//fieldEditSoalPG
	@FindBy(id="tl_template_script_edit--53102_text")
	private WebElement fEditPilihanA;
	
	@FindBy(id="tl_template_script_edit--53106_text")
	private WebElement fEditPilihanB;
	
	@FindBy(id="tl_template_script_edit--53164_text")
	private WebElement fEditPilihanC;
	
	@FindBy(id="tl_template_script_edit--53165_text")
	private WebElement fEditPilihanD;
	
	@FindBy(id="tl_template_script_edit--53166_text")
	private WebElement fEditPilihanE;
	
	@FindBy(id="tl_template_script_edit--53087_text")
	private WebElement fEditSoal;
	
	//EditSoalEsai
	
	
	//Dropdown
	@FindBy(xpath = "//select[@id='tl_dis_agree--52812_show_text']")
	private WebElement dropJumlahData;
	
	@FindBy(id="tl_template_soal--53153_text")
	private WebElement dropKunciJawaban;
	
	@FindBy(id="tl_template_soal--53224_text")
	private WebElement dropKunciJawabanEnum;
	
	@FindBy(id="tl_template_soal--53167_text")
	private WebElement dropScoreEsaiLength;
	
	@FindBy(id="tl_template_soal--53146_text")
	private WebElement dropKunciJawabanPilihanAB;
	
	@FindBy(id="tl_template_script_edit--53104_text")
	private WebElement dropEditKunciJawabanPG;
	
	@FindBy(id="tl_template_script_edit--53231_text")
	private WebElement dropEditScoreEsaiLength;
	
	@FindBy(id="tl_template_script_edit--53228_text")
	private WebElement dropEditKunciJawabanEnum;
	
	@FindBy(id="tl_template_script_edit--53104_text")
	private WebElement dropEditKunciJawabanPilihanAB;
	
	//select
	@FindBy(xpath = "//option[@value='25']")
	private WebElement selectTwentyFive;
	
	@FindBy(xpath = "//option[@value='50']")
	private WebElement selectFifty;
	
	@FindBy(xpath = "//option[@value='100']")
	private WebElement selectAHundred;
	
	//Validation
	@FindBy(xpath = "//td[@id='tl_dis_agree--52812-cell-0-1']")
	private WebElement msgSearch; //Leader
	
	@FindBy(xpath = "//input[@id='tl_dis_agree--52809_text']")
	private WebElement msgModul; //Modul Psikotest
	
	@FindBy(xpath = "//div[@id='tl_dis_agree--52812']/div[8]")
	private WebElement txtShowData;
	
	@FindBy(xpath = "//p[normalize-space()='Modul Berhasil Ditambahkan']")
	private WebElement txtAddModul; 
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtAddSoalPilihanGanda; 
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtHapusModul; //sama xpathnya dgn txtaddsoalpg
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtUpdateModul; //sama xpathnya dgn txtaddsoalpg
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtHapusSoal;
	
	@FindBy(xpath = "//div[@id='nikita-form-dialog']/p")
	private WebElement txtEditSoal;
	
	
	
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
	
	public void clickBtnBuatSoal() {
		btnBuatSoal.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnAddSoal() {
		btnAddSoalPilihanGanda.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnHapusModul() {
		btnHapusModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnIyaHapus() {
		btnIyaHapus.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnUpdateModul() {
		btnUpdateModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnEditModul() {
		btnEditModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnHapusSoalPG() {
		btnHapusSoal.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnEditSoalPG() {
		btnEditSoalPG.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnUpdateSoalPG() {
		btnUpdateSoalPG.click();
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
	
	public void selectAHundred() {
		dropJumlahData.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropJumlahData).selectByVisibleText("100");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropJumlahData.click();
	}
	
	public void selectKunciJawabanA() {
		dropKunciJawaban.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawaban).selectByVisibleText("A");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectKunciJawabanB() {
		dropKunciJawaban.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawaban).selectByVisibleText("B");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectKunciJawabanC() {
		dropKunciJawaban.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawaban).selectByVisibleText("C");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectKunciJawabanD() {
		dropKunciJawaban.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawaban).selectByVisibleText("D");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectKunciJawabanE() {
		dropKunciJawaban.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawaban).selectByVisibleText("E");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectKunciJawabanYa(String kunciJawaban) {
		dropKunciJawabanEnum.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropKunciJawabanEnum).selectByVisibleText(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void selectScoreEsaiLength(String score) {
		dropEditScoreEsaiLength.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropEditScoreEsaiLength).selectByVisibleText(score);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
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
		this.fnamaModul.sendKeys(nama_modul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		ftipeModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		//this.ftipeModul.sendKeys(tipe_modul);
		new Select(ftipeModul).selectByVisibleText(tipe_modul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fwaktuPengerjaan.sendKeys("90");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fjumlahSoal.sendKeys("20");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		fkategori.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(fkategori).selectByVisibleText(kategori);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fdeskripsi.sendKeys(deskripsi);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		fstatus.click();
		new Select(fstatus).selectByVisibleText(status_modul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void uploadGambar(String gambar) {
		this.fUploadGambar.sendKeys(gambar);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void insertAddSoalPilihanGanda(String kunciJawaban, String gambar) {
		fsoal.click();
		this.fsoal.sendKeys("Ketik Soal terakhir sumpah");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fPilihanGandaA.sendKeys("pilihanA");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fPilihanGandaB.sendKeys("pilihanB");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fPilihanGandaC.sendKeys("pilihanC");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fPilihanGandaD.sendKeys("pilihanD");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fPilihanGandaE.sendKeys("pilihanE");
		dropKunciJawaban.click();
		new Select(dropKunciJawaban).selectByVisibleText(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
		//this.fUploadGambar.sendKeys(gambar);
		
		if (!gambar.equals("")) {
			uploadGambar(gambar);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnUploadGambar.click();
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnCekGambar.click();
			Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		}
		
//		btnAddSoalPilihanGanda.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void insertAddSoalEsaiFreeText(String gambar) {
		this.fsoal.sendKeys("Ketik Soal");
		if (!gambar.equals("")) {
			uploadGambar(gambar);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnUploadGambar.click();
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnCekGambar.click();
			Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		}
	}
	
	public void insertAddSoalEnum(String kunci_jawaban, String gambar) {
		this.fsoal.sendKeys("Ketik Soal");
		this.dropKunciJawabanEnum.sendKeys(kunci_jawaban);
		dropKunciJawabanEnum.click();
		if (!gambar.equals("")) {
			uploadGambar(gambar);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnUploadGambar.click();
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnCekGambar.click();
			Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		}
	}
	
	public void insertAddSoalEsaiLength(String score, String gambar) {
		this.fsoal.sendKeys("Ketik Soal");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.dropScoreEsaiLength.sendKeys(score);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropScoreEsaiLength.click();
		
		if (!gambar.equals("")) {
			uploadGambar(gambar);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnUploadGambar.click();
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnCekGambar.click();
			Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		}
	}
	
	public void insertAddSoalPilihanAB(String kunciJawaban, String gambar) {
		fPilihanGandaA.click();
		this.fPilihanGandaA.sendKeys("Melati");
		fPilihanGandaB.click();
		this.fPilihanGandaB.sendKeys("Mawar");
		this.dropKunciJawabanPilihanAB.sendKeys(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		dropKunciJawabanPilihanAB.click();
		if (!gambar.equals("")) {
			uploadGambar(gambar);
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnUploadGambar.click();
			Utils.delay(1, Constants.GLOB_PARAM_DELAY);
			btnCekGambar.click();
			Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		}
	}
	
//	public void editModul(String nama_modul, String tipe_modul, String waktu_pengerjaan, String jumlah_soal, String kategori, String deskripsi, String status_modul) {
//		fEditNamaModul.clear();
//		this.fEditNamaModul.sendKeys(nama_modul);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		fEditTipeModul.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		//this.ftipeModul.sendKeys(tipe_modul);
//		new Select(fEditTipeModul).selectByVisibleText(tipe_modul);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		fEditWaktuPengerjaan.clear();
//		this.fEditWaktuPengerjaan.sendKeys(waktu_pengerjaan);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		fEditJumlahSoal.clear();
//		this.fEditJumlahSoal.sendKeys(jumlah_soal);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		fEditKategori.click();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		new Select(fEditKategori).selectByVisibleText(kategori);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		//fEditDeskripsi.clear();
//		this.fEditDeskripsi.sendKeys(deskripsi);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		fEditStatus.click();
//		new Select(fEditStatus).selectByVisibleText(status_modul);
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//	}
	
	public void updateSoal(String soal) {
		this.fEditSoal.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditSoal.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditSoal.sendKeys(soal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updatePilihanA(String pilihanA) {
		this.fEditPilihanA.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanA.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanA.sendKeys(pilihanA);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updatePilihanB(String pilihanB) {
		this.fEditPilihanB.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanB.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanB.sendKeys(pilihanB);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updatePilihanC(String pilihanC) {
		this.fEditPilihanC.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanC.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanC.sendKeys(pilihanC);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updatePilihanD(String pilihanD) {
		this.fEditPilihanD.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanD.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanD.sendKeys(pilihanD);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updatePilihanE(String pilihanE) {
		this.fEditPilihanE.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanE.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditPilihanE.sendKeys(pilihanE);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateEditKunciJawabanPG(String kunciJawaban) {
		dropEditKunciJawabanPG.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropEditKunciJawabanPG).selectByVisibleText(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void editSoalPG (String soal, String pilihanA, String pilihanB, String pilihanC, String pilihanD, String pilihanE, String kunciJawaban) {
		if(!soal.equals("")) {
			updateSoal(soal);
		}
		
		if(!pilihanA.equals("")) {
			updatePilihanA(pilihanA);
		}
		
		if(!pilihanB.equals("")) {
			updatePilihanB(pilihanB);
		}
		
		if(!pilihanC.equals("")) {
			updatePilihanC(pilihanC);
		}
		
		if(!pilihanD.equals("")) {
			updatePilihanD(pilihanD);
		}
		
		if(!pilihanE.equals("")) {
			updatePilihanE(pilihanE);
		}
		
		if(!kunciJawaban.equals("")) {
			updateEditKunciJawabanPG(kunciJawaban);
		}
	}
	
	public void editSoalEsaiFreeText() {
		this.fEditSoal.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditSoal.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditSoal.sendKeys("Ubah soal esai");
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateScoreEsaiLength(String score) {
		dropEditScoreEsaiLength.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropEditScoreEsaiLength).selectByVisibleText(score);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void editSoalEsaiLength(String soal, String score) {
		if(!soal.equals("")) {
			updateSoal(soal);
		}
		
		if(!score.equals("")) {
			updateScoreEsaiLength(score);
		}	
	}
	
	public void updateKunciJawabanEnum(String kunciJawaban) {
		dropEditKunciJawabanEnum.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropEditKunciJawabanEnum).selectByVisibleText(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void editSoalEnum(String soal, String kunciJawaban) {
		if(!soal.equals("")) {
			updateSoal(soal);
		}
		
		if(!kunciJawaban.equals("")) {
			updateKunciJawabanEnum(kunciJawaban);
		}	
	}
	
	public void updateKunciJawabanPilihanAB(String kunciJawaban) {
		dropEditKunciJawabanPilihanAB.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		new Select(dropEditKunciJawabanPilihanAB).selectByVisibleText(kunciJawaban);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void editSoalPilihanAB(String pilihanA, String pilihanB, String kunciJawaban) {
		if(!pilihanA.equals("")) {
			updatePilihanA(pilihanA);
		}
		
		if(!pilihanB.equals("")) {
			updatePilihanB(pilihanB);
		}
		
		if(!kunciJawaban.equals("")) {
			updateKunciJawabanPilihanAB(kunciJawaban);
		}	
	}
	
	public void updateDataModul(String namaModul, String tipeModul, String waktuPengerjaan, String jumlahSoal, String kategori, String deskripsi, String statusModul) {
		if(!namaModul.equals("")) {
			updateNamaModul(namaModul);
		}
		
		if(!tipeModul.equals("")) {
			updateTipeModul(tipeModul);
		}
		
		if(!waktuPengerjaan.equals("")) {
			updateWaktuPengerjaanModul(waktuPengerjaan);
		}
		
		if(!jumlahSoal.equals("")) {
			updateJumlahSoalModul(jumlahSoal);
		}
		
		
		if(!kategori.equals(" ")) {
			updateKategoriModul(kategori);
		}
		
		
		if(!deskripsi.equals("")) {
			updateDeskripsiModul(deskripsi);
			
		}
		
		if(!statusModul.equals("")) {
			updateStatusModul(statusModul);
		}
		
		
	}
	
	public void updateNamaModul(String namaModul) {
		fEditNamaModul.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditNamaModul.clear();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.fEditNamaModul.sendKeys(namaModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateTipeModul(String tipeModul) {
		fEditTipeModul.click();
		new Select(fEditTipeModul).selectByVisibleText(tipeModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void updateWaktuPengerjaanModul(String waktuPengerjaan) {
		fEditWaktuPengerjaan.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		fEditWaktuPengerjaan.clear();
		this.fEditWaktuPengerjaan.sendKeys(waktuPengerjaan);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateJumlahSoalModul(String jumlahSoal) {
		fEditJumlahSoal.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		fEditJumlahSoal.clear();
		this.fEditJumlahSoal.sendKeys(jumlahSoal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateKategoriModul(String kategori) {
	//	fEditKategori.click();
		new Select(fEditKategori).selectByVisibleText(kategori);
		
	}
	
	public void updateDeskripsiModul(String deskripsi) {
		fEditDeskripsi.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		fEditDeskripsi.clear();
		this.fEditDeskripsi.sendKeys(deskripsi);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateStatusModul(String statusModul) {
		fEditStatus.click();
		new Select(fEditStatus).selectByValue(statusModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
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
	
	public String getTxtAddSoal() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtAddSoalPilihanGanda);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtAddSoalPilihanGanda.getText();
	}
	
	public String getTxtHapusModul() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtHapusModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtHapusModul.getText();
	}
	
	public String getTxtEditModul() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUpdateModul);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtUpdateModul.getText();
	}
	
	public String getTxtEditSoal() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEditSoal);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		return txtEditSoal.getText();
	}
	
}
