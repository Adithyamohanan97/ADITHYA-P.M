package pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buscharterpage {
	WebDriver driver;
	By bus=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By name=By.xpath("//*[@id=\"TourCategory\"]");
	By email=By.xpath("//*[@id=\"txtEmail\"]");
	By mobileno=By.xpath("//*[@id=\"txtMobileNo\"]");
	By category=By.xpath("//*[@id=\"TourCategory\"]");
	By from=By.xpath("//*[@id=\"txtFromCity\"]");
	By to=By.xpath("//*[@id=\"txtToCity\"]");
	By depdate=By.xpath("//*[@id=\"txtFromDate\"]");
	By arrival=By.xpath("//*[@id=\"txtToDate\"]");
	By hour=By.xpath("//*[@id=\"txtPickupHour\"]");
	By time=By.xpath("//*[@id=\"txtPickMinute\"]");
	By am=By.xpath("//*[@id=\"txtPickTimeRange\"]");
By pickup=By.xpath(" //*[@id=\"txtPickup\"]");
By bustype=By.xpath("//*[@id=\"BusType\"]");
By passenger=By.xpath("//*[@id=\"txtnoOfPassenger\"]");
By remarks=By.name("remarks");
By captcha=By.id("txtcaptcha");


public Buscharterpage(WebDriver driver)
{
	this.driver=driver;
	
}
public void setfor() 

{
	driver.findElement(bus).click();
}
public void setvalues(String n)
{
driver.findElement(name).sendKeys(n,Keys.ENTER);
}

public void set(String e,String m)
{
driver.findElement(email).sendKeys(e,Keys.ENTER);	
driver.findElement(mobileno).sendKeys(m,Keys.ENTER);
}
public void set2( String ca)
{
WebElement dd =driver.findElement(category);
dd.click();

dd.sendKeys(ca,Keys.ENTER);

}
public void data(String f,String t,String d,String a )
{
driver.findElement(from).sendKeys(f,Keys.ENTER);	
driver.findElement(to).sendKeys(t,Keys.ENTER);	
driver.findElement(depdate).sendKeys(d,Keys.ENTER);	
driver.findElement(arrival).sendKeys(a,Keys.ENTER);
}
public void drop(String ho,String ti,String aa )
{

	WebElement ab=driver.findElement(hour);	
ab.click();

ab.sendKeys(ho,Keys.ARROW_DOWN);
ab.sendKeys(Keys.ENTER);

WebElement ac=driver.findElement(time);
ac.click();
ac.sendKeys(ti,Keys.ENTER );

WebElement ad=driver.findElement(am);
ad.clear();
ad.sendKeys(aa,Keys.ENTER );
}
public void setup3(String p )
{
driver.findElement(pickup).sendKeys(p);	
}
public void set4(String bu )
{
WebElement ag=driver.findElement(bustype);

ag.click();
	ag.sendKeys(bu, Keys.ENTER );
}
public void set5( String nop,String r,String c)
{
	
driver.findElement(passenger).sendKeys(nop,Keys.ENTER);	
driver.findElement(remarks).sendKeys(r,Keys.ENTER);
driver.findElement(captcha).sendKeys(c,Keys.ENTER);	



}


}