package testng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	FirefoxDriver  driver;
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");	
	}
	@Test
	public void datadriventest()throws Exception
	{
	
	FileInputStream f=new FileInputStream("C:\\Users\\adith\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("sheet1");
	int rowcount=sh.getLastRowNum();
	System.out.println( rowcount );
for(int i=1;i<=rowcount;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println("username="+username+"password="+pswd);
	
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
	}
	}
}
	
	
	
	
	
	
	


