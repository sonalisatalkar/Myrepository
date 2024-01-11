package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGFirstClass {
	
	@BeforeTest
	public void test1()
	{
		System.out.println("this is test1");
	}
	@Test
	public void test2()
	{
		System.out.println("this is test2");
	}
	
	@Test(priority = 4)
	public void test3()
	{
		System.out.println("this is test3");
	}
	
	@Test(priority = 3)
	public void test4()
	{
		System.out.println("this is test4");
	}
	
	@Test(priority =7)
	public void test5()
	{
		System.out.println("this is test5");
	}
	
}