package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isDisplayed
		
		/* WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
		 System.out.println(logo.isDisplayed());
		
		 boolean logostatus=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		 System.out.println("Display Status : "+logostatus);
		 
		 */
		
		// isEnabled
		
	/* 	boolean	displystatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(displystatus);
		
		*/
		
	WebElement male_rb=	driver.findElement(By.xpath("//input[@id='gender-male']"));
	
	WebElement female_rb=	driver.findElement(By.xpath("//input[@id='gender-female']"));
		
	
		System.out.println("Before Selection...");
		System.out.println(male_rb.isSelected()); // false
		System.out.println(female_rb.isSelected()); // false
		
		System.out.println("After Selecting male....");
		male_rb.click();
		
		System.out.println(male_rb.isSelected());  // true
		System.out.println(female_rb.isSelected()); // false
		
		
		boolean newsletterstatus= driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions']")).isSelected();
		System.out.println("News Letter status :"+newsletterstatus); // true
		
	
	}

}
