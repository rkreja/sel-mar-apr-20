package com.automationpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;

	@BeforeMethod
//	@BeforeClass
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		System.out.println(driver.manage().window().getPosition().getX());//1914
//		System.out.println(driver.manage().window().getPosition().getY());//0
		driver.manage().window().setPosition(new Point(1914, 0));
//		driver.manage().window().maximize();
	}

	@AfterMethod
//	@AfterClass
	public void am() {
		driver.close();
	}

}
