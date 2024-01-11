package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CarTata {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.tataaig.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Click Here']")).click();
		
		
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[1]")).sendKeys("Audi");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[2]")).sendKeys("A3");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='select-field__input-container css-yw3jad'])[3]")).sendKeys("2.0 Tdi(1968cc)");
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
			
	}
}