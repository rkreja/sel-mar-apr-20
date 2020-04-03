package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
			
	}
	
	@Test
	public void implicitWait() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Now I am present after:')]")).click();
	}
	
	@Test
	public void explicitWait() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 100);
		WebElement quoteHolder = driver.findElement(By.id("explicitWaitTextPresentDemo"));
		
		
		webDriverWait.until(ExpectedConditions.textToBePresentInElement(quoteHolder, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		
		String quote = quoteHolder.getText();
		
		
		
		Assert.assertEquals(quote, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”");
	}
	
	@Test
	public void other2() {
		
		
		//wait for button to get visible
		WebDriverWait driverWait = new WebDriverWait(driver, 120);
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='submit']")));
		//wait until alert is present
		driverWait.until(ExpectedConditions.alertIsPresent());
		//wait invisibility of element
		driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dsds")));
		driverWait.until(ExpectedConditions.urlToBe("http://www.automationpractice.com/new"));
		
		
	}
	
	
	

}
