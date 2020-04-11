package com.demo.parallel;

import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class Product extends TestBase{
	
	
	@Test
	public void product_test1() {
		driver.get("http://www.cnn.com");
	}
	@Test
	public void product_test2() {
		driver.get("http://www.bbc.com");
	}
	@Test
	public void product_test3() {
		driver.get("http://www.foxnews.com");
	}
	@Test
	public void product_test4() {
		driver.get("http://www.cbsnews.com");
	}

}
