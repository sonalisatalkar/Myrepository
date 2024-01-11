package testNg;

import org.testng.annotations.DataProvider;

public class DataSetCarIns {
	
	
	@DataProvider(name= "carInsRegression")
	public static String[][] carInsData()
	{
		String data[][]= {{ "Audi","A3"},{"BENTLEY","BROOKLANDS"},
				{"MCLAREN","720S"}};
		return data;
		
	}
}
