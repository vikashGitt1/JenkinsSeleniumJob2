package com.a32hp.automationpracticee.framework.test.createaccountandlogin;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import com.a32hp.automationpracticee.framework.genericclasses.UI_GenericMethods1;
import com.a32hp.automationpracticee.framework.helper.TestBase.TestBasee;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.SignInPage;
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.myaccount.MyAccountPage;
import com.a32hp.automationpracticee.framework.pageobject.search.SearchResultPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class SignInTest extends TestBasee{
 

	

	
	SignInPage signInPgObj; 
	MyAccountPage myAccountPageObj;
	String Browser;

/*
    public void navigationToTestPage() throws IOException{
    	
    	homeObj = gm_OpenApp(Browser, URL, OSName);
    	System.out.println("*******Now navigate to login page*******");
       		lognObj = homeObj.navigateToSignInPage();
			System.out.println("*******Login page is in display*******");
		
    }
*/
	
	@BeforeMethod(alwaysRun = true)
    @Parameters({ "Browser", "URL", "OSName"/**/})
    public void getBrowser(String Browser, String URL, String OSName/**/) throws IOException, InterruptedException, InstantiationException, IllegalAccessException{
		this.Browser = Browser;	
		gm_WriteToLog("Launch "+URL+" on "+Browser+" on "+OSName, "I"); 
    	System.out.println("Launch "+URL+" on "+Browser+" on "+OSName);
    	homeObj = gm_OpenApp(Browser, URL, OSName);   
    	signInPgObj = homeObj.navigateToSignInPage();
    	gm_WriteToLog("*****************SignIn Page***************** is in display", "I");
    	System.out.println("*****************SignIn Page***************** is in display");
    	//    	System.out.println("getBrowser Method ");TBR
		//System.out.println("*******Login page is in display*******");	TBR
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
	 
		//	driverObj.get("file:///G:/QA/AutomationTools/Selenium/WorkspaceMars1/1.2hp.com.automationprac/TestReports/ExtentReport/ExtentReport.html");
			
	  
	
	
	
	
	
	
		 
	@Test (priority = 0, groups = {"SignInpage_txt", "txt", "Low", "createaccountandlogin"}/*, dependsOnMethods = { "validateSignInPage_SignInSectionHeading_SIP" }*/)
  	public  void validateSignInPage_PageHeading_SIP() throws Exception{
  		// System.out.println("In validateSignInPage_PageHeading Method_SIP");  TBR  		
  		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I"); TBR
		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "SignIn_PageHeading_txt";		
		Comment = "validatePageHeading_SignInpage";		
		String actualResultComment = "Actual SignIn Page Heading  Text  [Actual Result] =  ";
		actualResult = gm_getActualText(signInPgObj.PageHeading_SignIn_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);			
		expectedResult = "AUTHENTICATION";
		gm_WriteToLog("Expected SignIn Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected SignIn Page Heading Text [Expected Result] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   //	gm_WriteToLog("Test Passed", "I"); Already Covered in listeners
	  // 	gm_WriteToLog("Execution of  Test ********************["+currentMethodName+"]******************** is complete", "I"); TBR
		//System.out.println("Out  of validateSignInPageHeading method_SIP");TBR
  	}	
   
 	@Test (priority = 1, groups = {"SignInpage_txt", "txt", "Low", "createaccountandlogin"}/*, dependsOnMethods = { "validateSignInPageBreadcrumbText_SIP" }*/) //
  	public  void validateSignInPage_SignInSectionHeading_SIP() throws Exception{
  		//System.out.println("In validateSignInPage_SignInSectionHeading Method_SIP");  TBR
  		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I");TBR
 		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "SignInPage_SignInSectionHeading_txt";		
		Comment = "validateSectionHeading_SignInpage";		
		String actualResultComment = "Actual SignIn Section Heading Text [Actual Result] = ";
		actualResult = gm_getActualText(signInPgObj.SectionHeading_SignIn_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);		
		expectedResult = "ALREADY REGISTEREDD?";
		gm_WriteToLog("Expected SignIn Section Heading Text [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected SignIn Section Heading Text [Expected Result] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	   	
	   //	gm_WriteToLog("Test Passed", "I");	   Already Covered in listeners
	  // 	gm_WriteToLog("Execution of  Test ********************["+currentMethodName+"]******************** is complete", "I"); TBR
		// System.out.println("Out  of validateSignInPage_SignInSectionHeading method_SIP"); TBR
  	}	
   	

	@Test (priority = 2, groups = {"SignInpage_txt", "txt", "Low", "createaccountandlogin"}/*, dependsOnMethods = { "validateRegistrationSectionHeading_SignInPage_SIP" }*/) //
  	public  void validateSignInPageBreadcrumbText_SIP() throws Exception{
  		//System.out.println("In validateSignInPageBreadcrumbText Method_SIP"); TBR
  		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I");TBR
  		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "SignInPage_Breadcrumb_txt";		
		Comment = "validateSignInPageBreadcrumbText";	
		String actualResultComment = "Actual SignInPage Breadcrumb Text [Actual Result] = ";
		actualResult = gm_getActualText(signInPgObj.Brdcrmb_SignIn_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);		
		expectedResult = "Authentication";	
		gm_WriteToLog("Expected SignInPage Breadcrumb Text [ExpectedResult] = "+expectedResult, "I");
		System.out.println("Expected SignInPage Breadcrumb Text [ExpectedResult] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	   	//gm_WriteToLog("Execution of  Test ********************["+currentMethodName+"]******************** is complete", "I"); TBR
	//	System.out.println("Out  of validateSignInPageBreadcrumbText method_SIP");TBR
  	}	
  	@Test (priority = 3, groups = {"SignInpage_txt", "smoke",  "Low", "createaccountandlogin"}/*, dependsOnMethods = { "validateLoginProcess_SIP" }*/)
  	public  void validateRegistrationSectionHeading_SignInPage_SIP() throws Exception{
  		//System.out.println("In validateRegistrationSectionHeading_SignInPage Method_SIP");  TBR  		
  		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I"); TBR
  		
  		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
  		elementName = "RegistrationSectionHeading_SignInPage_txt";
		Comment = "validateSectionHeading_SignInpage";
		String actualResultComment = "Actual Registration Section Heading Text [Actual Result] = ";
		actualResult = gm_getActualText(signInPgObj.SectionHeading_CreateAccount_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "CREATE AN ACCOUNT";
		gm_WriteToLog("Expected Registration Section Heading Text [ExpectedResult] = "+expectedResult, "I");
		System.out.println("Expected Registration Section Heading Text [ExpectedResult] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	   	//gm_WriteToLog("Execution of  Test ********************["+currentMethodName+"]******************** is complete", "I"); TBR
		//System.out.println("Out  of validateRegistrationSectionHeading_SignInPage method_SIP"); TBR
  	}	
  	
	@Test (priority = 4, groups = {"SignInpage_func","SignInpage_smoke", "smoke", "func", "createaccountandlogin"}/*, dependsOnMethods = { "validateForgotPasswordLink_SIP" }*/) //
    public void validateLoginProcess_SIP() throws Exception {
  		//System.out.println("In validateLoginProcess Method_SIP");TBR  		
  		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I");TBR
  		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		myAccountPageObj =  signInPgObj.validateLogin("1");
		gm_WriteToLog("login done using data from test data sheet", "I");
		System.out.println("login done using data from test data sheet");
		elementName = "Validate Login Process_txt";
		Comment = "validateLoginProcess";
		gm_WriteToLog("Now Verify the page title of My Account page and check whether it meets the expectd result.", "I");
		System.out.println("Now Verify the page title of My Account page and check whether it meets the expectd result.");
		String actualResultComment = "Actual My Account Page Heading [ActualResult] = ";
		actualResult = gm_getActualText(myAccountPageObj.MyAccount_PageHeading_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "MY ACCOUNT";
		gm_WriteToLog("Expected MyAccountPage Heading  Text [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected MyAccountPage Heading  Text [Expected Result] = "+expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		
		//gm_WriteToLog("Execution of  Test ********************["+currentMethodName+"]******************** is complete", "I"); TBR
		//System.out.println("Out  of validateLoginProcess method_SIP"); TBR
  	}
  	
	@Test (priority = 5, groups = {"SignInpage_func", "func", "Medium", "createaccountandlogin"}/**/)
  	public void validateForgotPasswordLink_SIP() throws IOException, InterruptedException, InvalidFormatException{
		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		//gm_WriteToLog("Test execution of ********************["+currentMethodName+"]******************** is about to start", "I");//TBR
  		
		elementName = "ForgotPassword_link";
		expectedResult = "http://automationpractice.com/index.php?controller=password";
		Comment = "ForgotPassword_link";
		String actualresultComment = "URL associated with link/button - " + elementName + " [ActualResult] = ";
		signInPgObj.validateForgotPasswordLink();		
		gm_WriteToLog("*******Forgot Password page is in displayy*******", "I");
		System.out.println("*******Forgot Password page is in displayy*******");
		actualResult = gm_getActualURL(driverObj.getCurrentUrl(), elementName, extentTestLogger, Comment, currentMethodName, actualresultComment);	
		gm_WriteToLog("URL associated with link/button - " + elementName + " [ExpectedResult] = "+expectedResult, "I");
		System.out.println("URL associated with link/button - " + elementName + " [ExpectedResult] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);		

		
  	}
}