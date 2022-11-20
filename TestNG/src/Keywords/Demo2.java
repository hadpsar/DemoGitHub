package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void login() 
  {
	  System.out.println("Login TC");
	 
  }
  @Test 
  public void abc()
  {  Assert.fail();
	 System.out.println("ABC TC"); 
  }
  @Test(dependsOnMethods= {"login","abc"})
  public void verifyLogo()
  {
	  System.out.println("VerifyLogo TC");
  }
  }


