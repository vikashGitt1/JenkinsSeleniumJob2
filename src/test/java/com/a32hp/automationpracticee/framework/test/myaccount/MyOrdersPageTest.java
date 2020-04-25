package com.a32hp.automationpracticee.framework.test.myaccount;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a32hp.automationpracticee.framework.genericclasses.UI_GenericMethods1;
import com.a32hp.automationpracticee.framework.helper.TestBase.TestBasee;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.SignInPage;
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.myaccount.MyAccountPage;
import com.a32hp.automationpracticee.framework.pageobject.myaccount.MyOrdersPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class MyOrdersPageTest extends TestBasee{
	
	SignInPage lognObj; 
	MyAccountPage myAccountPageObj;
	MyOrdersPage myOrdersPageObj;
	String elementName;
	String Comment;
	String actualResult;
	String expectedResult;
	String screenshot_Path;
	String image;
	String Browser;


	@BeforeMethod
	public void setup(String Browser, String URL) throws IOException{
		this.Browser = Browser;
		System.out.println("*******Now navigate to login page*******");
		lognObj = homeObj.navigateToSignInPage();
		System.out.println("*******Login page is in display*******");
		myAccountPageObj = lognObj.validateLogin("1");
		System.out.println("**********My Account page in Display**********");
		myOrdersPageObj = myAccountPageObj.navigateToMyOrderHistoryPage();
		System.out.println("**********MyOrderHistoryPage in Display**********");
	}
	  
	@AfterMethod (alwaysRun = true)
	public void publishReport_SIP() throws InterruptedException, IOException, InvalidFormatException{
		//System.out.println("publishReport_SIP");TBR
		/*String resultStatus = null;
	    if(result.getStatus() == ITestResult.FAILURE){
	    	System.out.println("In If");
	    	resultStatus = "FAILED"; 
	    	System.out.println(elementName+"--"+resultStatus);
	    	extentTestLogger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " TestCase failed due tobelow issue", ExtentColor.RED));
			extentTestLogger.fail(result.getThrowable());
			
			//CoderComment1: Generate excel report
	    	gm_generateReportWithScreenshots(actualResult, expectedResult.toString(), elementName, resultStatus);
	    	
	    	//CoderComment2: Generate extent report
			String screenshot_Path = gm_setScreenshotPath_forExtentReporting(elementName, resultStatus);
			gm_TakeSnapshot(screenshot_Path);
			System.out.println("screenshot_Path: "+screenshot_Path);	
			extentTestLogger.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(screenshot_Path).build()); 
		
			/*Below is extent2 version
				String image = extentTestLogger.addScreenCapture(screenshot_Path);
				logger.log(LogStatus.FAIL, Comment, image);
			 
			
		}*/
		/*else if(result.getStatus()==ITestResult.SUCCESS){
			extentTestLogger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ " TestCase Passed", ExtentColor.GREEN));			 
			System.out.println("In else if");
			resultStatus = "PASSED"; 
			System.out.println(elementName+"--"+resultStatus);
			
			//CoderComment1: Generate excel report
			gm_generateReportWithScreenshots(actualResult, expectedResult, elementName, resultStatus);
			
		  	//CoderComment2: Generate extent report
			String screenshot_Path = gm_setScreenshotPath_forExtentReporting(elementName, resultStatus);
			gm_TakeSnapshot(screenshot_Path);
			System.out.println("screenshot_Path: "+screenshot_Path);	
			extentTestLogger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(screenshot_Path).build()); 
			
			/*Below is extent2 version
				String image = extentTestLogger.addScreenCapture(screenshot_Path);
				extentTestLogger.log(LogStatus.PASS, Comment, image);
			
		}else{
			extentTestLogger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " TestCase Skippedd", ExtentColor.YELLOW));
			extentTestLogger.skip(result.getThrowable());
		}*/
	
		extentReports.flush();
		
		driverObj.quit();
		gm_WriteToLog(Browser+" Browser Closed", "I");
		System.out.println(Browser+" Browser Closed");
		gm_WriteToLog("\n\n\t\t\t\t\t********************************************************************************************************\n\n", "I");
		System.out.println("\n\n\t\t\t\t\t********************************************************************************************************\n\n");

	}
		/*
	@Test (priority = 1)
	public  void validateMyOrdersPage_PageHeading() throws Exception{
		System.out.println("In validateMyOrdersPage_PageHeading Method");
		logger=report.startTest("validateMyOrdersPage_PageHeading");
		elementName = "MyOrdersPage_PageHeading_txt";
		Comment = "validatePageHeading_MyOrdersPage";
		String actual_pageHeading = gm_getActualText(myOrdersPageObj.MyOrdersPage_PageHeading_Txt, elementName, logger, Comment);
		System.out.println("actual_pageHeading = "+actual_pageHeading);
		String expected_pageHeading = "ORDER HISTORY";
		resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger);
		System.out.println("resultStatus = "+ resultStatus);
		System.out.println("Out  of validateMyOrdersPage_PageHeading method");
	}	
	   
	
	@Test (priority = 2)
	public void validateBackToYourAccountButton_MyOrdersPage() throws Exception {
		System.out.println("In validateBackToYourAccountButton_MyOrdersPage Method");
		logger=report.startTest("validateBackToYourAccountButton_MyOrdersPage");		
		elementName = "BackToYourAccount_MyOrdersPage";
		Comment = "Validate BackToYourAccount_MyOrdersPage";
		String actualURL = gm_getActualURL(myOrdersPageObj.MyOrdersPage_backToYourAccount_btn, elementName, logger, Comment);
		String expectedURL = "http://automationpractice.com/index.php?controller=my-account";
		resultStatus = gm_assertionAndResultReporting(actualURL, expectedURL, elementName, logger);
		System.out.println("Out of validateBackToYourAccountButton_MyOrdersPage Method");
	}
	
	
	
	@Test (priority = 3)
	public void validateHomeButton_MyOrdersPage() throws Exception {
		System.out.println("In validateHomeButton_MyOrdersPage Method");
		logger=report.startTest("validateHomeButton_MyOrdersPage");		
		elementName = "HomeButton_MyOrdersPage";
		Comment = "Validate HomeButton_MyOrdersPage";
		String actualURL = gm_getActualURL(myOrdersPageObj.MyOrdersPage_Home_btn, elementName, logger, Comment);
		String expectedURL = "http://automationpractice.com/index.php";
		resultStatus = gm_assertionAndResultReporting(actualURL, expectedURL, elementName, logger);
		System.out.println("Out of validateHomeButton_MyOrdersPage Method");
		
	
	}	*/
}