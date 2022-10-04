package com.sqa.psikotes.framework.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	private static Robot robot;
	private static JavascriptExecutor js;
	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static void scrollDownByVisibleElement(WebElement element, WebDriver driver) {
		js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",element );	
	}
	
	public static void scrollDownByPixel(int vertical, WebDriver driver) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
	
	public static void scrollDownToButtom(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void zoomOut(int n) throws AWTException{
	  	robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
	
	public static void zoomIn(int n) throws AWTException{
	  	robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_ADD);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_ADD);
		}
	}
	
	public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	
	public static long getFileSize(String path) {
		long fileSize = 0l;
		File f = new File(path);
		if(f.exists()){
			fileSize = f.length();
		}else{
			fileSize = 0l;
		}
		return fileSize;
	}
}