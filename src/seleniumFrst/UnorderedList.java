package seleniumFrst;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("samsung Flip");
		Thread.sleep(1000);
		String expR ="samsung flip 5 price";
		List<WebElement> autoSg= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		for(WebElement sgPrint:autoSg)
		{
			System.out.println(sgPrint.getText());
			
		}
		Thread.sleep(1000);
		for(WebElement sgCheck:autoSg)
		{
			String actResult = sgCheck.getText();
			if(actResult.equalsIgnoreCase(expR))
			{
				sgCheck.click();
				break;
			}
		}
		Thread.sleep(1000);
		
	}}