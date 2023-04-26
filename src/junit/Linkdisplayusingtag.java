package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkdisplayusingtag {
	
EdgeDriver driver;


	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
	List<WebElement>l=driver.findElements(By.tagName("a"));
	System.out.println(l.size());
	System.out.println(l);
	for(WebElement li:l)
	{
		String link =li.getAttribute("href");
		String linktext= li.getText();
		System.out.println(link +"---"+linktext);
		
	}
	
	}
	
}
	
	
	
	


