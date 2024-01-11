package seleniumFrst;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotPractise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.hermeus.com/quarterhorse");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebScreenS\\hermeus.png");
		Files.copy(srcfile, destfile);
		driver.close();
}
}