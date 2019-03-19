package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_Syntax {

	public static void main(String[] args)
	{
		
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\Reports\\";
		//Create object for extent reports
		ExtentReports logger=new ExtentReports(filepath+"MyTest.html", true);
		
		//Create Test
		ExtentTest test1=logger.startTest("Tc001_verify_login_valid");
		
		test1.log(LogStatus.INFO, "Launch Browser successfull");
		test1.log(LogStatus.SKIP, "Test skipped because pre-condition failed");
		test1.log(LogStatus.PASS, "Expecte result dispalyed");
		test1.log(LogStatus.FATAL, "test suspended");
		
		logger.endTest(test1);
		
		
		//Create Test
		ExtentTest test2=logger.startTest("Tc002_verify_login_invalid");
		
		test2.log(LogStatus.INFO, "I informed");
		test2.log(LogStatus.PASS, "I passed");
				
	    logger.endTest(test2);
		
	    
	    //Create Test
	  	ExtentTest test3=logger.startTest("Tc003_verify_login_Blank");
	  				
	  	test3.log(LogStatus.INFO, "I informed");
		test3.log(LogStatus.FAIL, "I Failed");		
		
		
	  	logger.endTest(test3);
	  		
		test1.appendChild(test2).appendChild(test3);
		
		//Write File
		logger.flush();
	}

}
