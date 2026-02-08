package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		// get(url) - Opens the URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		 Thread.sleep(3000); // Pause the execution 
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin user");
		
		
	
	}

}
