package seleniumFrst;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenSht {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kitchen.applitools.com/ingredients/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("column-button-name")).click();
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("screenshotTaken");
		File dest = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\Screenshots");
		FileHandler.copy(src, dest);
	}

}
