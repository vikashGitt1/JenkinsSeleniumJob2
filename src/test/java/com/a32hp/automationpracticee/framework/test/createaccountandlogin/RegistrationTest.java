package com.a32hp.automationpracticee.framework.test.createaccountandlogin;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a32hp.automationpracticee.framework.genericclasses.UI_GenericMethods1;
import com.a32hp.automationpracticee.framework.helper.TestBase.TestBasee;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.RegistrationPage;
import com.a32hp.automationpracticee.framework.pageobject.createaccountandlogin.SignInPage;
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.myaccount.MyAccountPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
 

public class RegistrationTest extends TestBasee{
	RegistrationPage registrationPageObj;
	SignInPage signInPgObj; 
	MyAccountPage myAccountPageObj;
	int i=1;
	String Browser;
    @BeforeMethod(alwaysRun = true)
    @Parameters({ "Browser", "URL", "OSName"/**/})
    public void getBrowser(String Browser, String URL, String OSName/**/) throws IOException, InterruptedException, InstantiationException, IllegalAccessException{
    	this.Browser = Browser;
		//System.out.println("getBrowser Method ");
		gm_WriteToLog("Launch "+URL+" on "+Browser+" on "+OSName, "I"); 
    	System.out.println("Launch "+URL+" on "+Browser+" on "+OSName);
    	homeObj = gm_OpenApp(Browser, URL, OSName); 
    	//System.out.println(">>>>>>>>Homepage is in display\n");
    	//System.out.println("*************************Now navigate to login page*********************************");
		signInPgObj = homeObj.navigateToSignInPage();
    	gm_WriteToLog("*****************SignIn Page***************** is in display", "I");
    	System.out.println("*****************SignIn Page***************** is in display");
		registrationPageObj = signInPgObj.validateCreateAccountBtn("1");
		gm_WaitVIsibility(registrationPageObj.PersonalInfoTitle_Txt, 50000);
    	gm_WriteToLog("*****************Registration Page***************** is in display", "I");
    	System.out.println("*****************Registration Page***************** is in display");	
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
    
    
    
    
    
	@Test (priority = 0, groups = {"Registrationpage_txt", "txt", "Low", "createaccountandlogin"}) 
  	public  void validatePageHeading_RP() throws Exception{		 
  		//System.out.println("In validatePageHeading_RP Method"); TBR
		
		 String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
  		 elementName = "RegistrationPage_PageHeading_txt";
		 Comment = "validatePageHeading_RegistrationPage";
		 String actualResultComment = "Actual Registration Page Heading  Text  [Actual Result] =  "; //Need updation
		 actualResult = gm_getActualText(registrationPageObj.CreateAccountPageTitle_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		 System.out.println("actual_pageHeading = "+actualResult);
		 expectedResult = "CREATE AN ACCOUNTT";
		 gm_WriteToLog("Expected Registration Heading  Text [Expected Result] = "+expectedResult, "I");
		 System.out.println("Expected Registration Heading  Text [Expected Result] = "+expectedResult);
	     Assert.assertEquals(actualResult, expectedResult);
	     
		//System.out.println("Out  of validatePageHeading_RP method"); TBR
  	}	
   
  	@Test (priority = 1, groups = {"Registrationpage_txt", "txt", "Low", "createaccountandlogin"}) 
  	public  void validateBreadcrumbText_RP() throws Exception{  		
  		//System.out.println("In validateBreadcrumbText_RP Method"); TBR
  		
  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "RegistrationPage_Breadcrumb_txt";
		Comment = "validateBreadcrumbText_RegistrationPage";
		String actualResultComment = "Actual RegistrationPage BreadcrumbText [Actual Result] =  ";
		actualResult = gm_getActualText(registrationPageObj.CreateAccount_Breadcrumb_Txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);	
		expectedResult = "Authenticationn";
		gm_WriteToLog("Expected RegistrationPage BreadcrumbText [Expected Result] = "+expectedResult, "I"); //Need updation
		System.out.println("Expected RegistrationPage BreadcrumbText [Expected Result] = "+expectedResult); //Need updation
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
		//System.out.println("Out  of validateBreadcrumbText_RP method"); TBR
  	}
  	
    @Test (priority = 2, groups = {"Registrationpage_func", "smoke", "createaccountandlogin"})
   //@Parameters({ "TestDataPath1", "TDSheetName1", "rownum" })
	public void validateRegistrationProcess_RP () throws InvalidFormatException, IOException, InterruptedException  {
	   	//System.out.println("In validateRegistrationProcess method_RP  ");  TBR
    	
    	String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	   	WebElement myAccountPageTitleEle = registrationPageObj.validateRegistrationPage("1");
		elementName = "ValidateRegistrationProcess_myAccountPageTitle_txt";
		Comment = "ValidateRegistrationProcess";
		String actualResultComment = "Actual MYACCOUNT Page Heading  Text  [Actual Result] =  ";  
		actualResult = gm_getActualText(myAccountPageTitleEle, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		//System.out.println("*****actual_pageHeading***** = "+actualResult); TBR
		expectedResult = "MY ACCOUNT";
		gm_WriteToLog("Expected MYACCOUNT Page Heading  Text [Expected Result] = "+expectedResult, "I");  
		System.out.println("Expected MYACCOUNT Page Heading  Text [Expected Result] = "+expectedResult);  
		Assert.assertEquals(actualResult, expectedResult);
		
		//System.out.println("Out  of validateRegistrationProcess method_RP ");  TBR
			
	}
}
