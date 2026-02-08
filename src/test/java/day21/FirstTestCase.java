package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/*
 
 Test Case
 ------------
 1)Launch Browser (Chrome)
 2)Open URL	https://www.opencart.com/
 3)Validate title should be "Your Score".
 4) Close Browser.
 
 */
public class FirstTestCase {

	public static void main(String[] args) {
		
		//1) Launch Browser(Chrome)
		
		//ChromeDriver driver=new ChromeDriver();
		 WebDriver driver =new ChromeDriver();
		
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		 
		 // to maximize the window
		 driver.manage().window().maximize();
		
		//2)Open URL - https://demo.opencart.com/
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		// 3)Validate title should be "Your Store".
		
		String actu_title= driver.getTitle();
		//System.out.println(actu_title);
		
		if(actu_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//  4) Close Browser.
		
		driver.close();
		
	//	driver.quit();
		
		
	}

}
