package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class Xpath {
	EdgeDriver driver;

@Before
public void setup()
{


driver= new EdgeDriver ();
}
@Test
public void test1()
{
	
driver.get("https://facebook.com");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd123");	
driver.findElement(By.xpath("//button[@name='login']")).click();	
	
	
}
	

}
