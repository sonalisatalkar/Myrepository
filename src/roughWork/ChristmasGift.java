package roughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChristmasGift {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		String baseUrl= "https://www.amazon.in/";
			driver.get(baseUrl);
	
		
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Christmas gifts");
	search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[27]")).click();
			
	String handle = driver.getWindowHandle();
	System.out.println(handle);
		
		}
		



}
