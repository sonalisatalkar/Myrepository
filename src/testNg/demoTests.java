package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listenrsTestNg.listener.class)
public class demoTests {
	
	@Test
	public void a(){
	Reporter.log("test a running ", true);	
	}
	
	@Test(dependsOnMethods = "a" )
	public void b()
	{
		Reporter.log("test b running ", true);	

	}
	
	@Test
	public void c()
	{
		Assert.fail();
		Reporter.log("test c running", true);
	}
	
	
	
}
