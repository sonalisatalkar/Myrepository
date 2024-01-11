package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLoginByDP {
	
	WebDriver driver = new ChromeDriver();
 //@BeforeMethod
//  public void openSite() {
	  
//	  driver.get("https://www.facebook.com/");
//	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//  }
  
  @Test 
  (dataProvider = "loginDta")
  
  public void Details(String firstName, String lastName, String mobNum) throws InterruptedException
  {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  Thread.sleep(5000);
	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  driver.findElement(By.name("lastname")).sendKeys(lastName);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
	  
	  
  }
  
  @DataProvider(name="loginDta")
  public static String[][] loginData() throws InterruptedException
  {
	  Thread.sleep(2000);
	  String[][] loginData= {{"asd","fgh","1234567890"},{"ert","rew","1234554321"}};
	  return loginData;
  }
}
