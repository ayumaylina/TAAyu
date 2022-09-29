package com.sqa.psikotes.framework.runner;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.sqa.psikotes.framework.page.ModulPage;

public class TestSearchModul {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private ModulPage modulPage = new ModulPage ();
	
	public TestSearchModul() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	
	
	

}
