package excelPrgrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ablereading {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 int numOfRows = driver.findElements(By.xpath("//figure[@class='wp-block-table']//tbody/tr")).size();
		System.out.println(numOfRows);
		
	    int numOfColumns = driver.findElements(By.xpath("//figure[@class='wp-block-table']//tbody/tr[1]/th")).size();
        System.out.println(numOfColumns);
        
    /*    for(int i = 1 ; i<=numOfRows ;i++)
		{
			for(int j = 1 ; j<=numOfColumns ; j++)
			{
				if(i==1)
				{
					 String data1 = driver.findElement(By.xpath("//figure[@class='wp-block-table']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(data1+"  ");
					
					
				}
		
				else
				{
					 String data2 = driver.findElement(By.xpath("//figure[@class='wp-block-table']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data2+"  ");
					
				}
				
			}
			System.out.println();
		}*/
	String d= driver.findElement(By.xpath("//table//tr[5]//td[1]")).getText();
	System.out.println(d+ "is the book name");
        
for (int i=2;i<=numOfRows;i++)
{
	for(int j=2;j<=numOfColumns; j++)
	{
		String data3 = driver.findElement(By.xpath("//figure[@class='wp-block-table']//tr["+i+"]/td["+j+"]")).getText();
if(data3.equals(d))
{
	String Author = driver.findElement(By.xpath("//table//tr[5]//td[2]")).getText();
	String Subject= driver.findElement(By.xpath("//table//tr[5]//td[3]")).getText();
	String price= driver.findElement(By.xpath("//table//tr[5]//td[4]")).getText();
	
	System.out.println("the author is "+Author+"the subject is "+Subject+ "the prcie is "+price );
}else
	{System.out.println("the data doesnt contain the given book name");
}
	

	}
}
}
}
