package day43;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	// @Test
	
	void test_HardAssertions() {
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1, 2); // Hard Assertion
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		 
	}
	
	@Test
	void test_SoftAssertions() {
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2); // soft  Assertion
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		 
		sa.assertAll(); //mandatory
	}
	

}
