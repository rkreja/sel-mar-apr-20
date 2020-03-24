package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoopDemo {
	
	
	
	
	@Test
	public void checkBox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i< checkboxes.size() ;i++) {
			WebElement e = checkboxes.get(i);
			e.click();
		}
		
		
//		WebElement checkbox1 = checkboxes.get(0);
//		checkbox1.click();
//		
//		WebElement checkbox2 = checkboxes.get(1);
//		checkbox2.click();
//		
//		WebElement checkbox3 = checkboxes.get(2);
//		checkbox3.click();
		
				
	}
	
	

}
