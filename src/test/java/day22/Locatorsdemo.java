package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {

	public static void main(String[] args) {
		
		// 1) Launch a Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://demoqa.com/webtables");
		driver.get("https://www.demoblaze.com/index.html");
		
		//name (locator)
		//driver.findElement(By.name("searchBox")).sendKeys("mac"); (for this website it won't work)

		//id(locator)
		
		//driver.findElement(By.id("searchBox")).sendKeys("Kierra");
		
		//id(locator)
		
		//boolean logodisplaystatus =driver.findElement(By.id("app")).isDisplayed();
	   // System.out.println(logodisplaystatus);
		
		
		// LinkText & PartialLinkText (Locator)
		
		// driver.findElement(By.linkText("Cart")).click();
		
		//	driver.findElement(By.partialLinkText("ar")).click();
		
		// ClassName(Locator)
		
	/*
	 	List<WebElement> headerlinks = driver.findElements(By.className("nav-item"));
	 	System.out.println(headerlinks.size());
	 */
		
		// Tag name(Locator)
	
	List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println("Total number of images in the webpage : " +images.size());
		
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total no.of Links in the webpage : "+links.size());
		
	}

}
