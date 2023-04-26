package junit;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkvalidation {
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
	List<WebElement>l=driver.findElements(By.tagName("a"));
	System.out.println(l.size());
for(WebElement li:l)
{
	String link=li.getAttribute("href");
	verify(link);
}
	}
	private void verify(String link) {
		try
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200 successful----"+link);
			}	
			
			else if( con.getResponseCode()==404)
			{
System.out.println(" no content error 404----"+link);
		}
		}
		catch(Exception e)
		{
			System.out.println( "error");
			
		}
	
	}
}
				
