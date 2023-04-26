package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Roughwork {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	}
	@Test

	public void test1()
	{
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input "));
			fullname.sendKeys("adithya");
	Actions act=new Actions(driver);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	WebElement rediffmail=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1] "));
	
	act.keyDown(rediffmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	
	}
	
	@Test

	public void test3()
	{
	
   
		package pkg;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		public class Datepicker {
				WebDriver driver;	
				String baseurl="https://www.expedia.com/?pwaLob=wizard-flight-pwa";
				
				@BeforeTest
				public void setUp()
				{
					
					driver=new EdgeDriver();
				
				}
				@BeforeMethod
				public void url()
				{
					driver.get(baseurl);
					driver.manage().window().maximize();
				
				}
				
				@Test
				public void testlogin()
				{
					driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
					
					 while(true)
					 {
					WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-menu-months-container']/div/h2"));
						
						  String month1=month.getText();
							if(month1.equals("May 2023"))
							{
								System.out.println(month1);
								break;
							}
							else
							{
								driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
							}
					
					 }
					
				List<WebElement> alldates1=driver.findElements(By.xpath("//*[@class='uitk-calendar']/div[2]/div[1]/table/tbody/tr/td/button"));
				
				for(WebElement dateelement:alldates1)
				{
					String date=dateelement.getAttribute("data-day");
					System.out.println(date);
					if(date.equals("18"))
					{
						//System.out.println(date);
						dateelement.click();
						System.out.println("date selected");
					}
					
				}
					}
			//	
//					
//					
					
					
				}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
