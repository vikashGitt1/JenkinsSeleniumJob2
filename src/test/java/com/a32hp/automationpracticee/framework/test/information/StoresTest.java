package com.a32hp.automationpracticee.framework.test.information;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
import com.a32hp.automationpracticee.framework.pageobject.information.NewProductsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.StoresPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class StoresTest extends TestBasee{
		
		 
		StoresPage	storesPageObj;
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
	    	storesPageObj = homeObj.navigateToStoresPage();
			System.out.println("*******StoresPage is in display*******");
	    	gm_WriteToLog("*****************Stores Page***************** is in display", "I");
	    	System.out.println("*****************Stores Page***************** is in display");
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
	   
		//"********Validation of OurStoresPageHeading********");
	  	@Test (priority = 1)
	  	public  void validateOurStoresHeading_txt() throws Exception{
	  		System.out.println("In validateOurStoresHeading_txt Method");

			String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
			elementName = "OurStores_PageHeading_txt";
			Comment = "Validate OurStores PageHeading";
		//	String actual_pageHeading = gm_getActualText(storesPageObj.PageTitle_OurStores_txt, elementName, logger, Comment);
		//	System.out.println("actual_pageHeading = "+actual_pageHeading);
			String expected_pageHeading = "OUR STORE(S)!";
		//	resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger);
		//	System.out.println("resultStatus = "+ resultStatus);
			System.out.println("Out  of validateOurStoresHeading_txt method");
	   
	  	}		 
	   
	  	@Test (priority = 2)
	  	public  void validateOurStoresBreadcrumb_txt() throws Exception{
	  		System.out.println("In validateOurStoresBreadcrumb_txt Method");

			String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
			elementName = "OurStores_Breadcrumb_txt";
			Comment = "validate OurStores Breadcrumb Text";
		//	String actual_breadcrumb = gm_getActualText(storesPageObj.Breadcrumb_OurStores_txt, elementName, logger, Comment);
			String expected_breadcrumb = "Our store(s)!";
		//	resultStatus = gm_assertionAndResultReporting(actual_breadcrumb, expected_breadcrumb, elementName, logger);
			System.out.println("Out  of validateOurStoresBreadcrumb_txt method");
	   
	  	}	
	   	   
	   
		   
		/////////////////////////Validate Search Process with Valid values
	  	@Test (priority = 3)
	    public void validateStoreSearchProcess() throws Exception {
				System.out.println("ValidateStoreSearchProcess");
				String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
				String actualResultComment = "Actual SignIn Page Heading  Text  [Actual Result] =  ";//NeedUpdation
				String elementName = "SearchProcess";
				storesPageObj = storesPageObj.validateStoresSearchFunctionality("1");
				System.out.println("Search Initiated");
				elementName = "Available_Stores_Location_Dropdown";
				Comment = "Validation of Search Result";
				ArrayList<String> actualDropdownOptions =  gm_getActualDropdownOptions(storesPageObj.LocationDropdown_DD, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
				ArrayList<String> extectedDropdownOptions = new ArrayList<String>();
				extectedDropdownOptions.add("5 stores found -- view all results:");
				extectedDropdownOptions.add("N Miami/Biscayne (5.0 mi)");
				extectedDropdownOptions.add("Dade County (7.0 mi)");
				extectedDropdownOptions.add("Coconut Grove (8.0 mi)");
				extectedDropdownOptions.add("Pembroke Pines (16.0 mi)");
				extectedDropdownOptions.add("E Fort Lauderdale (22.0 mi)");
		//		gm_assertionAndResultReporting(actualDropdownOptions.toString(), extectedDropdownOptions.toString(), elementName, logger);
				System.out.println("Out  of validateLoginProcess method");
		}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
