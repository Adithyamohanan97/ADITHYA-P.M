package junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Junitdemo {
EdgeDriver driver;
	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	
	}
	@Test
	public void test1()
	{
		
		driver.get("https://www.facebook.com");
		
	}
		@After
		public void teardown()
		{
			driver.quit();
			
		}
		
		
	}

