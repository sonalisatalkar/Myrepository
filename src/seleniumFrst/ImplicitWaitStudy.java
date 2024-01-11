package seleniumFrst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
WebDriver driver =  new ChromeDriver();
driver.get("https://www.ebay.com/");
driver.manage().window().maximize();

WebElement element =driver.findElement(By.xpath("//a[@_sp='p2481888.m1381.l3250'][1]"));
	Actions action = new Actions(driver);                                                                      //hover statement
	action.moveToElement(element).perform();                                                                   //hover statement
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));                                           //implicit wait command
	
	WebElement y= driver.findElement(By.xpath("//a[@_sp='p2481888.m1381.l3261']"));
	y.click();
	driver.navigate().back();
	driver.close();
	}

}
