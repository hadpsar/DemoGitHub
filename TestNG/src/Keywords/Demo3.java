package Keywords;

import org.testng.annotations.Test;

public class Demo3 {
  @Test(priority=1)
  public void login()
  {
	  System.out.println("Login TC");
  }
  @Test(priority=2,enabled=false)
  public void test()
  {
	  System.out.println("test demo");
  }
  @Test (priority=3,timeOut=100)
  public void t1()
  {
	  System.out.println("T1 TC");
  }
}
