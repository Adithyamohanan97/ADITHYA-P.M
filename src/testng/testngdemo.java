package testng;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
//@beforesuite
//@beforetest
//@beforemethod
//@beforeclass
//@test
//@aftermethod
EdgeDriver driver;
@BeforeTest
public void setup()
{
	driver=new EdgeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.google.com");

}
@Test(priority= 2,invocationCount=3,dependsOnMethods="test2")

public void test1()
{
System.out.println("test1");
}
@Test(priority= 1,enabled=false)
public void test2()
{
	System.out.println("test2");
	
}
@AfterMethod
public void aftermethod()
{
	System.out.println("aftermethod");
}
	@AfterTest
	public void browserquit()
	{driver.quit();
	}
	}
	
	
	
	
