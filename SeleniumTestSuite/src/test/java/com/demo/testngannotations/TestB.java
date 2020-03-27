package com.demo.testngannotations;

import org.testng.annotations.Test;

public class TestB extends Base{
	
	
	@Test
	public void t1() {
		System.out.println("i am test 1 in class TESTB");
	}
	
	@Test
	public void t2() {
		System.out.println("i am test 2 in class TESTB");
	}
	
	
}
