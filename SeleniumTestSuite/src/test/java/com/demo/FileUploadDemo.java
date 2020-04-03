package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class FileUploadDemo extends TestBase{

	
	
	@Test
	public void uploadAFile() throws InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.id("demoFileUpload")).sendKeys("F:\\Time And Training\\Demo Folder\\postman.png");
		
		Thread.sleep(4000);
		
		//F:\Time And Training\Demo Folder\postman.png
		
		//Robot class _ Java
		
		//AutoIT
		
		//sikuli
		
		//JavaScriptExecutor
		
		
	}
	
}
