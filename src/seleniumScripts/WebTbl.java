package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumFrst.Allmethods;

public class WebTbl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Allmethods.ImplicitWait(driver, 1000);
		
	int rows =	driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println("no of rows are "+rows);
	}

}
