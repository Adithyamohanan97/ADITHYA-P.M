package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");

	}
	@Test

	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"] "));
		WebElement drop=driver.findElement(By.xpath(" //*[@id=\"droppable\"]/p"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	String actual=drop.getText();
			
	String excep=("dropped!");
	if (actual.equalsIgnoreCase(excep))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
		
	}	
	}	
}	
	
		
		
		
		

