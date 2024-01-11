package seleniumFrst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownStudy {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dropdown");
	
	
	Select s = new Select(driver.findElement(By.xpath((("//select[@id='dropdown']")))));

	s.selectByVisibleText("Option 1");
	Thread.sleep(5000);
	driver.close();
	
}
}