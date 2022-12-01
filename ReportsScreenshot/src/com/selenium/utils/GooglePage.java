package com.selenium.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.selenium.reportANDScreenshits.TestReport;

public class GooglePage {
	
   public static WebDriver driver;
 
   
   public static ExtentReports report = TestReport.getReport();
  public static ExtentTest logger;
  
	
	@Test
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		report.createTest("Test_01");
		
		logger.log(Status.INFO,"Google Page");
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
}
	 @AfterMethod
	public void close(){
		
		report.flush();
		
	}
	
	
	
	
	
	
	

}
