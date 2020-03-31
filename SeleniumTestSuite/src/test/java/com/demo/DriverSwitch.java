package com.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class DriverSwitch extends TestBase{
	
	
	
	@Test
	public void switchToWindowDemo() {
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		String window_1_Hanlde = driver.getWindowHandle();
		System.out.println(window_1_Hanlde);

		
		driver.findElement(By.id("home")).click();
//		//this should open a new window
//		String window_2_Hanlde = driver.getWindowHandle();
//		System.out.println(window_2_Hanlde);
		
		Set<String> all_handles = driver.getWindowHandles();
		all_handles.forEach((h)->{
			System.err.println(h);
			
			if(h.equals(window_1_Hanlde)) {
				//////
			}else {
				driver.switchTo().window(h);
			}
			
			
		});

		
		
		driver.findElement(By.xpath("//a[child::h5[text()='Image']]")).click();
	}
	
	
	@Test
	public void switchToWindow() throws InterruptedException {
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		//this should open a new window
		
//		driver.switchTo().window(nameOrHandle);
		driver.findElement(By.xpath("//a[child::h5[text()='Image']]")).click();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void switchToFrame() throws InterruptedException {
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		//switch to the frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		
		driver.switchTo().defaultContent();
		String txt = driver.findElement(By.xpath("//h1")).getText();
		
		
		Thread.sleep(3000);
	}
	
	
	@Test
	public void switchToAlert() throws InterruptedException {
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//we should see alert
		//accept the alert
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		
		
		
	}

}
