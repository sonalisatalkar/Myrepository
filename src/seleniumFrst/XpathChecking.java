package seleniumFrst;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class XpathChecking {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sc-bxivhb hrsLPT'])[1]")).sendKeys("ahmedabad");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));  
	driver.findElement( By.xpath(("(//input[@class='sc-bxivhb hrsLPT'])[2]"))).sendKeys("delhi");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));  
	// //input[@class='sc-bxivhb hrsLPT'])[2]
	// //input[@class='sc-bxivhb hrsLPT']
	

	}

}
