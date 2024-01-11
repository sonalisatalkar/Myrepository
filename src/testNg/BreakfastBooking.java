package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakfastBooking {
  WebDriver driver =new ChromeDriver();
	
	String baseUrl= "https://www.amazon.in/";
	
@BeforeMethod
  public void openSite() {
		
		driver.get(baseUrl);
		
  }
	@Test
	public void searching()
	{
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("Christmas gifts");
search.sendKeys(Keys.ENTER);
	
	}
	
	@Test(enabled = false)
	public void selection()
	{
		driver.findElement(By.xpath("((//div[@data-cy='title-recipe'])[28]"));
	}
	
	
	
	
	@Test
	public void filters()

	{
		driver.findElement(By.id("brandsRefinements"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(enabled = false)
	public void switchTo()
	{
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		driver.switchTo().window(handle);
		
	}
	}
	

