package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/"); // maximize the browser window
		
		// tag id (Css-Locator)    tag#id
		
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

		// tag class (Css-Locator)    tag.class
		
		 //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Kurtas");
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Western wear");

		// tag attribute 	tag[attribute='value']
		
	//	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Iphone");
		
	//	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mac");
		
		// tag class attribute  		tag.class["attribute"]
		
		// driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirt");
		
	}

}
