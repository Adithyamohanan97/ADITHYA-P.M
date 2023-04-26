package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerteg {
	EdgeDriver driver;
	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	
	}
	@Test
	public void test1()
	{
		
		driver.get("file:///C:/Users/adith/Documents/code.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert c=driver.switchTo().alert();
		String text=c.getText();
		System.out.println(text);
		c.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Adithya");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("pm");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	
			
}
