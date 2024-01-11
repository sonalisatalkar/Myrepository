package seleniumFrst;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FwPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub '
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com//");
		driver.manage().window().maximize();
		WebElement box= driver.findElement(By.id("APjFqb"));
		box.sendKeys("f22 fighter jet ");box.sendKeys(Keys.ENTER);
		System.out.println("search box clicked with text");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//Wait<WebDriver> fw= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		//WebElement e = driver.findElement(By.id("CardInstancewpgpAu07lcIlc7zvq2eolg"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-sncf='1'])[11]"))).click();
		

	
	}
}
