package seleniumFrst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsStudy {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
Actions act= new Actions(driver);
WebElement elec= driver.findElement(By.id("CardInstancerw5Q_yAaKl1MjcHvTFu7JQ"));
act.scrollToElement(elec).perform();

driver.findElement(By.xpath("(//span[text()='Washing machines'])[2]")).click();



WebElement wm = driver.findElement(By.xpath("(//img[@class='s-image'])[3]"));
	act.moveToElement(wm).click().build().perform();
	
	Set<String> h1 =driver.getWindowHandles();
	Iterator<String> it1 = h1.iterator();
	String mainHandle = it1.next();
	String firstH = it1.next();
	System.out.println(firstH);
	
	//driver.switchTo(firstH);//new tab
	
	WebElement sb= driver.findElement(By.id("twotabsearchtextbox"));
	act.moveToElement(sb).click().build().perform();
	act.keyDown(Keys.SHIFT).sendKeys("c").keyUp(Keys.SHIFT).sendKeys("lothes").sendKeys(Keys.ENTER).build().perform();
	WebElement cl= driver.findElement(By.xpath("//span[text()='25,489']"));
	act.moveToElement(cl).sendKeys(Keys.RETURN);
	//driver.switchTo()//new tab
	
	
	
	}

}
