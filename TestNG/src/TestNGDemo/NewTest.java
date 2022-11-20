package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testMethod()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
