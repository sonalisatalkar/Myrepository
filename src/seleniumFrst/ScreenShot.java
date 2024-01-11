package seleniumFrst;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("screen shot taken");
		
		File destFile = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebScreenS\\amazonnew.png");
		FileHandler.copy(srcFile, destFile);
		System.out.println("screen shot stored");
		driver.close();
	
	}

}
