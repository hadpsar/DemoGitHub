package Keywords;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups="smoke")
  public void t1() 
  {
	  System.out.println("Smoke1");
  }
  @Test(groups="sanity")
  public void t2()
  {
	  System.out.println("sanity");
  }
  @Test(groups="regression")
  public void t3() 
  {
	  System.out.println("regression");
  }
  @Test (groups="smoke",enabled=true)
  public void t4()
  {
	  System.out.println("smoke2");
  }
  @Test(groups= {"smoke","sanity","regression"})
  public void t5()
  {
	  System.out.println("All test executed");
  }
}
