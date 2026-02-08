package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// get(url) - Opens the URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// getTitle()-Returns title of the page
		
		System.out.println(driver.getTitle());  	//OrangeHRM

		// getCurrentUrl()-Returns URL of the page
		
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		// getPageSource() - Returns source code of the page
		
		//System.out.println(driver.getPageSource());
		
		// getwindowHandle() - Returns the ID of the single browser Window
		
		//String	windowid =driver.getWindowHandle();
	
		//System.out.println("Windows Id :" +windowid);  // DBA209E59B741FA99B16D3F5AD1C49DF
	
		// getwindowHandles() - Returns the ID's of the multiple browser Windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
		Set <String> windowids=driver.getWindowHandles();
		System.out.println(windowids); // [38470AC0E486B766562FDE541DB41CFB, 83EB489B3DEFC8EBB0AAEC97AC44F398]

		
		
	}

}
