package seleniumFrst;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitStudy {

	public static void main(String[] args) throws IOException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3250']"))).perform();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement wb =	fluentWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@_sp='p2481888.m1379.l3259']"))));
		
			wb.click();	
			System.out.println("stage 1 complete");
			driver.close();
				
			//COMPARISON WITH SYNTAX OF EXPLICIT WAIT:
			
			/*Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3250']"))).perform();
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(7));
			WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@_sp='p2481888.m1379.l3259']"))));
					wb.click();
			
				/*TakesScreenshot ts= (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebSite");
				Files.copy(src, dest);
				driver.close();
		System.out.println("the element to be cliked is visible and so is clicked");*/
			
	}

}
