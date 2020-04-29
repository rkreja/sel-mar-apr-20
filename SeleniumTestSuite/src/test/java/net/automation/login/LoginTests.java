package net.automation.login;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class LoginTests extends TestBase{
	
	
	@Test
	public void login_with_valid_userid_and_pwd() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test
	public void login_with_invalid_userid_and_pwd() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test(groups = {"smoke"})
	public void login_with_valid_userid_and_Invalid_pwd() {
		webui.launch("http://www.automationpractice.com");
	}

}
