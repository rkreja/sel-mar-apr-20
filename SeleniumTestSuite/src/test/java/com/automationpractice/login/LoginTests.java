package com.automationpractice.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;






public class LoginTests extends TestBase{
	

	//TC1
	
	@Test
	public void Login_with_invalid_userid() {
		
		
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		driver.findElement(By.className("login")).click();
		
		
		
		
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
