package com.a32hp.automationpracticee.framework.helper.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class ProjectEventListeners extends AbstractWebDriverEventListener{

	
	
	
	
	@Override
	public void beforeAlertAccept(WebDriver driver) {
		Reporter.log("*********beforeAlertAccept************");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		Reporter.log("*********afterAlertAccept************");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		Reporter.log("***********afterAlertDismiss**********");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		Reporter.log("***********beforeAlertDismiss**********");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		Reporter.log("***********beforeNavigateTo**********");
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		Reporter.log("************afterNavigateTo*********");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		Reporter.log("**********beforeNavigateBack***********");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		Reporter.log("***********afterNavigateBack**********");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		Reporter.log("**********beforeNavigateForward***********");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		Reporter.log("**********afterNavigateForward***********");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		Reporter.log("***********beforeNavigateRefresh**********");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		Reporter.log("***********afterNavigateRefresh**********");
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		Reporter.log("***********beforeFindBy**********");
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		Reporter.log("***********afterFindBy**********");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		Reporter.log("**********beforeClickOn***********");
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		Reporter.log("**********afterClickOn***********");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		Reporter.log("**********beforeChangeValueOf***********");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		Reporter.log("**********afterChangeValueOf***********");
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		Reporter.log("************beforeScript*********");
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		Reporter.log("***********afterScript**********");
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		Reporter.log("**********beforeSwitchToWindow***********");
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		Reporter.log("************afterSwitchToWindow*********");
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		Reporter.log("***********onException**********");
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		Reporter.log("************beforeGetScreenshotAs*********");
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		Reporter.log("*********afterGetScreenshotAs************");
		
	}

}
