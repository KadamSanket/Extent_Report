package com.selenium.reportANDScreenshits;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReport {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentHtmlReporter html;

	
	public static ExtentReports getReport(){
		
		report = new ExtentReports();
		html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\ExtentTestReport.html");
		
		report.attachReporter(html);
		
		
		
		return report;
		
		
		
	}
	
	
	
	
}
