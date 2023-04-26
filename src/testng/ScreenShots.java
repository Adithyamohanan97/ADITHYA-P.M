package testng;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShots {
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
	public void Screenshot()throws Exception
	
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
	FileHandler.copy(src, new File("C:\\Users\\adith\\Desktop\\New folder image.png"));
	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2] "));
	File src1=button.getScreenshotAs(OutputType.FILE);	
	FileHandler.copy(src1, new File("./Screenshot/img.png"));
		
	}
}
