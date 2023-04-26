package junit;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	
	
	EdgeDriver driver;
	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	
	}
	@Test
	public void test1()
	{
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
		WebElement dayelement=driver.findElement(By.xpath(" //*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByVisibleText("22");
		
		WebElement mont=driver.findElement(By.xpath(" //*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(mont);
		month.selectByVisibleText("JAN");
	
		
		
		WebElement yearelement=driver.findElement(By.xpath(" //*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yearelement);
		year.selectByVisibleText("1997");
		
		
		 
		

	
	

	
	}		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


