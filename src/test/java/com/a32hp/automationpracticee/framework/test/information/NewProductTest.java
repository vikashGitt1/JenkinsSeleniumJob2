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
import com.a32hp.automationpracticee.framework.pageobject.information.NewProductsPage;
import com.a32hp.automationpracticee.framework.pageobject.information.PriceDropPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;





public class NewProductTest extends TestBasee{

 
	NewProductsPage newProductPageObj;
	String Browser;
	//String actualResult;; TBR
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
    	newProductPageObj = homeObj.navigateToNewProductsPage();
		//System.out.println("*******NewProductsPage is in display*******");; TBR
    	gm_WriteToLog("*****************NewProducts Page***************** is in display", "I");
    	System.out.println("*****************NewProducts Page***************** is in display");
 	
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
	
   

	//"********Validation of NewProductPageHeading********");
  	@Test (priority = 0)
  	public  void validateNewProductPageHeading_txt() throws Exception{
  		//System.out.println("In validateNewProductPageHeading_txt Method"); TBR

		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "NewProducts_PageHeading_txt";
		Comment = "Validate New Products PageHeading";
		String actualResultComment = "Actual NewProduct Page Heading Text [ActualResult] = ";
		actualResult = gm_getActualText(newProductPageObj.pageTitle_NewProductPage_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
//		System.out.println("actual_pageHeading = "+actual_pageHeading);
		expectedResult = "NEW PRODUCTS";
		gm_WriteToLog("Expected NewProduct Page Heading Text [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected NewProduct Page Heading Text [Expected Result] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
//		resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger); TBR
	//	System.out.println("resultStatus = "+ resultStatus); TBR
	//	System.out.println("Out  of validateNewProductPageHeading_txt method"); TBR
   
  	}		 
   
  	@Test (priority = 1)
  	public  void validateNewProductPageBreadcrumb_txt() throws Exception{
  	//	System.out.println("In validateNewProductBreadcrumb_txt Method"); TBR

		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "NewProductPage_Breadcrumb_txt";
		Comment = "Validate NewProductPage Breadcrumb Text";
		String actualResultComment = "Actual NewProductPage Breadcrumb Text [ActualResult] = ";
		actualResult = gm_getActualText(newProductPageObj.breadcrumb_NewProductPage_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "New products";		
		gm_WriteToLog("Expected NewProductPage Heading Text [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected NewProductPage Heading Text [Expected Result] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
//		resultStatus = gm_assertionAndResultReporting(actual_breadcrumb, expected_breadcrumb, elementName, logger); TBR
//		System.out.println("Out  of validateNewProductBreadcrumb_txt method"); TBR
   
  	}		 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
