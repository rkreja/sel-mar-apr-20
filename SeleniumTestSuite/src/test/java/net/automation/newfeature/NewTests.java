package net.automation.newfeature;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class NewTests extends TestBase {
	@Test
	public void newTest1() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test
	public void newTest2() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test(groups = {"smoke"})
	public void newTest3() {
		webui.launch("http://www.automationpractice.com");
	}

}
