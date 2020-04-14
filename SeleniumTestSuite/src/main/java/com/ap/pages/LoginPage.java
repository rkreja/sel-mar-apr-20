package com.ap.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="email_create")
	public WebElement textbox_email_reg;
	
	@FindBy(id="email")
	public WebElement textbox_email_sigin;
	
	public WebElement textbox_password;
	
	public WebElement button_createaccount;
	
	public WebElement button_sigin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
