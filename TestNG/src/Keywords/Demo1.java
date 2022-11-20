package Keywords;

import org.testng.annotations.Test;

public class Demo1 {
  @Test(invocationCount=3)
  public void Login() 
  {
	  System.out.println("Execute Login Test Case");
  }
  @Test(enabled=true)
  public void Password()
  {
	  System.out.println("Execute Password Test Case");
  }
}
