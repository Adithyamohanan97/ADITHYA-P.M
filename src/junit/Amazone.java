package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazone {
	EdgeDriver driver;

	@Before
	public void setup()
	{


	driver= new EdgeDriver ();
	}
	@Test
	public void test1()
	{
		
	driver.get("https://www.amazon.in");
 WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
 search.sendKeys("mobiles");
search.submit()	;
	

driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
driver.findElement(By.xpath(" //span[@id='nav-link-accountList-nav-line-1']")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("haiee");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.navigate().back();
driver.navigate().back();

driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
driver.findElement(By.xpath(" //i[@class='hm-icon nav-sprite']")).click();


	}

		
	}


