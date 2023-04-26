package junit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	//import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
		public class Passingvalues {

	
	EdgeDriver driver;
		@Before
		public void setup()
		{
		driver=new EdgeDriver();
		
		}
		@Test
		public void test1()
		{
			
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
		}
			@After
			public void teardown()
			{
				//driver.quit();
				
			}
	
	

}
