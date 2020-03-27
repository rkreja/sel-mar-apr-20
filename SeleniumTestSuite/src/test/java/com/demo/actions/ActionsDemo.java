package com.demo.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ActionsDemo extends TestBase{
	@Test
	public void refreshByPressingf5() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		Actions actions = new  Actions(driver);
		
				
		actions.sendKeys(Keys.END).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		actions.sendKeys(Keys.HOME).build().perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Test
	public void dragAndDrop() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new  Actions(driver);
		
		WebElement source;
		WebElement target;
		
		source = driver.findElement(By.id("drag"));
		target = driver.findElement(By.id("drop"));
		
		
		actions.dragAndDrop(source, target).build().perform();
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	@Test
	public void mouseHover() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new  Actions(driver);
		WebElement e = driver.findElement(By.xpath("//li[contains(@onmouseover,'Sky is Blue')]"));
		actions.moveToElement(e).build().perform();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
}
