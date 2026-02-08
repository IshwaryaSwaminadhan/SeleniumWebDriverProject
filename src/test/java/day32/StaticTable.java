package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		// 1)find total number of rows in a table
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//int rows =driver.findElements(By.tagName("tr")).size(); // single table
		
		System.out.println("Number of Rows :"+rows); //7
		
		// 2)Find total number of columns in a table
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		// int cols =driver.findElements(By.tagName("th")).size(); //single table
		System.out.println("Number of Columns:"+cols);
		
		//3) Read data specific row and column ()
	}

}
