package com.demo.parallel;

import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class Order extends TestBase{
	
	
	@Test
	public void order_test1() {
		driver.get("http://www.delta.com");
	}
	@Test
	public void order_test2() {
		driver.get("http://www.kayak.com");
	}
	@Test
	public void order_test3() {
		driver.get("http://www.momondo.com");
	}
	@Test
	public void order_test4() {
		driver.get("http://www.emirates.com");
	}

}
