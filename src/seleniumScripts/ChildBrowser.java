package seleniumScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(1000);
String h1= driver.getWindowHandle();
System.out.println("h1 from window handle method is "+h1);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
Thread.sleep(1000);
Set <String> h2=driver.getWindowHandles();

Iterator<String> it = h2.iterator(); // first iterator, set 1
String mainHandle = it.next();
String childHandle =it.next();

System.out.println("h1 from window handle method is "+h1);
System.out.println("main handle from set is "+mainHandle);
System.out.println("child browser handle is "+childHandle);

driver.switchTo().window(childHandle);
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.id("the7-search")).sendKeys("hello");
Thread.sleep(1000);
driver.switchTo().window(mainHandle);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='NewTab']")).click();

Set<String> set2=driver.getWindowHandles(); // set 2, iterator 2
Iterator<String> it2 = set2.iterator();
String h3=it2.next();
String h4= it2.next();
String h5 = it2.next();

System.out.println("new opened window handles are  " +h3+ " "+h4+ " " +h5);
driver.switchTo().window(h5);
Thread.sleep(1000);
driver.findElement(By.id("subscribe-field-1")).sendKeys("asdf@345");
driver.switchTo().window(mainHandle);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
Thread.sleep(1000);
	
	
	
	}

}
