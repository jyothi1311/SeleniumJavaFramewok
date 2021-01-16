package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("*** Test started      "+result);
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("*** Test Successful      "+result);
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("*** Test Failed      "+result);
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("*** Test Skipped      "+result);
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
    public void onStart(ITestContext context)
    {
    	
    }
    public void onFinish(ITestContext context)
    {
    	System.out.println("*** Test completed      "+context);
    }
}
