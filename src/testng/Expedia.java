package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expedia {
	
	WebDriver driver;
	@BeforeTest
	public void  data() {	
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-orgins=*");
//driver=new ChromeDriver(options);	
		driver=new FirefoxDriver();
//driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading () {
		driver.get("https://www.expedia.com");
	}
@Test
public void test1() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofHours(90));
	driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@aria-label='Leaving from']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("Brussels",Keys.ENTER);
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@aria-label='Going to']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("NewYork",Keys.ENTER);
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/button")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@aria-label='Increase children']")).click();
	Thread.sleep(8000);
	

	WebElement s=driver.findElement(By.xpath("//*[@id=\"child-age-input-0-0\"]"));
	s.click();
	Select src= new Select( s);
	src.selectByVisibleText("3");

	driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button")).click();

	
	Thread.sleep(8000);

driver.findElement(By.xpath("//*[@id=\"preferred-class-input-trigger\"]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	WebElement m=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
	while(true)
	{
	if(m.equals("july2023"))
	{
System.out.println("m");
break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]"));
	}
	}

List<WebElement>  d =driver.findElements(By.xpath(" //*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
for(WebElement da:d)
{
	String date=da.getAttribute("data-day");

if (date.equals("10"))
{
	da.click();

}

	driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
}

}

}
