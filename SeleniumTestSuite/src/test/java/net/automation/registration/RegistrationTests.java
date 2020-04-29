package net.automation.registration;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class RegistrationTests extends TestBase {
	@Test
	public void register_with_required_fields_only() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test
	public void register_missing_required_fields_only() {
		webui.launch("http://www.automationpractice.com");
	}
	
	@Test
	public void register_partial_required_fields_only() {
		webui.launch("http://www.automationpractice.com");
	}

}
