package com.demo.testngannotations;

import org.testng.annotations.Test;

public class TestA extends Base{
	
	
	@Test
	public void t1() {
		System.out.println("i am test 1 in class TESTA");
	}
	
	@Test
	public void t2() {
		System.out.println("i am test 2 in class TESTA");
	}
	
	@Test
	public void t3() {
		System.out.println("i am test 3 in class TESTA");
	}

}
