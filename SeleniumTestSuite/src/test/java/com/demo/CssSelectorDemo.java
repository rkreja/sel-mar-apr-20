package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class CssSelectorDemo extends TestBase{
	
	
	
	@Test
	public void javaScriptExecution() {
		
		driver.get("http://www.automationpractice.com");

		//enter text in searchbox by javascript executor
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("document.getElementById('search_query_top').value='JavaScript says hello';");
		
		//click sign in button by javascript executor
		javascriptExecutor.executeScript("document.getElementsByClassName('login')[0].click();");
		
		//you can use driver again as a standard way
		driver.findElement(By.id("email")).sendKeys("dsdsd");
		
		//click DRESSESS button by javascript executor
		javascriptExecutor.executeScript("document.getElementsByClassName('sf-with-ul')[3].click()");
		
		
		
	}
	
	
	@Test
	public void cssSelectorSteps() {
		
		driver.get("http://www.automationpractice.com");
		
//		driver.findElement(By.id("search_query_top")).sendKeys("hello");
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("hello");
		
		driver.findElement(By.cssSelector(".login")).click();
		
		
		
		
	}
	

}
