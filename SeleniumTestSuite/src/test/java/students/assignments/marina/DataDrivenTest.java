package students.assignments.marina;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class DataDrivenTest extends TestBase{
	
	@DataProvider(name = "zipcode generator")
	public String[][] get_data(){
	     String[][] data = new String[][] {
	     {"10006","New York"},
	     {"10456","Bronx"},
	     {"12058","Earlton"},
	     
	     };
	     
	     return data;

	}
	
	@Test(dataProvider = "zipcode generator")

	public void City_lookup_by_zipcode(String zipcode, String cityName) {

	//Training Keyword for loop; for each loop; dataprovider; navigate; read excel file;  if statement; random number

	//Step 1 Goto: http://www.vmoving.org/movers-zipcode.php

	   driver.get("http://www.vmoving.org/movers-zipcode.php");

	//Step 2 Pick random NY zipcode from given sheet in test data column
	   
	//Step 3 Once one zipcode has been picked enter it in 'Type Zipcode' text field
	   driver.findElement(By.xpath("//input[@name='zip' and parent::form[@id='form3']]")).sendKeys(zipcode);
	   
	//Step 4 Click Search
	   driver.findElement(By.xpath("//a[@data-type='submit' and parent::form[@id='form3']]")).click();
	   
	//Step 5 Verify Text displayed : Moving Company {city name specified in sheet} {given zipcode}"
	   
	  String msg =  driver.findElement(By.xpath("//h1[contains(text(),'Moving Company')]")).getText();
	  Assert.assertEquals(msg, "Moving Company "+zipcode+" "+cityName+", NY");
	  
//	  if(msg.contains(zipcode)) {
//	 
//	for (int i = 0; i <= 3; i++) {
//	System.out.println("Moving Company"   +    zipcode     +    "cityname");
//
//	}
//
//	 
//	  }else {
//	 
//	  }
//	//Step 6 Go back and repeat step 2-6 for 20 times.

	}
	

}
