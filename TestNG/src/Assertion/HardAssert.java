package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	String s1="Hi";
	String s2="Hi";
	String s3="Hello";
	String s4=null;
	
  @Test
  public void T1() 
  {
	  //verification point1 for T1 TC
	  Assert.assertEquals(s1, s2);//P
	  //verification point2 for T1 TC
	  Assert.assertNotNull(s4);//F
	  //verification point3 for T1 TC
	  Assert.assertNull(s4);//P
	  System.out.println("t1");
  }
  @Test
  public void T2()
  {
	  Assert.assertEquals(s1, s2);//T
  }
  @Test
  public void T3()
  {
	  System.out.println("T3");
	  Assert.assertEquals(s1, s3);//F
  }
}
