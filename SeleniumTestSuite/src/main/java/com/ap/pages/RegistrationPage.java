package com.ap.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	private WebDriver d;
	
	@FindBy(xpath = "(//input[preceding-sibling::label[contains(text(),'First name')]])[1]")
	public WebElement firstname_textbox;
	
	@FindBy(xpath = "(//input[preceding-sibling::label[contains(text(),'Last name')]])[1]")
	public WebElement lastname_textbox;
	
	@FindBy(xpath = "//input[preceding-sibling::label[contains(text(),'Email')]]")
	public WebElement email_textbox;
	
	@FindBy(xpath = "//input[preceding-sibling::label[contains(text(),'Password')]]")
	public WebElement password_textbox;
	
	@FindBy(xpath = "//input[preceding-sibling::label[contains(text(),'City')]]")
	public WebElement city_textbox;
	
	

	
	@FindBy(id = "submitAccount")
	public WebElement register_button;
	
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]/p")
	public WebElement validation_msg_holder;
	
	//
	
	public RegistrationPage(WebDriver driver) {
		d=driver;
		PageFactory.initElements(driver, this);
	}
	//		driver.findElement(By.id("submitAccount")).click();
	
	
	public Select get_state_dropdown() {
		
		Select dropdown = new Select(d.findElement(By.id("id_state")));
		return dropdown;
		
	}
	
}
