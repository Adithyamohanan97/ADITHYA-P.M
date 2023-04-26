package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Buscharterpage;
import pages.Homepage;

public class Buschartertest {
WebDriver driver;
	
	
	
	@BeforeTest
	public void set() //throws InterruptedException 
	{
		driver=new FirefoxDriver();
		
		driver.get(" https://www.vrlbus.in/#/");
		
	driver.manage().window().maximize();
	
	}
	Homepage ho=new Homepage(driver);
	@Test

	public void test1() throws Exception
	
	{
		
		Buscharterpage bc= new Buscharterpage(driver);
		Thread.sleep(8000);
		bc.drop("05","20","PM");
		Thread.sleep(8000);
		bc.setup3("Thrissur");
		Thread.sleep(8000);
		bc.set4( "OTHER");
		bc.set5("3","good"," VIAHY");		
	}		
		
}
