package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	//Total---pass,fail,skiped.
  @Test
  public void Test1()
  {
	  System.out.println("It's testCase 1");
  }
  
  @Test
  public void Test2()
  {
	  System.out.println("It's testCase 2");
  }
  
  @Test
  public void Test3()
  {
	  System.out.println("It's testCase 3");
  }
  
  @Test
  public void Test4()
  {
	  //Forcefully fail any testCase
	  Assert.fail();
  }
  
  @Test 
  public void Test5()
  {
	  Assert.fail();
  }
}
