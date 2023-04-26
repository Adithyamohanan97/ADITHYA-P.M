package test;





import pages.Homepage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Buscharterpage;

public class Homepagetest {
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
		
			Homepage ho=new Homepage(driver);
		Thread.sleep(8000);
	
	ho.setup("Ahmedabad","Bangalore");
	Thread.sleep(8000);
	ho.set("20-04-2023");
	
	

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//@Test(priority=1)
//
//public void test2()
//{
//	Buscharterpage bc= new Buscharterpage(driver);
//	bc.setfor();
//bc.setvalues("Adithya");
//}
//@Test (priority=2)
//public void test3() throws Exception
//{
//	Buscharterpage bc= new Buscharterpage(driver);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//bc.set("abc@gmail.com","9388146112");
//Thread.sleep(8000);
//bc.set2("GroupTour");
//Thread.sleep(8000);
//bc.data("Ahamedabad ","Bangalore","05-04-2023","07-04-2023");
//Thread.sleep(8000);
//bc.drop("03","20","PM");
//Thread.sleep(8000);
//bc.setup3("Thrissur");
//Thread.sleep(8000);
//bc.set4( "OTHER");
//
//Thread.sleep(8000);
//bc.set5("3","good"," VIAHY");		
//	
}	
}	



