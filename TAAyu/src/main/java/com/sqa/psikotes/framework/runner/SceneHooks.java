/*
 * Author : Runanto
 * Created date : 29/09/2022
 * Modifer: Ayu (DATA OUTLINE)
 * Modifed Data : 03/10/2022
 *
 */

package com.sqa.psikotes.framework.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.scenariotest.PSIKOTESScene;
import com.sqa.psikotes.framework.utils.Utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SceneHooks {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/psikotes/extentreport/psikotes-scene-xr.html");
	private static PSIKOTESScene[] tests = PSIKOTESScene.values();
	private static final int[] DATA_OUTLINE = {1,1,1,1,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	private String testReport = "";
	

	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver,"PSIKOTES_SceneHooks_"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	

	
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(1, Constants.CHROME);
		DriverSingleton.closeObjectInstance();
	}
}
