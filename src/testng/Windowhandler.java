package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
WebDriver driver;
@BeforeTest
public void setup() {
	driver=new FirefoxDriver();
	
}
	
	@BeforeMethod
	public void setdata() {
		driver.get(" https://demo.guru99.com/popup.php");
		
	}
	
@Test
public void test1() throws Exception
{
	String parentwindow=driver.getWindowHandle();
	System.out.println("parentwindow"+parentwindow);
	System.out.println("parentwindow title"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allwindowhandles=driver.getWindowHandles();
	for(String handle:allwindowhandles)
	{
	if (!handle.equalsIgnoreCase(parentwindow))
	{
		driver.switchTo().window(handle);
		
		 WebElement s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));

		 s.sendKeys("abc@gmail.com");
	Thread.sleep(5000);
	System.out.println(s);
	String s1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td/h2")).getText();
	Thread.sleep(5000);
	System.out.println("text="+s1);
		
	driver.close();
	}	
}
	driver.switchTo().window(parentwindow);
	
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	}
}





