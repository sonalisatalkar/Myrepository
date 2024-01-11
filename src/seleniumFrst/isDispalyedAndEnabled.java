package seleniumFrst;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDispalyedAndEnabled {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	WebElement e=driver.findElement(By.xpath("//input[@class='gsc-search-button']"));	
	
	boolean s= e.isEnabled();
	boolean r= e.isDisplayed();
	System.out.println("buttton enabled "+s);
	System.out.println("is displayed "+r);
	System.out.println("==================hidden button test");
	WebElement u = driver.findElement(By.id("but1"));////button[@id='but1']
	boolean v= u.isDisplayed();
	boolean b= u.isEnabled();
	System.out.println("display is "+v);
	System.out.println("enable is "+b);
	
	driver.close();
	}

}
