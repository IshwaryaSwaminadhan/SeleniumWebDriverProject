package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		// Select option from the dropdown
		
		WebElement	drpdowncountry=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpdown = new Select(drpdowncountry);
		
		//drpdown.selectByVisibleText("Germany");
		//drpdown.selectByValue("uk");
		//	drpdown.selectByIndex(7);
		
		// Capture options from dropdown menu
		
		List <WebElement> options=drpdown.getOptions();
		System.out.println("No.of Options in the drop down :"+options.size());//10
		
		//Printing the options
	/*	for(int i=0;i<options.size();i++) {
			
		System.out.println(options.get(i).getText());
			
		}
		*/
		
		// advanced/enhanced for-loop
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		
		
		
	}

}
