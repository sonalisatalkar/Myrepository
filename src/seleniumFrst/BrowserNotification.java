package seleniumFrst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver(options);
driver.get("https://www.redbus.in/");
Thread.sleep(1000);




WebElement e =driver.findElement(By.xpath(("//input[@id='src']")));
e.click();

e.sendKeys("Mumbai");

WebElement f= driver.findElement(By.xpath("//input[@id='dest']"));
f.sendKeys("Ahmedabad");

WebElement t = driver.findElement(By.xpath("//span[@class='dateText']"));
t.click();


}}
//(//input[@tabindex="-1"])[1]
//(//input[@tabindex='-1'])[2]"
