package com.automationpractice.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	

	//TC1
	
	@Test
	public void Login_with_invalid_userid() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		
		
		//Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		
		
		//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("myunknowxaad@mailinator.com");
		
		//Click Sign in button
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		
		//Verify error message displayed 'There is 1 error'
		
		//Verify error message displayed 'Password is required.'
		
		
	}
	
	//TC2
	
	@Test
	public void Login_with_valid_userid_but_invalid_password() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//		Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
//		Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc213@mailinator.com");
		
//		Enter invalid password 'myinvalidpwd' in password text field
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("myinvalidpwd");
		
//		Click 'Sign in' button
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
//		Verify error message displayed 'There is 1 error'
//		Verify error message displayed 'Authentication failed.'
	}
	
	
	//TC3
	
}
