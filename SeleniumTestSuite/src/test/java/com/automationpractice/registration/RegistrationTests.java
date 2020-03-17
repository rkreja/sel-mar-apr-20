package com.automationpractice.registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTests {
	
	
	@Test
	public void Register_a_new_account_with_missing_required_fields() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//			Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
		
//			Click on 'Create New Account' button
		driver.findElement(By.id("SubmitCreate")).click();
		
//			Verify validation message displayed 'Invalid email address.'
		String msg = driver.findElement(By.xpath("//li[starts-with(text(),'Invalid email address')]")).getText();
		
		Assert.assertEquals(msg, "Invalid email address.");
		
		
		
//			Enter an email address 'xyz915@mailinator.com' in order to register into the text field
		driver.findElement(By.id("email_create")).sendKeys("xyz915@mailinator.com");
		
		
//			Click on 'Create New Account' button
		driver.findElement(By.id("SubmitCreate")).click();
		
		
//			Click on Register Button
		driver.findElement(By.id("submitAccount")).click();
		
//			"Verify following validation messages displays:
//
//			
		String errMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
		Assert.assertEquals(errMsg, "There are 8 errors");
//			You must register at least one phone number.
		errMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[1]")).getText();
		Assert.assertEquals(errMsg, "You must register at least one phone number.");
		
//			lastname is required.
		
		errMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[2]")).getText();
		Assert.assertEquals(errMsg, "lastname is required.");
		
		
//			firstname is required.
		errMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[3]")).getText();
		Assert.assertEquals(errMsg, "firstname is required.");
		
		
//			passwd is required.
//			address1 is required.
//			city is required.
//			The Zip/Postal code you've entered is invalid. It must follow this format: 00000
//			This country requires you to choose a State.
		
//		Go to http://www.automationpractice.com

//			Click Sign in button from top right corner of the page

//			Enter email address 'abc@mailinator.com' in email address text field of left side
	
//			Click on 'Create New Account' button
//			Verify validation message displayed 'Invalid email address.'
//			Enter an email address 'xyz915@mailinator.com' in order to register into the text field
//			Click on 'Create New Account' button
//			Click on Register Button
//			"Verify following validation messages displays:
//
//			There are 8 errors
//			You must register at least one phone number.
//			lastname is required.
//			firstname is required.
//			passwd is required.
//			address1 is required.
//			city is required.
//			The Zip/Postal code you've entered is invalid. It must follow this format: 00000
//			This country requires you to choose a State."
		
//	
		
		
		driver.close();
		
	} 
	
	
	

}
