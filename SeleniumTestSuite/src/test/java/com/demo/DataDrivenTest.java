package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class DataDrivenTest extends TestBase{
	
	
	@DataProvider(name = "website data geneator")
	public String[][] get_data() {
		String[][] data = new String[][] {
			
			{"http://www.amazon.com"},
			{"http://www.walmart.com"},
			{"http://www.target.com"},
			{"http://www.ebay.com"},
		};
		
		return data;
	}
	
	
	@Test(dataProvider = "website data geneator")
	public void sampleOne(String site) {

		if(site.contains("walmart")) {
			
		}
		else {
			driver.get(site);
			int toaltLink = driver.findElements(By.tagName("a")).size();
			System.out.println("Total link found in "+site+" is: "+ toaltLink);
		}

		
	}
	

}
