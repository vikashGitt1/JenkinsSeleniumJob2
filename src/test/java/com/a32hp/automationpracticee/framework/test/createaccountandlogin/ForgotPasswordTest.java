package com.a32hp.automationpracticee.framework.test.createaccountandlogin;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a32hp.automationpracticee.framework.genericclasses.UI_GenericMethods1;
import com.a32hp.automationpracticee.framework.helper.TestBase.TestBasee;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.ForgotPasswordPage;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.RegistrationPage;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.SignInPage;
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.information.ContactUsPage;
import com.a32hp.automationpracticee.framework.pageobject.myaccount.MyAccountPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class ForgotPasswordTest extends TestBasee{



	ForgotPasswordPage forgotPswdPageObj;
	SignInPage signInPgObj; 
	String Browser;

    @BeforeMethod(alwaysRun = true)
    @Parameters({ "Browser", "URL", "OSName"/**/})
    public void getBrowser(String Browser, String URL, String OSName/**/) throws IOException, InterruptedException, InstantiationException, IllegalAccessException{
    	this.Browser = Browser;	
		//System.out.println("getBrowser Method "); TBR
		gm_WriteToLog("Launch "+URL+" on "+Browser+" on "+OSName, "I"); 
    	System.out.println("Launch "+URL+" on "+Browser+" on "+OSName);	
    	homeObj = gm_OpenApp(Browser, URL, OSName); 
      	//System.out.println("*******Now navigate to login page*******"); TBR
    	signInPgObj = homeObj.navigateToSignInPage();
    	gm_WriteToLog("*****************SignIn Page***************** is in display", "I");
    	System.out.println("*****************SignIn Page***************** is in display");
     	//System.out.println("********Now navigate to Forgot Password page*******"); TBR
		forgotPswdPageObj = signInPgObj.navigateToForgotPasswordPage();
		gm_WriteToLog("*****************Forgot Password page***************** is in display", "I");
		System.out.println("*******Forgot Password page is in display*******");
		gm_WaitVIsibility(forgotPswdPageObj.ForGotPassword_PgTtl, 50000);
		
	}	
    

	 @AfterMethod (alwaysRun = true)
		public void publishReport_FP() throws InterruptedException, IOException, InvalidFormatException{
			//System.out.println("publishReport_FP");
			/*	String resultStatus = null;
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
			
				Below is extent2 version
					String image = extentTestLogger.addScreenCapture(screenshot_Path);
					logger.log(LogStatus.FAIL, Comment, image);
				 
				
			}*/ /*else if(result.getStatus()==ITestResult.SUCCESS){
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
				
				Below is extent2 version
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
 
	@Test (priority = 0, groups = {"ForgotPasswordpage_txt", "txt", "Low", "createaccountandlogin"})
  	public  void validateForgotPasswordPage_PageHeading_FP() throws Exception{
  		//System.out.println("In validateForgotPasswordPage_PageHeading Method_FP");	TBR	
		
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
  		elementName = "ForgotPasswordPage_PageHeading_txt";
		Comment = "validatePageHeading_ForgotPasswordPage";
		String actualResultComment = "Actual ForgotPassword Page Heading Text[Actual Result] =  ";
		actualResult = gm_getActualText(forgotPswdPageObj.ForGotPassword_PgTtl, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		expectedResult = "FORGOT YOUR PASSWORD?";
		gm_WriteToLog("Expected ForgotPassword Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected ForgotPassword Page Heading Text [Expected Result] = "+expectedResult);
  		Assert.assertEquals(actualResult, expectedResult);
  		
		//System.out.println("Out  of validateForgotPasswordPage_PageHeading method_FP");	TBR	
  	}	
   

	@Test (priority = 1, groups = {"ForgotPasswordpage_func", "func", "ForgotPasswordpage_smoke", "smoke", "createaccountandlogin"})
	public void validateforgotPasswordProcess_FP() throws InvalidFormatException, IOException, InterruptedException{
	  		//System.out.println("In validateforgotPasswordProcess Method_FP");	TBR	
		
			String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
			elementName = "ForgotPasswordConfirmationMessages_txt";
			String emailValue =  forgotPswdPageObj.validateForgotPassword("1");
			System.out.println("emailValue = "+emailValue);//TBR
			Comment = "ForgotPasswordConfirmation_message";
			String actualResultComment = "Actual ForgotPassword Confirmation Message [Actual Result] =  ";
			actualResult = gm_getActualText(forgotPswdPageObj.forgotPwdConfirmationMesg_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
			expectedResult = "A confirmation email has been sent to your address: "+emailValue;
			gm_WriteToLog("Expected ForgotPassword Confirmation Message [Expected Result] = "+expectedResult, "I");
			System.out.println("Expected ForgotPassword Confirmation Message [Expected Result] = "+expectedResult);
			Assert.assertEquals(actualResult, expectedResult);
			
			//System.out.println("Out  of validateforgotPasswordProcess method_FP");	TBR	
	} 
	@Test (priority = 2, groups = {"ForgotPasswordpage_func", "func", "smoke", "Medium", "createaccountandlogin"})
	public void validateBackToLoginButton_FP() throws Exception{
			//System.out.println("In validateBackToLoginButton_FP Method");	TBR	
		
			String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();	
			String emailValue =  forgotPswdPageObj.validateForgotPassword("1");
			forgotPswdPageObj.BackToLogin_Btn.click();
			elementName = "BackToLoginButton_ForgotPasswordConfirmationPage";
			Comment = "Validate BackToLogin Button_FPConfirmationPage";			
			String actualresultComment = "URL associated with link/button - " + elementName + " [ActualResult] = ";
			actualResult = gm_getActualURL(driverObj.getCurrentUrl(), elementName, extentTestLogger, Comment, currentMethodName, actualresultComment);
			expectedResult = "http://automationpractice.com/index.php?controller=authentication";
			gm_WriteToLog("URL associated with link/button - " + elementName + " [ExpectedResult] = "+expectedResult, "I");
			System.out.println("URL associated with link/button - " + elementName + " [ExpectedResult] = "+expectedResult);
			Assert.assertEquals(actualResult, expectedResult);
			
			//System.out.println("Out of validateBackToLoginButton_FP Method");	TBR	
			
		
	}
 	//@Test (priority = 2) [Need to work on this ]
	/*	public  void validateForgotPasswordPage_Breadcrumn_text() throws Exception{
  		System.out.println("In validateForgotPasswordPage_Breadcrumb_text Method");
  		logger=report.startTest("validateForgotPasswordPage_Breadcrumb_text");
		elementName = "SignInPage_SignInSectionHeading_txt";
		Comment = "validateBreadcrumb_text_SignInpage";
		String actual_pageHeading = gm_getActualText(forgotPswdPageObj, elementName, logger, Comment);
		System.out.println("actual_pageHeading = "+actual_pageHeading);
		String expected_pageHeading = "ALREADY REGISTERED?";
		resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger);
		System.out.println("resultStatus = "+ resultStatus);
		System.out.println("Out  of validateSignInPageHeading method");
  	}	
  	*/
		
}






