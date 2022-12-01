package com.selenium.reportANDScreenshits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TakeScreenShtots {
	
	public static WebDriver driver;
	
	@Test
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//report.createTest("Test_01");
		
		//logger.log(Status.INFO,"Google Page");
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	

}
}