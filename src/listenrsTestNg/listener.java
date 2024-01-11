package listenrsTestNg;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class listener  implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String TC= result.getName();
Reporter.log("test run of"+TC+" successful", true);	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String TC= result.getName();
Reporter.log("testing has begun  " +TC, true);	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		String TC= result.getName();// TODO Auto-generated method stub
Reporter.log("assertion provoded as fail  " +TC, true);	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String TC= result.getName();Reporter.log("method is skipped  "+TC, true);
	}
	
	}

