package excelPrgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumFrst.Allmethods;

public class WebTableStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		Allmethods.ImplicitWait(driver, 1000);
		driver.manage().window().maximize();
		
	int rows =	driver.findElements(By.xpath("//figure[@class='wp-block-table']//table//tr")).size();
		System.out.println("no of rows are "+rows);
		int column = driver.findElements(By.xpath("//figure[@class='wp-block-table']//table//tr//th")).size();
		System.out.println("no  of columns are "+column);
		
		WebElement e= driver.findElement(By.xpath("//figure[@class='wp-block-table']//table"));
		Allmethods.ScrollIntoView(driver, e);
		
		//printing whole table
		Thread.sleep(1000);
		for (int r=1;r<=rows;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String data= driver.findElement(By.xpath("/figure[@class='wp-block-table']//table//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(data+"");
			}
			System.out.println();
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*List<WebElement> data = driver.findElements(By.xpath("//figure[@class='wp-block-table']//table//tr//td"));
	for(WebElement l:data)
	{
		String value= l.getText();
	}
		if(value.equals("Master In Java"))
		{
			System.out.println("the book name is Master In Java");
		String author=	driver.findElement(By.xpath("//figure[@class='wp-block-table']//table//tr[6]//td[2]")).getText();
		String subject=driver.findElement(By.xpath("//figure[@class='wp-block-table']//table//tr[6]//td[3]")).getText();
	String price =driver.findElement(By.xpath("//figure[@class='wp-block-table']//table//tr[6]//td[4]")).getText();
	System.out.println("the author of this book is "+author+ "for subject "+subject+ "whose price is "+price);	
		
		}
		//else {System.out.println("the required book is not in the table");
	}
	}*/
}
