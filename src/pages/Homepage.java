package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	 
		WebDriver driver;
By source=By.xpath(" //*[@id=\"FromCity\"]");
By destination=By.xpath("//*[@id=\"ToCity\"] ");
By departure=By.xpath("//*[@id='txtFromDate']");
By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
public Homepage(WebDriver driver)
{
	this.driver=driver;
	
}

public void setup(String s, String d )
{
	driver.findElement( source).sendKeys(s,Keys.ENTER);
	driver.findElement(destination).sendKeys(d,Keys.ENTER);
}
public void set(String dat)
{
	
 driver.findElement(departure).clear();

 driver.findElement(departure).sendKeys(dat,Keys.ENTER );

// driver.findElement(departure).clear();
// 
// driver.findElement(departure).sendKeys(dat,Keys.ENTER );

driver.findElement(search).click();
}
			
}

