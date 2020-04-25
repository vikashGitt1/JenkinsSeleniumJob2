package com.a32hp.automationpracticee.framework.genericclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.a32hp.automationpracticee.framework.helperclasses.ResourceHelper_v1;

public class BrowserControl {

	public static void main(String[] args) {
		//chromeBrowser();
		
		
		
		
		geckoBrowser();
	}

	
	
	
	
	
	
	public static void chromeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\QA\\AutomationTools\\Selenium\\SeleniumWorkspaceT20\\A3.2hp.com.atuomationprac\\MasterFiles_2812\\Chromedriver_win32_v2.38\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		//		public final static String geckoDriverPath = "MasterFiles_2812\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		 

		
	}
	public static void geckoBrowser(){
		
		//System.setProperty("webdriver.gecko.driver", "E:\\QA\\AutomationTools\\Selenium\\SeleniumWorkspaceT20\\A3.2hp.com.atuomationprac\\MasterFiles_2812\\geckodriver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "MasterFiles_2812\\geckodriver\\geckodriverv0260win32\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\QA\\AutomationTools\\Selenium\\SeleniumWorkspaceT20\\A3.2hp.com.atuomationprac\\MasterFiles_2812\\geckodriver\\geckodriverv0260win64\\geckodriver.exe");
		WebDriver driverObj = new FirefoxDriver();
		driverObj.get("http://www.yahoo.com");
		//		public final static String geckoDriverPath = "MasterFiles_2812\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		

		
	}
	
	
	
}
