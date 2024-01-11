package seleniumFrst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JavascriptClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/how-can-we-use-javascript-executor-to-click-and-enter-data-to-a-web-element-in-selenium");
		WebElement i= driver.findElement(By.xpath("//img[@alt='Physics']"));
		Actions act= new Actions(driver);
		act.scrollToElement(i).perform();
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("i.click()");

}}
