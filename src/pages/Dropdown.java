package pages;








import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class Dropdown {
	WebDriver driver;
	By bus=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By category=By.xpath("//*[@id=\"TourCategory\"]");
	
By hour=By.xpath("//*[@id=\"txtPickupHour\"]");
By time=By.xpath("//*[@id=\"txtPickMinute\"]");
By am=By.xpath("//*[@id=\"txtPickTimeRange\"]");
By bustype=By.xpath("//*[@id=\"BusType\"]");
	
	public Dropdown(WebDriver driver)
	{
		this.driver=driver;
	}
public void setup(String ca)

{
	driver.findElement(bus).click();
	
	WebElement dd =driver.findElement(category);

dd.click();
dd.sendKeys(ca,Keys.ENTER);
}
public void setup1(String ho,String ti,String aa,String bu	)
{
  WebElement ab=driver.findElement(hour);
  ab.click();
 ab.sendKeys(ho,Keys.ENTER )	;

 WebElement ac=driver.findElement(time);
ac.click();
ac.sendKeys(ti,Keys.ENTER );

WebElement ad=driver.findElement(am);
ad.click();
ad.sendKeys(aa,Keys.ENTER );

WebElement ag=driver.findElement(bustype);
ag.click();
	ag.sendKeys(bu,Keys.ENTER );
	

	}
	
	


}