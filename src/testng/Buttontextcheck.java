package testng;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontextcheck {
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

	public void buttontest()
	{
	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	String text= button.getAttribute("value");
	String excep="checkavailable";
	
	if ( text==excep)
	{
	System.out.println("pass")	;
		
	}
	else
	{
		System.out.println("fail")	;
	}
}
	}