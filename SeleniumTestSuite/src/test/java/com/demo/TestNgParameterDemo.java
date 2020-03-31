package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class TestNgParameterDemo extends TestBase{
	
	/*
	 * public void testngparam(
	 * 
	 * @Optional("Summer Dress")String itemname1,
	 * 
	 * @Optional("Summer Dress2")String itemname2,
	 * 
	 * @Optional("Summer Dress3")String itemname3 ) {
	 * 
	 * }
	 */
	@Parameters({"itemname1", "itemname1price","itemname2","itemname2price","itemname3","itemname3price"})
	

	@Test
	public void testngparam(String itemname1,String itemname1price, String itemname2,String itemname2price,String itemname3, String itemname3price) {
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname1);
		driver.findElement(By.name("submit_search")).click();
		
		//get text name
		
		//get text price
		
		//assert name
		//assert price
		
		

		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname2);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname3);
		driver.findElement(By.name("submit_search")).click();

	}
	
	
	/*
	 * @Test public void search_009() { driver.get("");
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); String itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); String itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51"); }
	 * 
	 * @Test public void search_009() {
	 * 
	 * driver.get("");
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); String itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); String itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Blouse");
	 * driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Blouse"); Assert.assertEquals(itemPrice,
	 * "$27.00");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * 
	 * driver.findElement(By.id("searchbox")).sendKeys("Faded Short Sleeve T-shirts"
	 * ); driver.findElement(By.id("submit")).click(); itemName =
	 * driver.findElement(By.id("dsdsds")).getText(); itemPrice =
	 * driver.findElement(By.id("fdfdfdf")).getText();
	 * 
	 * Assert.assertEquals(itemName, "Faded Short Sleeve T-shirts");
	 * Assert.assertEquals(itemPrice, "$16.51");
	 * 
	 * }
	 */
	
}
