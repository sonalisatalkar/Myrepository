package seleniumFrst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitStydy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3250']"))).perform();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb =wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@_sp='p2481888.m1379.l3259']")));
		wb.click();
		
		
	}

}
