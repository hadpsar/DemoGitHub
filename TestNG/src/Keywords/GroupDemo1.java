package Keywords;

import org.testng.annotations.Test;

public class GroupDemo1 {
	 @Test(groups="smoke")
	  public void t6() 
	  {
		  System.out.println("Smoke3");
	  }
	  @Test(groups="sanity")
	  public void t7()
	  {
		  System.out.println("sanity");
	  }
	  @Test(groups="regression")
	  public void t8() 
	  {
		  System.out.println("regression");
	  }
	  @Test (groups="smoke",enabled=true)
	  public void t9()
	  {
		  System.out.println("smoke4");
	  }
	  @Test(groups= {"smoke","sanity","regression"})
	  public void t10()
	  {
		  System.out.println("All test executed");
	  }
	}

