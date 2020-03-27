package com.demo.testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	@BeforeSuite
	public void bs() {
		System.out.println("Prepare tester name");
		System.out.println("Prepare test environemnt");
	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("Gnerate report");
	}
	
	@BeforeClass
	public void bc() {
	System.out.println("prepare test data");	
	System.err.println("browser open");
	}
	
	@AfterClass
	public void ac() {
	System.out.println("remove all test data\n\n\n\n");	
	System.err.println("broswe close");
	}
	
//	@BeforeClass
//	public void bm() {
//		System.err.println("browser open");
//	}
	
	@AfterMethod
	public void am() {
//		System.err.println("broswe close");
	}

}
