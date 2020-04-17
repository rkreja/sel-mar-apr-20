package com.automationpractice.login;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class TestFramework extends TestBase{
	
	
	@Test
	public void t1() {
		webui.launch("http://www.google.com");
	}

}
