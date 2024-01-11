package seleniumFrst;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  LocalDate date = LocalDate.now();
	     System.out.println("Current Date: "+date);*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Allmethods.ImplicitWait(driver, 1000);
		
	int rows =	driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println("no of rows are "+rows);
		
		int column = driver.findElements(By.xpath("//table[@id='countries']//tr//h3")).size();
		System.out.println("no  of columns are "+column);
		
	
	
	}}
	


