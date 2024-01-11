package seleniumFrst;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement e = driver.findElement(By.xpath("//h2[@class='title']"));
		
		String t= e.getAttribute("class");
		String r = e.getText();
		driver.manage().window().minimize();
		System.out.println("text is "+r);
		System.out.println("attritbute is "+t);
		driver.close();
	}

}