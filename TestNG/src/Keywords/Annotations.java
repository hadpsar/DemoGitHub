package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("Before Suite");
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Before Class");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("Before Method");
  }
  @Test
  public void t1()
  {
	  System.out.println("T1 TestCase");
  }
  @Test
  public void t2()
  {
	  System.out.println("T2 TestCase");
  }
  @Test
  public void t3()
  {
	  System.out.println("T3 TestCase");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("After Method");
  }
  @AfterClass
  public void afterclass()
  {
	 System.out.println("After Class"); 
  }
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("After suite");
  }
  
  
}
