package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	//Priority AZ az
  @Test(priority=1)
  public void Login() 
  {
	System.out.println("Run Login Test case");
  }
  @Test(priority=3)
  public void password()
  {
	System.out.println("Run Password Test case");  
	Assert.fail();
  }
  
  @Test(priority=2)
  public void click()
  {
	System.out.println("Run click Test case");
  }
}

