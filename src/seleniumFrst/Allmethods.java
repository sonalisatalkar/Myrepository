package seleniumFrst;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

public class Allmethods {
//excel data
	//screen shot
	//scrollInto View
	//implicit Wait
	

public static String ExcelData(int row, int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream myFile = new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\testData.xlsx");
	org.apache.poi.ss.usermodel.Sheet s= WorkbookFactory.create(myFile).getSheet("Sheet1");
	//Row r = s.getRow(row);
	//Cell c = r.getCell(cell);
	String value = s.getRow(row).getCell(cell).getStringCellValue();
	return value;
}

public static void Screenshot(WebDriver driver, String picName) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\sonal\\OneDrive\\Pictures\\WebScreenS\\" +picName+ ".png");
FileHandler.copy(src, dest);
}

public static void ScrollIntoView(WebDriver driver,WebElement element)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
	
}
public static void ImplicitWait(WebDriver driver, int duration)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
}

	}


