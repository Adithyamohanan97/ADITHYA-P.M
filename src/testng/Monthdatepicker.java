package testng;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Monthdatepicker {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.expedia.com");
driver.manage().window().maximize();
	}
	@Test
	public void month()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	
		while(true)
		{
			WebElement	monthelement=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			 String month1= monthelement.getText();
		if(month1.equals("may 2023"))	
	{
		System.out.println(month1);	   
			break;
			
		}
			
		else
		{
			driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']/button[2]"));
		}		
	}
	
		List<WebElement> d =driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
for (WebElement da:d)
{	
	 String dat=da.getAttribute("data-day" );
	 
System.out.println(dat);
if(dat.equals( "10"))
{
da.click();

System.out.println("date selected");	
}
}	
}
}


//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class Monthdatepicker {
//		WebDriver driver;	
//		String baseurl="https://www.expedia.com/?pwaLob=wizard-flight-pwa";
//		
//		@BeforeTest
//		public void setUp()
//		{
//			
//			driver=new EdgeDriver();
//		
//		}
//		@BeforeMethod
//		public void url() 
//		{
//			driver.get(baseurl);
//			driver.manage().window().maximize();
//
//	
//		}
//		
//		@Test
//		public void testlogin()
//		{
//			driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
//			
//		
//			
//			 while(true)
//			 {
//			WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-menu-months-container']/div/h2"));
//				
//				  String month1=month.getText();
//					if(month1.equals("May 2023"))
//					{
//						System.out.println(month1);
//						break;
//					}
//					else
//					{
//						driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
//					}
//			
//			 }
//			
//		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@class='uitk-calendar']/div[2]/div[1]/table/tbody/tr/td/button"));
//		
//		for(WebElement dateelement:alldates1)
//		{
//			String date=dateelement.getAttribute("data-day");
//			System.out.println(date);
//			if(date.equals("18"))
//			{
//				//System.out.println(date);
//				dateelement.click();
//				System.out.println("date selected");
//			}
//			
//		}
//			}
//	//	
////			
////			
//			
//			
//		}
//
//
//
