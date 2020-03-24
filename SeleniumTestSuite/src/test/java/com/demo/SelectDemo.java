package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {
//
//	@BeforeMethod
//	@AfterMethod
//	@BeforeSuite
//	@AfterSuite
//	@BeforeClass
//	@AfterClass
//	@BeforeTest
//	@AfterTest
	
	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		
		//select Java from dropdown
		WebElement e = driver.findElement(By.xpath("(//select[@name='DemoDropDown'])[1]"));
		Select dropdown = new Select(e);
		
		
		
	}

}
