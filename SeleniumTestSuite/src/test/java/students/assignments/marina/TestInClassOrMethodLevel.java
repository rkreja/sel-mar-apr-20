package students.assignments.marina;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.automationpractice.core.Settings;
import com.automationpractice.core.TestBase2;

public class TestInClassOrMethodLevel extends TestBase2{
	
	@BeforeSuite
	public void myInit() {
		Settings.browser_invoke_level="method";
	}
	
	
	@Test
	public void t1() {
		driver.get("http://www.google.com");
	}
	
	@Test
	public void t2() {
		driver.get("http://www.google.com");
	}

	
	@Test
	public void t3() {
		driver.get("http://www.google.com");
	}

	
	@Test
	public void t4() {
		driver.get("http://www.google.com");
	}


}
