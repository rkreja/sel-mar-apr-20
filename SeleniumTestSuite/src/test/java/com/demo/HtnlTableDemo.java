package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

import net.timentraining.core.util.TestUtility;

public class HtnlTableDemo extends TestBase{
	
	
	@Test
	public void get_value_from_html_table() {
		driver.get("http://automationpractice.com/");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		driver.findElement(By.id("passwd")).sendKeys("xyz1234");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("//a[@title='Orders']")).click();
		
		
		//get table element
		WebElement table = driver.findElement(By.id("order-list"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		
		System.out.println(rows.size());
		
		for(WebElement row : rows) {
			WebElement col_orderid =row.findElement(By.xpath(".//td[1]"));
			WebElement col_date =row.findElement(By.xpath(".//td[2]"));
			
			if (col_date.getText().equals("07/14/2019")) {
				System.err.println(col_orderid.getText()  +" --  " + col_date.getText() );	
			}
			
		}
		
		//verify and oreder placed today
		WebElement col_header_date = table.findElement(By.xpath(".//thead/tr/th[2]"));
		String att = col_header_date.getAttribute("class");
		if(att.equals("item footable-sortable footable-sorted")) {
			col_header_date.click();
			att = col_header_date.getAttribute("class");
			if(att.equals("item footable-sortable footable-sorted-desc")) {
				System.err.println("date column is now descending ordered");
			}
		}
		
		String date_purchased = table.findElement(By.xpath(".//tbody/tr[1]/td[2]")).getText();
//		System.out.println(date_puchsed);
		Assert.assertEquals(date_purchased, TestUtility.getTodaysDate());
		
	}
	

}
