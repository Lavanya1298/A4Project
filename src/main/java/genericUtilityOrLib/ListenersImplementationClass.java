package genericUtilityOrLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener {
//right click qualified name
	@Override
	public void onTestStart(ITestResult result)
	{
	String methodname = result.getMethod().getMethodName();
	Reporter.log("from this" + "execution susccessfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodname= result.getMethod().getMethodName();
		Reporter.log(methodname + "execution susccessfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)Baseclass.driver;//we have decalred static in baseclass webdriver in baseclass to accessit withhelp ofclass name
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+methodname+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
		}
		//here surrounding throws will come,normally throws expectation wont come because 
		//if we give throws expectation method declaration part will get change so we cant do methods overriding
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Execution skippers");
		
	}

	

	
	

}
