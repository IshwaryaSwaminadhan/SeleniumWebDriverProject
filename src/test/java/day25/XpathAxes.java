package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://money.rediff.com/gainers/bse/daily/groups");
	 
	// Self - Selects the current node
	 
	String text= driver.findElement(By.xpath("//a[contains(text(),'Universal')]/self::a")).getText();
	System.out.println(text); // Universal Arts Ltd.
	 
	// Parent -Selects the parent of the current node (always one)
	
	String paretext=driver.findElement(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/parent::td")).getText();
	System.out.println(paretext); // Universal Arts Ltd.
	
	//child -Selects all children of the current node (one or many)
	
	List <WebElement> childstot = driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/child::td"));
	System.out.println("Number of Child Elements : "+childstot.size());
	
	// Ancestor - Selects all ancestors (parents, ancestors...etc)
	
	text=driver.findElement(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr")).getText();
	System.out.println(text);
	
	// Descendant - Selects all the descendants (children, grand children, etc.)of the current node
	
	List <WebElement> descedcount = driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/descendant::td"));

	System.out.println("Number of Descendent Nodes :"+descedcount.size());
	
	// Following - Selects everything in the document after closing tag of the current node
	
	List <WebElement> followingn =  driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/following::tr"));
	
	System.out.println("Number of following Nodes :"+followingn.size());
	
	// Following-siblings - Selects all siblings after the current node
	

	List <WebElement> followingsb =  driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/following-sibling::tr"));
	
	System.out.println("Number of following sibling Nodes :"+followingsb.size());
	
	
	// preceding - Selects all nodes that appear the current node in the document
	
		List <WebElement> precedingn =  driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/preceding::tr"));
		
		System.out.println("Number of preceding Nodes :"+precedingn.size());
		
		// preceding-siblings - Selects all siblings before the current node
		

		List <WebElement> precedingsb =  driver.findElements(By.xpath("//a[contains(text(),'Universal Arts Ltd.')]/ancestor::tr/preceding-sibling::tr"));
		
		System.out.println("Number of preceding sibling Nodes :"+precedingsb.size());
	}
}
