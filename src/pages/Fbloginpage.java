package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	By fbloginmail=By.id("email");
	
	By fbloginpassword=By.id("pass");
	
	By fbloginbutton=By.name("login");
	public  Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email, String password)
	{
	driver.findElement(fbloginmail).sendKeys(email);
	driver.findElement(fbloginpassword).sendKeys(password);
	
	}
	
	public void login()
	{
	driver.findElement(fbloginbutton).click();	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
