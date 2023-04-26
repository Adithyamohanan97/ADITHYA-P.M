package webdrivers;

import org.openqa.selenium.edge.EdgeDriver;

public class Pagesourse {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver() ;
driver.get("https://www.google.com");
		String src= driver.getPageSource();
		
		if (src.contains ("Gmail"))
		{
			   System.out.println("present");
		}
		
		else
		{
			System.out.println(" not present");
		}
			
	}

	
}
