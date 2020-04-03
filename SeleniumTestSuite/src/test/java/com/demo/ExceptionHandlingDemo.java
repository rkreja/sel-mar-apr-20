package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ExceptionHandlingDemo extends TestBase{
	
	public static void main(String[] args) {
		
		
		
		
		try {
			System.out.println("going to app");
			System.out.println("clicking on sign in button");
			System.out.println("entering my username : john");
			System.out.println(1/0);
			System.out.println("entering password: 123456");
			System.out.println("clicking login button");
			System.out.println("going to my profile");
			System.out.println("click edit profile ");
			System.out.println("update pwd with new pwd : 987654 ");
			System.out.println("click save ");
			System.out.println("verify success msg 'you pwd has been changed' ");
			System.out.println("click edit profile ");
			System.out.println(1/0);
		} catch (Exception e) {
			System.err.println("report the error: "+ e.getMessage());
//			Assert.fail();
		}
		
		
		System.out.println("update pwd with new pwd : 123456 ");
		System.out.println("click save ");

		
	}
	
	
	@Test
	public void signIn() {
		
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//going 
		//clicking on sign in button
		//entering my username: john
		//entering password: 123456
		//clicking login button
		//verifying welcome msg
		
		
	}
	
	@Test
	public void updatePwd() {
		
		//going 
		//clicking on sign in button
		//entering my username : john
		//entering password: 123456
		//clicking login button
		//going to my profile
		//click edit profile
		//update pwd with new pwd : 987654
		//click save
		//verify success msg 'you pwd has been changed'
		//click edit profile
		
		//here comes error
		
		//update pwd with new pwd : 123456
		//click save
		
		
	}

}
