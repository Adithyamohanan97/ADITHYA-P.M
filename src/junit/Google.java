package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
	
	EdgeDriver driver;
	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	
	}
	@Test
	public void test1()
	{
		
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
				search.sendKeys("books");
				search.submit();
				
	}}
	
////		@After
//		public void teardown()
//		{
//			
//			
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	


