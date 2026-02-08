package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));  //declaration
				
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
				
	WebElement	txtuser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	txtuser.sendKeys("admin");
	
	WebElement	pwduser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	//input[@placeholder='Password']")));
	pwduser.sendKeys("admin123");
	
	WebElement	clickbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
	
	clickbtn.click();
	//button[normalize-space()='Login']

	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin user");
	}

}
