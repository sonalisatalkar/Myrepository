package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DataForInsurance {
  @Test(dataProvider = "carInsRegression",dataProviderClass =DataSetCarIns.class)
  public void f(String BRAND , String CAR ) throws InterruptedException 
  {
	  ChromeOptions op = new ChromeOptions();
	  ChromeOptions disnf = op.addArguments("-disable-notifications");
		
	  WebDriver driver = new ChromeDriver(disnf);
	  driver.manage().window().maximize();
	  driver.get("https://www.tataaig.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//span[text()='Click Here']")).click();
	  
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  
	     WebElement brand = driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[1]"));
		 act.click(brand).sendKeys(BRAND).sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(1000);
		 
		 WebElement car = driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[2]"));
		 act.click(car).sendKeys(CAR).sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(1000);
		 
		 WebElement variant = driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[3]"));
		 act.click(variant).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(500);
		 
  }
}