package com.automationpractice.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pages.RegistrationPage;
import com.automationpractice.core.TestBase;

public class RegistrationTestsUsingPageFactory extends TestBase{
	
	
	
	//register a user without required fields and 
	//verify validation msg displays 'There are 8 errors'
	@Test
	public void reg_with_no_req_fields() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc09876@mailinator.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[1]"));
		WebElement lastname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[1]"));
		WebElement email = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Email')]]"));
		WebElement password = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Password')]]"));
		WebElement firstname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[2]"));
		WebElement lastname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[2]"));
		WebElement address = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Address')]])[1]"));
		WebElement city = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'City')]]"));
		WebElement zipcode = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Zip/Postal Code')]]"));
		WebElement mobile = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Mobile phone')]]"));
		Select state_dropdown = new Select(driver.findElement(By.id("id_state")));
		
		
		
		driver.findElement(By.id("submitAccount")).click();
		
		WebElement validation_msg_holder = driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]/p"));
		String actual = validation_msg_holder.getText();
		Assert.assertEquals(actual, "There are 8 errors");
		
	}
	
	//register a user with all required fields except firstname and 
	//verify validation msg displays 'There is 1 error'
	@Test
	public void reg_user_with_all_req_field_but_no_firstname() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc09876@mailinator.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[1]"));
		WebElement lastname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[1]"));
		WebElement email = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Email')]]"));
		WebElement password = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Password')]]"));
		WebElement firstname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[2]"));
		WebElement lastname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[2]"));
		WebElement address = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Address')]])[1]"));
		WebElement city = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'City')]]"));
		WebElement zipcode = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Zip/Postal Code')]]"));
		WebElement mobile = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Mobile phone')]]"));
		Select state_dropdown = new Select(driver.findElement(By.id("id_state")));
		
		
		lastname.sendKeys("Smith");
		password.sendKeys("0869080p98798798");
		address.sendKeys("123 abc sreet");
		city.sendKeys("Baltimore");
		zipcode.sendKeys("20155");
		state_dropdown.selectByVisibleText("Maryland");
		mobile.sendKeys("9179179177");
		
		driver.findElement(By.id("submitAccount")).click();
		
		WebElement validation_msg_holder = driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]/p"));
		String actual = validation_msg_holder.getText();
		Assert.assertEquals(actual, "There is 1 error");
	}

	
	//register a user with all required fields except lastname and 
	//verify validation msg displays 'There is 1 error'
	@Test
	public void reg_user_with_all_req_field_but_no_lastname() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc09876@mailinator.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[1]"));
		WebElement lastname = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[1]"));
		WebElement email = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Email')]]"));
		WebElement password = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Password')]]"));
		WebElement firstname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'First name')]])[2]"));
		WebElement lastname2 = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Last name')]])[2]"));
		WebElement address = driver.findElement(By.xpath("(//input[preceding-sibling::label[contains(text(),'Address')]])[1]"));
		WebElement city = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'City')]]"));
		WebElement zipcode = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Zip/Postal Code')]]"));
		WebElement mobile = driver.findElement(By.xpath("//input[preceding-sibling::label[contains(text(),'Mobile phone')]]"));
		Select state_dropdown = new Select(driver.findElement(By.id("id_state")));
		
		
		firstname.sendKeys("John");
		password.sendKeys("0869080p98798798");
		address.sendKeys("123 abc sreet");
		city.sendKeys("Baltimore");
		zipcode.sendKeys("20155");
		state_dropdown.selectByVisibleText("Maryland");
		
		mobile.sendKeys("9179179177");
		
		driver.findElement(By.id("submitAccount")).click();
		
		WebElement validation_msg_holder = driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]/p"));
		String actual = validation_msg_holder.getText();
		Assert.assertEquals(actual, "There is 1 error");
	}
	
	
	//register a user with all required fields except city and 
	//verify validation msg displays 'There is 1 error'
	@Test
	public void reg_user_with_all_req_field_but_no_city() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc09876@mailinator.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//now we ar ein registration page
		RegistrationPage registrationPage = new RegistrationPage(driver);	
		registrationPage.firstname_textbox.sendKeys("John");
		registrationPage.lastname_textbox.sendKeys("smith");
		
		registrationPage.register_button.click();
		
		
		String actual = registrationPage.validation_msg_holder.getText();
		Assert.assertEquals(actual, "There is 1 error");
	}
	
	
	@Test
	public void reg_user_with_all_req_field_but_no_address() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc09876@mailinator.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//now we ar ein registration page
		RegistrationPage registrationPage = new RegistrationPage(driver);	
		registrationPage.firstname_textbox.sendKeys("John");
		registrationPage.lastname_textbox.sendKeys("smith");
		registrationPage.city_textbox.sendKeys("Baltimore");
		registrationPage.get_state_dropdown().selectByVisibleText("Maryland");
		registrationPage.register_button.click();
		
		
		String actual = registrationPage.validation_msg_holder.getText();
		Assert.assertEquals(actual, "There is 1 error");
	}
}
