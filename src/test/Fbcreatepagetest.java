package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Fbcreatepage;
public class Fbcreatepagetest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1()
	{
		Fbcreatepage ob1=new Fbcreatepage(driver);
	ob1.createpageclick();
	ob1.getstartedclick();
	
		
		
	}
	

}
