package com.a32hp.automationpracticee.framework.test.information;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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
import com.a32hp.automationpracticee.framework.pageobject.information.AboutUsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.ContactUsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.StoresPage;
import com.a32hp.automationpracticee.framework.pageobject.search.SearchResultPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class AboutUsTest extends TestBasee {

	AboutUsPage	aboutUsPageObj;
	String Browser;
	//SignInPage SignInPageObj; TBR
	//String resultStatus; TBR
	//String elementName; TBR
	//String screenshot_Path; TBR
	//String image; TBR
	//String Comment; TBR
	//String actualResult; TBR
	//String expectedResult; TBR
	
	@BeforeMethod
	@Parameters({ "Browser", "URL" })
    public void setup(String Browser, String URL) throws IOException{
		this.Browser = Browser;
       	aboutUsPageObj = homeObj.navigateToAboutUsPage();
    	gm_WriteToLog("*****************AboutUs Page***************** is in display", "I");
    	System.out.println("*****************AboutUs Page***************** is in display");

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
	//"********Validation of AboutUsPageHeading********");
  	@Test (priority = 1)
  	public  void validateAboutUsPageHeading() throws Exception{
 
		//System.out.println("In validateAboutUsPageHeading Method");TBR
  		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "AboutUs_PageHeading_txt";
		Comment = "validatePageHeading_AboutUsPage";
		String actualResultComment = "Actual AboutUs Page Heading Text [Actual Result] =  ";
		actualResult = gm_getActualText(AboutUsPage.AboutUsPageTitle_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
//		System.out.println("actual_pageHeading = "+actual_pageHeading); TBR
		expectedResult = "ABOUT US";
	//	resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger);
		gm_WriteToLog("Expected AboutUs Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected AboutUs Page Heading Text [Expected Result] = "+expectedResult);
  	}	
  	
	//"********Validation of AboutUsPageBreadcrumb********");
  	@Test (priority = 2)
  	public  void validateAboutUsPageBreadcrumbText() throws Exception{ 
		//System.out.println("In validateAboutUsPageBreadcrumbHeading Method"); TBR
  		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName(); 
		elementName = "AboutUs_Breadcrumb_txt";
		Comment = "validatePageHeading_SignInpage";	
		String actualResultComment = "Actual SignIn Page Heading  Text  [Actual Result] =  ";
		actualResult = gm_getActualText(AboutUsPage.BreadCrumb_AboutUs_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult =  "About us";
		gm_WriteToLog("Expected AboutUs page Breadcrumb Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected AboutUs Page Breadcrumb Text [Expected Result] = "+expectedResult);
		
//		resultStatus = gm_assertionAndResultReporting(actual_breadcrumb, expected_breadcrumb, elementName, logger);
		//System.out.println("Out  of validateAboutUsPageBreadcrumbHeading method"); TBR
  	}	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
		
}
