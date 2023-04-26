package test;







import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dropdown;

public class Droptest {
	WebDriver driver;
	@BeforeTest
	public void set() throws Exception
	{
		driver=new FirefoxDriver();
		
		driver.get(" https://www.vrlbus.in/#/");
		Thread.sleep(8000);
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	}
	@Test

	public void test1() throws Exception
	
	{
		Thread.sleep(8000);
		Dropdown ho=new Dropdown(driver);
		ho.setup( "TourCategory");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		@Test

		public void test2() throws Exception
		
		{
			Thread.sleep(8000);
			Dropdown ho=new Dropdown(driver);
		ho.setup1("05","20","PM","OTHER");
		
		
		
		
	
		
	
}
}
