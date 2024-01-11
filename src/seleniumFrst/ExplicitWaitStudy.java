package seleniumFrst;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
			
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement wb =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("q")));
		
		wb.sendKeys("selenium testing");

	}}