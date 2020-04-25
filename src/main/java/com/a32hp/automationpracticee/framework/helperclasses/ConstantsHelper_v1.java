package com.a32hp.automationpracticee.framework.helperclasses;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 *
 */
public class ConstantsHelper_v1{
	


	public final static String userName = "testdunkin5@gmail.com";
	public final static String password = "Qwertyui1";	
	public final static int explicitWait = 30;
	public final static int impliciteWait = 200;
	public final static int pageLoadTimeout = 400;
	public final static String BrowserName = "Chrome";
	public final static String URL = "http://automationpractice.com/index.php";
	public final static String directoryPath = System.getProperty("user.dir");
	public final static String pass_Fail_ExcelScreenshotPath = directoryPath+"\\TestReports\\ExcelReport\\Screenshots";
	public final static String actualResult_ExcelScreenshotPath = directoryPath+"\\TestReports\\ExcelReport\\Screenshots\\ActualResult\\ActualResult";
	public final static String pass_Fail_ExtentReportScreenshotPath = directoryPath+"\\TestReports\\ExtentReport3\\Screenshots";
	public final static String actualResult_ExtentReportScreenshotPath = directoryPath+"\\TestReports\\ExtentReport3\\Screenshots\\ActualResult\\ActualResult";
	//Note: If I put absolute path for extent report screenshots then the screenshot fails to appear in the extent report. It does appear in its respective folder but fails to appear attached in extent report
	//The format which is being mentioned here is: public final static String actualResult_ExtentReportScreenshotPath = "TestReports\\ExtentReport3\\Screenshots\\ActualResult\\ActualResult";
	//In attachment letf screenshot isof actual result and right screenshot is passed/Failed
	public final static String ExtentReportPath = directoryPath+"\\TestReports\\ExtentReport3\\ExtentReport3";   //This absolute path is fine for extent report
	public final static String ExcelReportPath = directoryPath+"\\TestReports\\ExcelReport";
	public final static String microsoftEdgeDriverPath = "MasterFiles_2812\\Drivers\\EdgeDriver\\MicrosoftWebDriver.exe";
	public final static String internetExplorerDriverPath = "MasterFiles_2812\\Drivers\\IEDriverServer\\64Bit\\3.14.0\\IEDriverServer.exe";
	public final static String geckoDriverPath = "MasterFiles_2812\\geckodriver\\geckodriverv0260win32\\geckodriver.exe";
	public final static String chromeDriverPath = "MasterFiles_2812\\Chromedriver_win32_v2.38\\chromedriver.exe";
	
	
	public static String getExtentReportPath() {
		return ExtentReportPath;
		
	}
	public static String getExcelReportPath() {
		return ExcelReportPath;
		
	}
	
	public static String getChromeDriverPath() {
		return chromeDriverPath;
		
	}
	public static String getgeckoDriverPath() {
		System.out.println("In getgeckoDriverPath()");
		System.out.println("geckoDriverPath\n"+geckoDriverPath);
		return geckoDriverPath;
		
	}
	public static String getInternetExplorerDriverPath() {
		return internetExplorerDriverPath;
		
	}
	public static String getMicrosoftEdgeDriverPath() {
		return microsoftEdgeDriverPath;
		
	}
	public static String getPass_Fail_ExcelScreenshotPath() {
		return pass_Fail_ExcelScreenshotPath;
		
	}
	public static String getActualResult_ExcelScreenshotPath() {
		return actualResult_ExcelScreenshotPath;
		
	}
	public static String getPass_Fail_ExtentReportScreenshotPath() {
		return pass_Fail_ExtentReportScreenshotPath;
		
	}
	public static String getActualResult_ExtentReportScreenshotPath() {
		return actualResult_ExtentReportScreenshotPath;
		
	}
	public static String getUsername() {
		return userName;
		
	}
	public static String getPassword() {
		return password;
	}
	public static int getpageLoadTimeout() {
		return impliciteWait;
	}
	public static int getExplicitwait() {
		return explicitWait;
	}	
	public static int getImplicitewait() {
		return pageLoadTimeout;
	}
	
	public static String getBrowser() {
		return BrowserName;
	}
	public static String getURL() {
		return URL;
	}
}