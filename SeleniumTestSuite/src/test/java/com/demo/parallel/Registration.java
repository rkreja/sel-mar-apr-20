package com.demo.parallel;

import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class Registration extends TestBase{
	
	
	@Test
	public void registration_test1() {
		driver.get("http://www.express.com");
	}
	@Test
	public void registration_test2() {
		driver.get("http://www.gap.com");
	}
	@Test
	public void registration_test3() {
		driver.get("http://www.ralphlauren.com");
	}
	@Test
	public void registration_test4() {
		driver.get("http://www.macys.com");
	}

}
