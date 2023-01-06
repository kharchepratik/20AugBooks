package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import testclasses.BaseClass;
import utility.Screenshot;

public class TestNGListeners extends BaseClass implements ITestListener{
	
	ExtentReports extent = ExtentReportGen.extentReportGenerator();
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started:"+result.getMethod().getMethodName());

		 test = extent.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed: "+result.getMethod().getMethodName());
		test.log(Status.PASS, "Test case passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed: "+result.getMethod().getMethodName());

		test.fail(result.getThrowable());

		try
		{
			 String  path = Screenshot.takescreenshot(driver, result.getName());


			test.addScreenCaptureFromPath(path);

		}
		catch(IOException exception)
		{
			System.out.println("Exception arrived while capturing screenshot");
		}



	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: "+result.getMethod().getMethodName());

		test.log(Status.SKIP, "Test case skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag "+context.getName()+ " has started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag "+context.getName()+ " has finished");

		extent.flush();
	}


}
	
	

