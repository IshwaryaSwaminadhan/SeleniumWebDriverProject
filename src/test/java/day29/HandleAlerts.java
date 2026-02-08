package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Normal alert with OK button 
		
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		
		Alert myalert= driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		myalert.accept();
		
		*/
		
		// 2) Confirmation Alert - OK & Cancel
		
	/* 	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
			driver.switchTo().alert().accept();  // close alert using OK button
		
		// driver.switchTo().alert().dismiss(); // close alert using cancel button

		*/
		
	// Prompt alert - Input Box
		
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	
	Thread.sleep(3000);

	Alert myalert = driver.switchTo().alert();
	
	myalert.sendKeys("Welcome Home");
	
	myalert.accept();

	}

}
