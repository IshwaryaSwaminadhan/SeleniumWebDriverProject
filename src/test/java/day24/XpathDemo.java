package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize(); // maximize the browser window
		
	
		driver.get("http://opencart.abstracta.us/");
		

		// xpath with single attribute
		
	//	driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("One Plus Mobiles");
		
		// xpath with multiple attribute
		
	//	driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("One Plus Mobiles-");
		
		// xpath with 'and' 'or' operator
		
		// driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Western Wears");
		// driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Western Wears-");
		
		// xpath with text()- inner text
		// driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
	/*	boolean displaystatus =driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		
		System.out.println(value);  */
		
		// X-path with contains()
		
	//	driver.findElement(By.xpath("//*[contains(@name,'sea')]")).sendKeys("T-shirts from ajio");
		
		
		// X-path with starts-with()
		
	//	driver.findElement(By.xpath("//*[starts-with(@name,'sea')]")).sendKeys("T-shirts from ajio Sale");
		
		// Chained X-path
		
	boolean displaystatus =	driver.findElement(By.xpath("//div[@id='logo']/h1/a")).isDisplayed();
	
	System.out.println(displaystatus);
		
		

	}

}
