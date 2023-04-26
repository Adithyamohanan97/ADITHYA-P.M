package webdrivers;

import org.openqa.selenium.edge.EdgeDriver;

public class Title {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="google";
		if (actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
			else
			{
		
		System.out.println("fail");
	}
System.out.println(actualtitle);
}
}