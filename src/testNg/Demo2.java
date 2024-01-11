package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void z(){
		Reporter.log("test z running ", true);	
		}
		
		@Test(dependsOnMethods = "z" )
		public void y()
		{
			Reporter.log("test y running ", true);	

		}
		
		@Test
		public void v()
		{
			Assert.fail();
			Reporter.log("test v running", true);
		}
		
		
}
