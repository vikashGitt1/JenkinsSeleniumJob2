package com.a32hp.automationpracticee.framework.helper.TestBase;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlClass;

import com.a32hp.automationpracticee.framework.helperclasses.ConstantsHelper_v1;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class ListenersInSelenium extends TestBasee implements ITestListener{
	
	String resultStatus = null;	
	public static String testMethodname = null;
	String screenshot_Path = null;
	
	public void onTestStart(ITestResult result) {
		Reporter.log(ITestResult.class.getSimpleName()+" Test Started");
		//System.out.println(result.getName()+" Get Started");
		testMethodname = result.getName();
		try {
			gm_WriteToLog("LISTonTestStart -- Test execution of ********************["+testMethodname+"]******************** is about to start", "I");
			gm_WriteToLog("*******In ["+testMethodname+"]  Method*******", "I");
			System.out.println("Test execution of ********************["+testMethodname+"]******************** is about to start");
			System.out.println("In ["+testMethodname+"]  Method");	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void onTestSuccess(ITestResult result) {		
		System.out.println("Listeners: onTestSuccess ");
		try {
			gm_WriteToLog("Listeners: onTestSuccess ", "I");
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		//System.out.println("OTSresult.getStatus() = "+result.getStatus());//TBR
		//System.out.println("OTSresult.isSuccess() = "+result.isSuccess());//TBR
		resultStatus = "Passed";
			//if(result.isSuccess()){				 
					extentAndExcelReport_GenericMethod();
				/*Below is extent2 version//TBR
					String image = extentTestLogger.addScreenCapture(screenshot_Path);//TBR
					extentTestLogger.log(LogStatus.PASS, Comment, image);//TBR
				*/
			//}
	
	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Listeners: OnTestFailure ");
		try {
			gm_WriteToLog("Listeners: OnTestFailure ", "I");
		} catch (IOException e) {			 
			e.printStackTrace();
		}		
		//System.out.println("OTFresult.getStatus() = "+result.getStatus());//TBR
		//System.out.println("OTSresult.isSuccess() = "+result.isSuccess());//TBR
		resultStatus = "Failed";
		//if(!result.isSuccess()){	    	 
			//	gm_WriteToLog("Execution of  Test ********************["+testMethodname+"]******************** is complete", "I");
			//	gm_WriteToLog("ResultStatus of Test --> ["+testMethodname+"] = "+resultStatus, "I");
			//	System.out.println("Execution of  Test ********************["+testMethodname+"]******************** is complete");
	    	//	System.out.println("ResultStatus of Test --> ["+testMethodname+"] = "+resultStatus);
		    //	gm_WriteToLog("Execution of  Test ********************["+testMethodname+"]******************** is complete", "I");
		    //	System.out.println("Execution of  Test ********************["+testMethodname+"]******************** is complete");
	    		extentAndExcelReport_GenericMethod();
	    		extentTestLogger.fail(result.getThrowable());
		    	
				
	
			/*Below is extent2 version//TBR
				String image = extentTestLogger.addScreenCapture(screenshot_Path);//TBR
				logger.log(LogStatus.FAIL, Comment, image);//TBR
			 */
			System.out.println();
		
	//	}
		//https://stackoverflow.com/questions/9618774/jenkins-selenium-gui-tests-are-not-visible-on-windows
	}
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" onTestSkipped");
		System.out.println("result.getStatus() = "+result.getStatus());
		if(result.getStatus() ==ITestResult.SKIP){
			Assert.assertTrue(false);

		}
			//System.out.println("TestBasee.classPackNameSKIPPED: "+TestBasee.classPackName);
			//System.out.println("In onTestSkipped Listeners");
			//System.out.println("result.getClass(): "+result.getClass());
	    	//resultStatus = "SKIPPED"; 
	    	//System.out.println(elementName+"--"+resultStatus);
		//	extentTestLogger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " TestCase Skippedd", ExtentColor.YELLOW));
			//extentTestLogger.skip(result.getThrowable());
	    	
	    	
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+" onTestFailedButWithinSuccessPercentage");		
	}

	
	public void onStart(ITestContext context) {
	//	System.out.println(context.getName()+" onStart");	TBR
	}

	
	public void onFinish(ITestContext context) {
		//System.out.println(context.getName()+" onFinish");	TBR
		
		
	}
	
	public void extentAndExcelReport_GenericMethod(){
		//CoderComment1: Generate excel report
    	try {
    		gm_WriteToLog("Execution of  Test ********************["+testMethodname+"]******************** is complete", "I");
    		gm_WriteToLog("*******Out of **********["+testMethodname+"]**********  Method*******", "I");			
			gm_WriteToLog("ResultStatus of Test --> ["+testMethodname+"] = "+resultStatus, "I");
			System.out.println("Execution of  Test ********************["+testMethodname+"]******************** is complete");
			System.out.println("Out  of **********["+testMethodname+"]********** Method");			
			System.out.println("ResultStatus of Test --> ["+testMethodname+"] = "+resultStatus);
			
			//Excel Reporting
			gm_generateExcelReportWithScreenshots(actualResult, expectedResult.toString(), elementName, resultStatus, testMethodname);		
			//System.out.println(testMethodname+"--"+resultStatus);	//Better to write ==> System.out.println(testModulename+"--"+resultStatus);TBR
			
			//Extent Reporting
			if(resultStatus.equalsIgnoreCase("Passed")){
				//System.out.println("In if of extentAndExcelReport_GenericMethod");//TBR
				//gm_WriteToLog("In if of extentAndExcelReport_GenericMethod", "I");//TBR
				extentTestLogger.log(Status.PASS, MarkupHelper.createLabel(testMethodname+ " TestCase Passed", ExtentColor.GREEN));			
			}else if(resultStatus.equalsIgnoreCase("Failed")){
				//System.out.println("In else if of extentAndExcelReport_GenericMethod");//TBR
				//gm_WriteToLog("In else if of extentAndExcelReport_GenericMethod", "I");//TBR
				extentTestLogger.log(Status.FAIL, MarkupHelper.createLabel(testMethodname+ " TestCase failed due to below issue", ExtentColor.RED));
			}else{
				//System.out.println("In else of extentAndExcelReport_GenericMethod");//TBR
				//gm_WriteToLog("In else of extentAndExcelReport_GenericMethod", "I");//TBR
				System.out.println("Test skipped");
			}
    	//CoderComment2: Generate extent report
			screenshot_Path = gm_setScreenshotPath_forExtentReporting(elementName, resultStatus);
			gm_TakeSnapshot(testMethodname, screenshot_Path);
			//System.out.println("screenshot_Path: "+screenshot_Path);	TBR
			extentTestLogger.info("details: "+ extentTestLogger.addScreenCaptureFromPath(screenshot_Path));
		//	extentTestLogger.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(screenshot_Path).build());
			gm_WriteToLog("\nEXTENT REPORTING :: EXTENT Reporting of Test --> [" + testMethodname + "] Done. \n\t ==> 1. ScreenShotPath :: Screenshot of Test Result  is captured and saved at following location --> "+screenshot_Path+"\n\t ==> 2. EXTNTREPORT Path :: EXTNTREPORT Stored at following location -->  = "+ConstantsHelper_v1.ExtentReportPath, "I");
			gm_WriteToLog("\nTEST SUMMARY BELOW: \n\t==>> TestName = ["+testMethodname+"]\n\t==>> ExpectedResult = "+expectedResult+"\n\t==>> ActualResult = "+actualResult+"\n\t==>> ResultStatus = "+resultStatus, "I");
			System.out.println("\nEXTENT REPORTING :: EXTENT Reporting of Test --> [" + testMethodname + "] Done. \n ==> 1. ScreenShotPath :: Screenshot of Test Result  is captured and saved at following location --> "+screenshot_Path+"\n ==> 2. EXTNTREPORT Path :: EXTNTREPORT Stored at following location -->  = "+ConstantsHelper_v1.ExtentReportPath);
			System.out.println("\nTEST SUMMARY BELOW: \n\t==>> TestName = ["+testMethodname+"]\n\t==>> ExpectedResult = "+expectedResult+"\n\t==>> ActualResult = "+actualResult+"\n\t==>> ResultStatus = "+resultStatus);

		} catch (InvalidFormatException | IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
