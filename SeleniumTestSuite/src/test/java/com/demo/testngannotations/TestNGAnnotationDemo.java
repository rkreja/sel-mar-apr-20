package com.demo.testngannotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotationDemo {
	
	private WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
//		System.out.println("I am running before test method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void am() {
//		System.out.println("I am running after test method");
		driver.close();
	}
	
	@Test
	public void myTestOne() {
	
//		System.out.println(" test one");
		driver.get("http://www.automationpractice.com");
		
		//
		//
		//
	}
	
	@Test
	public void myTestTwo() {
	
		driver.get("http://www.cnn.com");
		
		
	}
	

	@Test
	public void myTestThree() {
	
		driver.get("http://www.bbc.com");
		
		
	}
	

}
