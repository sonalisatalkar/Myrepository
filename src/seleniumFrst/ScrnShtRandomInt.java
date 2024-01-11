package seleniumFrst;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrnShtRandomInt {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		/*Random ri = new Random();
		int intRand = ri.nextInt();
		System.out.println(intRand);*/
		
		long timeStamp = System.currentTimeMillis();
		System.out.println(timeStamp);
		 LocalDate date = LocalDate.now();
	    // System.out.println("Current Date: "+timeStamp,date);
		
		//DateTimeFormatter dtt= DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
		//System.out.println(dtt);
		
		
		File dest = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebScreenS\\"+timeStamp+" "+date+".png");
	FileHandler.copy(src, dest);
	
	}

}
