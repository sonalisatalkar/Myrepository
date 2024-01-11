package paraBankProj;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

	@FindBy(xpath="//a[text()='Register']") private WebElement registerText;
	@FindBy(id="customer.firstName")private WebElement FirstName;
	@FindBy(id="customer.lastName")private WebElement LastName;
	@FindBy(id="customer.address.street")private WebElement Address;
	@FindBy(id="customer.address.city")private WebElement City;
	@FindBy(id="customer.address.state")private WebElement State;
	@FindBy(id="customer.address.zipCode")private WebElement ZipCode;
	@FindBy(id="customer.phoneNumber")private WebElement PhoneNumber;
	@FindBy(id="customer.ssn")private WebElement ssn;
	@FindBy(id="customer.username")private WebElement UserNameForReg;
	@FindBy(id="customer.password")private WebElement PasswordForReg;
	@FindBy(id="repeatedPassword")private WebElement confirmPassword;
	@FindBy(xpath="//input[@value='Register']")private WebElement RegisterButton;
	
	
	public FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void Registration() 
	{
		registerText.click();
	}
	public void EnterDetails() throws InterruptedException
	{Thread.sleep(2000);
	Random ri = new Random();
	String r=ri.toString();
	System.out.println(r);
		FirstName.sendKeys("jason");
		LastName.sendKeys("smith");
		Address.sendKeys("51st street");
		City.sendKeys("dallas");
		State.sendKeys("Texas");
		ZipCode.sendKeys("75009");
		PhoneNumber.sendKeys("+1 214-559-6997");
		ssn.sendKeys("449-45-2651");
		UserNameForReg.sendKeys("user New6");
		PasswordForReg.sendKeys("parabankUser");
		confirmPassword.sendKeys("parabankUser");
	}
	
	public void RegistrationDone()
	
	{
		RegisterButton.click();
	}
	
	public void ScreenShot(WebDriver driver) throws IOException, InterruptedException
	{
	Thread.sleep(1000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebScreenS\\"+"parabank"+".png");
		FileHandler.copy(src, dest);
		Thread.sleep(3000);
		System.out.println("screenshot taken");
	}
	
	
	
	
}
