package students.assignments.marina;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileTests {
	
	@Test
	public void profile_003() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");

		
		

		// Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();

		// Enter valid email address 'hellow@mailinator.com' in email address text field of right side
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hellow@mailinator.com");

		// Enter valid password 'hellow' in password text field
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("hellow");

		// Click 'Sign in' button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

		// Click MY WISH LISTS button
		driver.findElement(By.xpath("//span[text()='My wishlists']")).click();

		// Enter 'My Winter Shopping' in name test field
		driver.findElement(By.xpath("//input[@id='name' and @type='text']")).sendKeys("My Winter Shopping");

		// Click Save button
		driver.findElement(By.xpath("//button[@id='submitWishlist']")).click();


		// Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
		String name = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
		String qty = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
		String viewed = driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
		String created = driver.findElement(By.xpath("//tr[1]/td[4]")).getText();
		String directLink = driver.findElement(By.xpath("//tr[1]/td[5]")).getText();
//		
//		System.out.println(name);
//		System.out.println(qty);
//		System.out.println(viewed);
//		System.out.println(created);
//		System.out.println(directLink);
//		if(name.equals("My Winter Shopping")) {
//			System.out.println("test is pass");
//		}
		Assert.assertEquals(name, "My Winter Shopping");
		Assert.assertEquals(qty, "0");
		Assert.assertEquals(viewed, "0");
		Assert.assertEquals(created, "2020-03-25");
		Assert.assertEquals(directLink, "View");
		
		// Delete the created wish list item

		// Click OK from the alert popup
		// Verify wishlist item is removed

	}
	

}
