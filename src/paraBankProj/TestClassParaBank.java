package paraBankProj;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassParaBank {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm");

FirstPage p= new FirstPage(driver);
p.Registration();
p.EnterDetails();
p.RegistrationDone();
p.ScreenShot(driver);


	}

}
