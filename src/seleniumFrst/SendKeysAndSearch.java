package seleniumFrst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndSearch {

	

	public static void main(String[] args ) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");



WebElement w = driver.findElement(By.id("twotabsearchtextbox"));


w.sendKeys("purse for women");

Thread.sleep(3000);

WebElement c = driver.findElement(By.id("nav-search-submit-button"));
c.click();

Thread.sleep(1000);
String h= driver.getCurrentUrl();
System.out.println(h);


	}
}
