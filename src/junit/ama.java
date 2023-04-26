package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ama {
	EdgeDriver driver;
	
@Before
public void setup()
{
	driver=new EdgeDriver();
}
@Test
public void test()
{
driver.get("https://www.amazon.in");	
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
driver.findElement(By.xpath(" //a[@data-csa-c-type='link']")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdef");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.navigate().back();
driver.navigate().back();
driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	
}

}	
	
	
	
	
	

