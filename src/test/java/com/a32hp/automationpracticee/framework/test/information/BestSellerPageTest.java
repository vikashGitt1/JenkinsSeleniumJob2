package com.a32hp.automationpracticee.framework.test.information;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.a32hp.automationpracticee.framework.pageobject.homepage.Homepage;
import com.a32hp.automationpracticee.framework.pageobject.information.BestSellersPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class BestSellerPageTest extends TestBasee{

	BestSellersPage bestSellerPageObj;
	String Browser;
	//String actualResult; TBR
	//String expectedResult; TBR
	//String elementName; TBR
	//String screenshot_Path; TBR
	//String image; TBR
	//String Comment; TBR
	
 
	
	
	@BeforeMethod
	@Parameters({ "Browser", "URL" })
    public void setup(String Browser, String URL) throws IOException{
		this.Browser = Browser;
    	bestSellerPageObj = homeObj.navigateToBestSellersPage();
    	gm_WriteToLog("*****************BestSeller Page***************** is in display", "I");
    	System.out.println("*****************BestSeller Page***************** is in display");
    	
 	
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
  	public  void validateBestSellersPageHeading_txt() throws Exception{
  		//System.out.println("In validateBestSellersPageHeading_txt Method"); TBR

  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "BestSellers_PageHeading_txt";
		Comment = "Validate BestSellers PageHeading";
		String actualResultComment = "Actual BestSellers Page Heading  Text  [Actual Result] =  ";
		actualResult = gm_getActualText(bestSellerPageObj.PageTitle_BestSellersPage_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
	//	System.out.println("actual_pageHeading = "+actual_pageHeading);  TBR
		String expectedResult = "BEST SELLERS";
		gm_WriteToLog("Expected BestSellers Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected BestSellers Page Heading Text [Expected Result] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	//	resultStatus = gm_assertionAndResultReporting(actual_pageHeading, expected_pageHeading, elementName, logger); TBR
	//	System.out.println("Out  of validateBestSellersPageHeading_txt method"); TBR
   
  	}		 
   
  	@Test (priority = 1)
  	public  void validateBestSellersBreadcrumb_txt() throws Exception{
  		//System.out.println("In validateBestSellersBreadcrumb_txt Method"); TBR

  		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		elementName = "BestSellers_Breadcrumb_txt";
		Comment = "validate BestSellersPage Breadcrumb Text";
		String actualResultComment = "Actual BestSellers Page Heading  Text  [Actual Result] =  ";
		actualResult = gm_getActualText(bestSellerPageObj.Breadcrumb_BestSellersPage_txt, elementName, extentTestLogger, Comment, currentMethodName, actualResultComment);
		String expectedResult = "Best sellers";
		gm_WriteToLog("Expected BestSellers Page Heading Text  [Expected Result] = "+expectedResult, "I");
		System.out.println("Expected BestSellers Page Heading Text [Expected Result] = "+expectedResult);
	   	Assert.assertEquals(actualResult, expectedResult);
	   	
	//	resultStatus = gm_assertionAndResultReporting(actual_breadcrumb, expected_breadcrumb, elementName, logger); TBR
	//	System.out.println("Out  of validateBestSellersBreadcrumb_txt method"); TBR
   
  	}	
   
  //"********Validation of productBlockImageLinks********");
  	@Test (priority = 2)
   	public  void validateproductBlockImageLinks_PD() throws Exception{
   		System.out.println("In validateproductBlockImageLinks_PD Method");
   		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
   		
 		List <WebElement> productBlockImageLinkCollection = bestSellerPageObj.productBlocksImageLinkCollection_imglnk;
 		   	System.out.println("Total productBlockImageLink = "+productBlockImageLinkCollection.size());
 		   	ArrayList<String> actualURLList = new ArrayList<String>();
 		   	ArrayList<String> expectedURLList = new ArrayList<String>();
 		   	for(int i=0; i<productBlockImageLinkCollection.size(); i++){
 		   		System.out.println("1");
 		   		productBlockImageLinkCollection =  bestSellerPageObj.productBlocksImageLinkCollection_imglnk;
 		   		WebElement productBlockImageLinkEle = productBlockImageLinkCollection.get(i);
 		     	System.out.println("2");
 		   		String elementName = productBlockImageLinkEle.getText();
 		   		Comment = "ProductImageLinks validation --> BestSellersPage";
 		//   		String actualURL = gm_getActualURL(productBlockImageLinkEle, elementName, logger, Comment);
 		//   		System.out.println(actualURL);
 		//   		actualURLList.add(actualURL);
 		   		driverObj.navigate().back();
 	   	}
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=7&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=1&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=2&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=5&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=3&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=6&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=4&controller=product");
 			
		   	elementName = "BestSellers-productBlockImageLinks_link";
 	//	   	resultStatus = gm_assertionAndResultReporting(actualURLList.toString(), expectedURLList.toString(), elementName, logger);
 		   	System.out.println("Out of validateproductBlockImageLinks_PD Method");
 	}
  //"********Validation of productBlockNameLinks********");
  	@Test (priority = 4)
   	public  void validateproductBlockNameLinks_PD() throws Exception{
   		System.out.println("In validateproductBlockNameLinks_PD Method");
   		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
   		
 		List <WebElement> productBlockNameLinkCollection = bestSellerPageObj.productBlock_NameLinkCollection_lnk;
 		   	System.out.println("Total ProductBlockNameLinks = "+productBlockNameLinkCollection.size());
 		   	ArrayList<String> actualURLList = new ArrayList<String>();
 		   	ArrayList<String> expectedURLList = new ArrayList<String>();
 		   	for(int i=0; i<productBlockNameLinkCollection.size(); i++){
 		   		System.out.println("1");
 		   		productBlockNameLinkCollection =  bestSellerPageObj.productBlock_NameLinkCollection_lnk;
 		   		WebElement productBlockNameLinkEle = productBlockNameLinkCollection.get(i);
 		     	System.out.println("2");
 		   		String elementName = productBlockNameLinkEle.getText();
 		   		Comment = "ProductNameLinks validation BestSellersPage";
 		//   		String actualURL = gm_getActualURL(productBlockNameLinkEle, elementName, logger, Comment);
 		//   		System.out.println(actualURL);
 		//   		actualURLList.add(actualURL);
 		   		driverObj.navigate().back();
 	   	}
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=7&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=1&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=2&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=5&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=3&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=6&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=4&controller=product");
 			
		   	
 		   	elementName = "BestSellersPage-productBlockNameLinks_link";
 	//	   	resultStatus = gm_assertionAndResultReporting(actualURLList.toString(), expectedURLList.toString(), elementName, logger);
 		   	System.out.println("Out of validateproductBlockNameLinks_PD Method");
 	}
  	
	//"********Validation of productBlockMoreButton*******");//
	@Test (priority = 5)
	public  void validateproductBlock_MoreButton_PD() throws Exception{
		System.out.println("In validateproductBlock_MoreButton_PD Method");
		String currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		
		List <WebElement> productBlockMoreButtonCollection = bestSellerPageObj.ProductBlock_MoreButtonCollection_btn;
		   	System.out.println("Total ProductBlockNameLinks = "+ productBlockMoreButtonCollection.size());
		   	ArrayList<String> actualURLList = new ArrayList<String>();
		   	ArrayList<String> expectedURLList = new ArrayList<String>();
		   	for(int i=0; i<productBlockMoreButtonCollection.size(); i++){
		   		System.out.println("1");
		   		productBlockMoreButtonCollection =  homeObj.ProductBlockMoreButtonCollection_btn;
		   		WebElement productBlockMoreButtonEle = productBlockMoreButtonCollection.get(i);
		     	System.out.println("2");
		   		String elementName = productBlockMoreButtonEle.getText();
		   		Comment = "ProductNameLinks validation BestSellers";
		//   		String actualURL = gm_getActualURL(productBlockMoreButtonEle, elementName, logger, Comment);
		//   		System.out.println(actualURL);
	//	   		actualURLList.add(actualURL);
		   		driverObj.navigate().back();
	   	}
		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=7&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=1&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=2&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=5&controller=product");
 		   	expectedURLList.add("http://automationpractice.com/index.php?id_product=3&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=6&controller=product");
 			expectedURLList.add("http://automationpractice.com/index.php?id_product=4&controller=product");
 			elementName = "BestSellers-productBlockMoreButton_Btn";
	//	   	resultStatus = gm_assertionAndResultReporting(actualURLList.toString(), expectedURLList.toString(), elementName, logger);
		   	System.out.println("Out of validateproductBlock_MoreButton_PD Method");
	}
	
}
