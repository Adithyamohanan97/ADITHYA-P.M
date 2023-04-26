package testng;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadnolink {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");

	}
	@Test
public void fileuploadpgm()throws Exception

	{
		//driver.get("https://www.ilovepdf.com/word_to_pdf");

	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	
			fileupload("C:\\Users\\adith\\Desktop\\adithyamohanan97.docx");
			
				
	}
	public  void fileupload( String p ) throws AWTException{
		StringSelection StrSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StrSelection, null);
		
		
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}	
	}
