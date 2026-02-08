package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsUsingExplicitWait {

	// Handle alert without using switchTo().alert();
	// by using explicit wait 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			
			Thread.sleep(3000);
			
			//driver.switchTo().alert().accept();
						
			//Alert myalert= driver.switchTo().alert();
			
	Alert	myalert = mywait.until(ExpectedConditions.alertIsPresent()); //capture alert
			
			System.out.println(myalert.getText());
			myalert.accept();
			
			

	}

}
