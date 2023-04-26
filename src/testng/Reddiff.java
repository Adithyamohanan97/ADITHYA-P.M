package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiff {
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
	public void logo()
	{
	
boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
if (logo)
{
System.out.println("displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
	}
    @Test
    public void button()
    	{
    
	boolean radiobutton=driver.findElement( By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
	if (radiobutton)
	{	
		System.out.println(" male selected");
	}
	else
	{
		System.out.println("not selected");
	}
    	}
    	@Test
    	public void account()
    	{
	boolean createaccount=driver.findElement(By.xpath(" //*[@id=\"Register\"]")).isEnabled();
	if (createaccount)
	{
		System.out.println(" enabled");
	}
	else
	{
		System.out.println(" not enabled");
	}
	
	}

	}
	
		
	
	
