package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
  @Test
  public void Test1() 
  {
	  String Str="Hello";
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(Str, "Hi");
	  System.out.println("Hello,its me");
	  String Str2="Hi";
	  soft.assertEquals(Str2, "Hi");
	  System.out.println("Mello,its me");
	  soft.assertAll();
  }
  
  @Test
  public void Test2()
  {
	  System.out.println("Its again me");
	  
  }
  
}
