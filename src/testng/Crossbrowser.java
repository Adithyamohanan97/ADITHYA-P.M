package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String b)
	{
		if (b.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
}
	else if (b.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();	
		
	}
	else	
	{
		
		driver=new FirefoxDriver();
	}
	
	}
	@Test
	public void test()
	{
		driver.get("http://www.facebook.com");
	
	

	}
	
	

}
