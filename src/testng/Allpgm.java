package testng;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allpgm {
	EdgeDriver driver;
@BeforeTest
public void browser()
{
driver = new EdgeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.manage().window().maximize();
	driver.get(" https://aries.res.in/opportunities/faculty-positions/online_form");
	
	}
	
	@Test
	
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.xpath("//*[@id=\"edit-flexbox\"]/div[1]/div/div/div/div[1]/div/div")).click();
		WebElement p =driver.findElement(By.xpath("//*[@id=\"edit-flexbox\"]/div[1]/div/div/div"));
		p.sendKeys("Ms.",Keys.ENTER);
	
//	List<WebElement> p=driver.findElements(By.xpath("//*[@id=\"choices--edit-title-item-choice\"]"));
//	
//for(WebElement l :p)
//{
//	String c=l.getAttribute("data-value");
//	if(c.equals("Ms."));
//	System.out.println(c);
//l.click();
//	
//}
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
