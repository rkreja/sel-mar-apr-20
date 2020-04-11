package com.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest2{
	
	
	@DataProvider(name = "user data geneator")
	public String[][] get_data() {
		String[][]	 data = new String[][] {
			
			{"john","smith","jsmith@test.com","dsuhsudf"},
			{"mike","man","mm@test.com","dsd3243df"},
			{"peter","parker","pparker@test.com","p_parker"}
			
		};
		
		return data;
	}
	
	
	@Test(dataProvider = "user data geneator")
	public void createUsers(String fname, String lname, String email, String pwd) {

		System.out.println("Creating a user:");
		System.out.println("firstname:" + fname);
		System.out.println("lastname:" + lname);
		System.out.println("email:" + email);
		System.out.println("paswwrod:" + pwd);
		System.out.println("User ["+fname+"] created " );
		
	}
	

}
