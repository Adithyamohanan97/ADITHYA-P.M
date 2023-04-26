package testng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Rightanddoubleclickalert{
		EdgeDriver driver;
		@BeforeTest
		public void setup()
		{
		driver=new EdgeDriver();
		}
		@BeforeMethod
		public void urlloading()
		{
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		} 
		@Test
		public void test1()
		{
	WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver)	;
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		a.accept();	
WebElement doub=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        act.doubleClick(doub);
		act.perform();
		Alert d=driver.switchTo().alert();
		d.accept();
		}}
