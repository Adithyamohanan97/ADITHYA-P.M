package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbcreatepage;
import pages.Fbloginpage;


public class Fblogintest{
	WebDriver driver;
@BeforeTest
public void setup()
{
driver=new EdgeDriver();
driver.get("https://www.facebook.com");
}
@Test
public void test1()
{
Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("abc@gmail.com","etyt543");
ob.login();
driver.navigate().back();
}
@Test
public void test2()
{
Fbcreatepage ob1=new Fbcreatepage(driver);
ob1.createpageclick();
ob1.getstartedclick();

	
}
}