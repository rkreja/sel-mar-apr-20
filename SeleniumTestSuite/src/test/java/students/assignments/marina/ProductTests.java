package students.assignments.marina;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTests extends TestBase{
	
	
	
	@Test

	public void Create_and_delete_Wish_List() {


	// Training Keyword switch to alert; Date; Alert;

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
	driver.findElement(By.xpath("//li[contains(@class,'lnk_wishlist') and child::a[@title='My wishlists']]")).click();

	// Enter 'My Winter Shopping' in name test field
	driver.findElement(By.xpath("//input[@id='name' and @type='text']")).sendKeys("My Winter Shopping");

	// Click Save button
	driver.findElement(By.xpath("//button[@id='submitWishlist']")).click();


	//Step 9 Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View

	String name = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
	String qty = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
	String viewed = driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
	//String created = driver.findElement(By.xpath("//tr[1]/td[4]")).getText();
	String directlink = driver.findElement(By.xpath("//tr[1]/td[5]")).getText();

	Assert.assertEquals(name, "My Winter Shopping");
	Assert.assertEquals(qty, "0");
	Assert.assertEquals(viewed, "0");
	//Assert.assertEquals(created, "");
	Assert.assertEquals(directlink, "View");

	WebDriverWait driverWait = new WebDriverWait(driver, 10);
	 boolean isPresent = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]/td[1]")))!=null;
	 System.out.println(isPresent + " yes element is visible" );

	// Delete the created wish list item
	 driver.findElement(By.xpath("//i[contains(@class,'icon-remove')]")).click();
	 
	 
	// Click OK from the alert popup
	 
	 Alert alert =driver.switchTo().alert();
	 alert.accept();

	//Step 12 Verify wishlist item is removed
	 
//	 WebElement e = driver.findElement(By.xpath("//tr[1]/td[1]"));
	 driverWait = new WebDriverWait(driver, 10);
	 isPresent = driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//tr[1]/td[1]")));
	 System.out.println(isPresent + "  element is now NOT visible" );
	 
	 Assert.assertEquals(isPresent, true);
//	 
//	 if(!e.isDisplayed()) {
//	 System.out.println("WishList item is removed");
//	 }else {
//	 System.out.println("Wishlist item is still there");
//	 }



	}
	
	
	
	
	//"//a[@class='open-comment-form'and contains(text(),'Write a review')]"
	private void myCustomWait(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement found = null;
		int retry=0;
		while(found==null && retry <=5) {
			driver.navigate().refresh();
			found = wait.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			retry++;
		}
		
	}
	

	
	
	@Test

	public void Review_on_product() {
	//Go to http://www.automationpractice.com
	driver.get("http://www.automationpractice.com");
	
	//Click Sign in button from top right corner of the page
	driver.findElement(By.className("login")).click();
	//Enter valid email address 'hellow@mailinator.com' in email address text field of right side
	driver.findElement(By.id("email")).sendKeys("hellow@mailinator.com");
	//Enter valid password 'hellow' in password text field
	driver.findElement(By.id("passwd")).sendKeys("hellow");
	//Click 'Sign in' button
	driver.findElement(By.id("SubmitLogin")).click();
	//Go to http://automationpractice.com/index.php?id_product=7&controller=product
	driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
	//Click on Write a review
	driver.findElement(By.xpath("//a[@class='open-comment-form'and contains(text(),'Write a review')]")).click();
	//Click Send button without typing anything
	driver.findElement(By.xpath("//span[text()='Send' and parent::button[@id='submitNewMessage']]")).click();
	//Verify 'Title is incorrect' text displayed
	String msg = driver.findElement(By.xpath("//li[text()='Title is incorrect']")).getText();
    Assert.assertEquals(msg, "Title is incorrect");
	//Verify 'Comment is incorrect' text displayed
	//Check the xpath please. Showing can�t find. Though Element found through Filter.
	 msg = driver.findElement(By.xpath("//li[preceding-sibling::li[text()='Title is incorrect']]")).getText();
	Assert.assertEquals(msg, "Comment is incorrect");
	//Enter 'Awesome dress' in title
	driver.findElement(By.xpath("//input[@id='comment_title' and @name='title']")).sendKeys("Awesome dress");
	//Enter 'Best purchase ever!!!' in Comment
	driver.findElement(By.xpath("//textarea[@id='content' and @name='content']")).sendKeys("Best purchase ever!!!");
	//Click Send button
	driver.findElement(By.xpath("//span[text()='Send' and parent::button[@id='submitNewMessage']]")).click();
	//Verify 'Your comment has been added and will be available once approved by a moderator' text displayed in popup
	msg = driver.findElement(By.xpath("//p[contains(text(),'Your comment')]")).getText();
	Assert.assertEquals(msg, "Your comment has been added and will be available once approved by a moderator");
	//Click OK
	driver.findElement(By.xpath("//span[text()='OK' and parent::button[@type='submit']]")).click();
	//Verify 'write a review' button gets appeared after few seconds
	                         

	}
	
	@Test

	public void Discounted_product_listing() {
	//Go to http://automationpractice.com/index.php
	driver.get("http://automationpractice.com/index.php");
	//Verify -5% displayed on product 'Printed Summer Dress'
	// Not sure, how to verify this? Do I have to use Actions first ? or Only Assert it? Check plz.
	Actions actions = new Actions(driver);
	WebElement e = driver.findElement(By.xpath("(//a[@title='Printed Summer Dress' and following-sibling::div[child::span[text()='-5%']]])[1]"));
	actions.moveToElement(e).build().perform();
	WebElement p = e.findElement(By.xpath(".//img[1]/../../"));
	System.out.println(p.findElement(By.xpath(".//span[@class='price-percent-reduction'")).getText());
	
	String msg = driver.findElement(By.xpath("(//span[@class='price-percent-reduction' and text()='-5%'])[1]")).getText();
	Assert.assertEquals(msg, "-5%");
	//Click on More for this product
	//Can I use the upper Xpath to find the more, since there are other more too?
	//Verify -5% also displays on right side
	// Check the xpath please.
	 msg =  driver.findElement(By.xpath("//span[@id='reduction_percent_display']")).getText();
     Assert.assertEquals(msg, "-5%");

	}

	@Test

	public void Colour_choosing_on_product() {
		
		String img_for_blue = "http://automationpractice.com/img/p/4/4-large_default.jpg";
		String img_for_org = "http://automationpractice.com/img/p/1/1-large_default.jpg";
		// Go to
		// http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue");
		// Click colour button 'blue' from right side
		driver.findElement(By.xpath("//a[@id='color_14' and @name='Blue']")).click();
		
		String imgUrl = driver.findElement(By.id("bigpic")).getAttribute("src");
		Assert.assertEquals(imgUrl, img_for_blue);
//	    Verify left side image changes
		// How do I verify image?
		driver.findElement(By.xpath("//img[@id='bigpic' and @title='Faded Short Sleeve T-shirts']"));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Click colour orange now
		driver.findElement(By.xpath("//a[@id='color_13' and @name='Orange']")).click();
		
		// Verify image on left side is not the same one before
		imgUrl = driver.findElement(By.id("bigpic")).getAttribute("src");
		Assert.assertEquals(imgUrl, img_for_org);
	}

	@Test

	public void Product_Compare() {
	//Go to http://www.automationpractice.com
	driver.get("http://www.automationpractice.com");
	//Enter 'Dress' in search text box on top
	driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("Dress");
	//Click on search button icon
	driver.findElement(By.xpath("//button[@type='submit' and @name='submit_search']")).click();
	//Click 'Add to Compare' link for first product
	driver.findElement(By.xpath("//a[@class='add_to_compare' and @data-id-product='5']")).click();
	//Verify On top right of panel, Green Compare button has text 'Compare (1)'
	// Check the xpath please. It�s not working. Though Element found through Filter.
	String msg = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).getText();
	Assert.assertEquals(msg, "Compare (1)");
	//Click 'Add to Compare' link for second product now
	driver.findElement(By.xpath("//a[@class='add_to_compare' and @data-id-product='4']")).click();
//	            Verify On top right of panel, Green Compare button text changes to  'Compare (2)'
//	            Click on Green Compare button
//	            Verify Properties for first product is: Short Dress
	//Verify Properties for second product is: Maxi Dress
	//Verify Styles for first product is: Dressy
	//Verify Style for second product is: Casual
//	            Verify Compositions for first product is: Viscose
//	            Verify Properties for second product is: Viscose
	//Verify Price for first product is: $50.99
//	            Verify Price for second product is: $28.98 and 'reduced price' also displayed
//	            Delete second product from compare list by clicking delete button on right top of the product
//	            Verify second product is not in the list any more
	}
	
}
