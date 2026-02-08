package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	 Set<String> windowsID= driver.getWindowHandles();
	 
	 // Approach1 -- we have only two windows need to shift so we used this List collection 
	 // but actually to handle the multi-windows we need to use advanced for-each loop 
	 
	 List<String> windidlist= new ArrayList<String> (windowsID);
	 
	 String parent= windidlist.get(0);
	 
	 String child= windidlist.get(1);
	 
	 // Switch to child window 
	 
	 driver.switchTo().window(child);
	 
	 System.out.println(driver.getCurrentUrl());
	 
	 // Switch to parent window 
	 
	 driver.switchTo().window(parent);
	 
	 System.out.println(driver.getCurrentUrl());
		
	}

}
