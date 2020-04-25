package com.a32hp.automationpracticee.framework.test.information;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a32hp.automationpracticee.framework.genericclasses.UI_GenericMethods1;
import com.a32hp.automationpracticee.framework.helper.TestBase.TestBasee;
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.information.AboutUsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.ContactUsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.StoresPage;
import com.a32hp.automationpracticee.framework.pageobject.search.SearchResultPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class ContactUsTest extends TestBasee {

	ContactUsPage contactUsPageObj;
	String Browser;
	//String actualResult; TBR
	//String expectedResult; TBR
	//String resultStatus; TBR
	//String elementName; TBR
	//String screenshot_Path; TBR
	//String image; TBR
	//String Comment; TBR
	
	
	@BeforeMethod
	@Parameters({ "Browser", "URL" })
    public void setup(String Browser, String URL) throws IOException{
		this.Browser = Browser;
    	contactUsPageObj = homeObj.navigateToContactUsPage();
		//System.out.println("*******ContactUsPage is in display*******"); TBR
    	gm_WriteToLog("*****************ContactUse Page***************** is in display", "I");
    	System.out.println("*****************ContactUs Page***************** is in display");
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
	
	
	
	
	
	
	//"********Validation of ContactUsPageHeading********");
  	@Test (priority = 0)
  	public  void validateContactUsPageHeading() throws Exception{
  		//System.out.println("In validateContactUsPageHeading Method"); TBR
  		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();  		
		elementName = "ContactUs_PageHeading_txt";
		Comment = "validateContactUsPageHeading";
		String actualResultComment = "Actual ContactUs Page Heading Text [Actual Result] =  ";
		actualResult = gm_getActualText(contactUsPageObj.PageHeading_ContactUsPage_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
	//	System.out.println("actual_pageHeading = "+actual_pageHeading); TBR
		expectedResult = "CUSTOMER SERVICE - CONTACT US";
		gm_WriteToLog("Expected ContactUs Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected ContactUs Page Heading Text [Expected Result] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	//	resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger); TBR
	//	System.out.println("resultStatus = "+ resultStatus); TBR
	//	System.out.println("Out  of validateContactUsPageHeading method"); TBR
  	}	
  	
	//"********Validation of ContactUsPageBreadcrumb********");
  	@Test (priority = 1)
  	public  void validateContactUsPageBreadcrumbText() throws Exception{
  		//System.out.println("In validateContactUsPageBreadcrumbText Method"); TBR
  		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "ContactUs_Breadcrumb_txt";
		Comment = "validateContactUsPageBreadcrumbText";
		String actualResultComment = "Actual ContactUs Page Breadcrumb Text [Actual Result] =  ";
		actualResult = gm_getActualText(contactUsPageObj.breadCrumb_ContactUsPage_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "Contact";
		gm_WriteToLog("Expected ContactUs Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected ContactUs Page Heading Text [Expected Result] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
	//	resultStatus = gm_assertionAndResultReporting(actual_breadcrumb, expected_breadcrumb, elementName, logger); TBR
	//	System.out.println("Out  of validateContactUsPageBreadcrumbText method"); TBR
  	}	
  	
 
  		/////////////////////////Validate ContactUs Process With Valid values
	@Test (priority = 2)
	public void validateContactUsProcess() throws Exception {
		//System.out.println("In validateContactUsProcess Method"); TBR
		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();	
		ContactUsPage contactUsPageObjs = contactUsPageObj.validateContactUsProcess("1");
		elementName = "Contact Us Confirmation Message";
		Comment = "Validate ContactUs Submit Process";
		String actualResultComment = "Actual Contact Us Confirmation Message [Actual Result] =  ";
		actualResult = gm_getActualText(contactUsPageObj.ContactUsConfirmationMessage_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "Your message has been successfully sent to our team.";
		gm_WriteToLog("Expected ContactUs Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected ContactUs Page Heading Text [Expected Result] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
	//	resultStatus = gm_assertionAndResultReporting(actual_ConfirmationMessage, expected_ConfirmationMessage, elementName, logger); TBR
	//	System.out.println("Out ofIn validateContactUsProcess Method"); TBR
 
   
}
		/////////////////////////Validate ContactUs Process With Valid values
	@Test (priority = 3)
	public void validateHomeButton_ContactUsConfirmationPage() throws Exception {
		//System.out.println("In validateHomeButton_ContactUsConfirmationPage Method"); TBR
		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();				
		ContactUsPage contactUsPageObjs=contactUsPageObj.validateContactUsProcess("1");
		elementName = "HomeButton_ContactUsConfirmationPage";
		Comment = "Validate HomeButton_ContactUsConfirmationPage";
		String actualResultComment = "URL associated with link/button - " + elementName + " [ActualResult] = ";
		contactUsPageObj.HomeBtn_Btn.click();
		actualResult = gm_getActualURL(driverObj.getCurrentUrl(), elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "http://automationpractice.com/index.php";
		gm_WriteToLog("URL associated with Home Button [ExpectedResult] = "+expectedResult, "I");
		System.out.println("URL associated with Home Button [ExpectedResult] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
	//	resultStatus = gm_assertionAndResultReporting(actualURL, expectedURL, elementName, logger); TBR
	//	System.out.println("Out of validateHomeButton_ContactUsConfirmationPage Method"); TBR
		
	
	}	
	
	
	
	
	
	
	
	
}
