package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
@Test	
public void xpath_test() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Go to http://www.automationpractice.com
	driver.get("http://www.automationpractice.com");
	
	driver.findElement(By.xpath("//a[@title = 'Log in to your customer account']")).click();
	driver.findElement(By.xpath("//input[@id='email_create' and @name='email_create']")).sendKeys("poiuytr@mailinator.com");
	driver.findElement(By.xpath("//button[@type='submit' and @id='SubmitCreate']")).click();
//	driver.findElement(By.xpath("//a[text() = 'My orders']")).click();
}
	
	
	
}
