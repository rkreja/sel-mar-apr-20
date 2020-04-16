package com.automationpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase2 {
	public WebDriver driver;

	@BeforeClass
	public void bc() {
		if(Settings.browser_invoke_level.equals("class")) {
			initializeWebDriver();
		}
	}
	
	@AfterClass
	public void ac() {
		if(Settings.browser_invoke_level.equals("class")) {
			driver.close();
		}
	}
	
	@BeforeMethod
	public void bm() {
		
		if(Settings.browser_invoke_level.equals("method")) {
			initializeWebDriver();
		}

	}

	@AfterMethod
	public void am() {
		if(Settings.browser_invoke_level.equals("method")) {
			driver.close();
		}
	}
	
	
	private void initializeWebDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		System.out.println(driver.manage().window().getPosition().getX());//1914
//		System.out.println(driver.manage().window().getPosition().getY());//0
		driver.manage().window().setPosition(new Point(1914, 0));
//		driver.manage().window().maximize();
	}

}
