package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		// get(url) - Opens the URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);

		// driver.close(); // close single browser window whenever driver is focused 
		
		driver.quit(); // close all  browser window 
	}

}
