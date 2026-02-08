package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class GoogleSearch_Autosuggest_Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("selenium");
		
		List <WebElement> Option =driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		for(int i=0; i<Option.size(); i++) {
			
			 String op=Option.get(i).getText();
			
			
			if(op.equals("selenium")) {
				
				Option.get(i).click();
				break;
			
			}
			
		}
	
	}

}
