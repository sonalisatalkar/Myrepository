package testNg;

import org.testng.annotations.DataProvider;

public class FbLoginDataSet {
  
	@DataProvider(name="FbRegression")
	public static String[][] Fbdata()
	{
		String[][]data= {{"jason", "Smith","1234567891"},{"julie", "smith","9876543212"},{"brad","pitt","4567812345"}};
		return data;
		
	}
	
}
