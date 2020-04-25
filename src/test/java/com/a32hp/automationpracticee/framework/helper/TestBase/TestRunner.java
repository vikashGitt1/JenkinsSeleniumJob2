package com.a32hp.automationpracticee.framework.helper.TestBase;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRunner {
	
	@Test
	public static void testRunner(){
		TestNG runner = new TestNG();
		List <String> list = new ArrayList<String>();
		//
		list.add("G:\\QA\\AutomationTools\\Selenium\\SeleniumWorkspace\\A3.2hp.com.automationprac\\A3.2hp.com.atuomationprac\\test-output\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
		
	}

}
