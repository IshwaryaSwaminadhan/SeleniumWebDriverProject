package day31;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-15/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button/span")).click(); //opens dropdown options
		
		// Select Single Option
	//	driver.findElement(By.xpath("//ul//label/input[@title='Alabama']")).click();
	
		// 
		List <WebElement> options = driver.findElements(By.xpath("//ul/li"));
		
		
		for (WebElement op: options) {
			
			String option = op.getText();
			
			if(option.equals("Florida")||option.equals("Hawaii")||option.equals("Indiana") ) {
				
				op.click();
			}
			//
			
		}
	}

}
