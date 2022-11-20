package ExecutePOM_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestDemo {
  @Test
  public void Test() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  LoginPage l=new LoginPage(driver);
	  l.setLoginPageUN();
	  l.setLoginPagePWD();
	  l.clickLoginPageLgnBtn();
	  
	  HomePage h=new HomePage(driver);
	  h.verifyHomePageLogo();
	  Thread.sleep(2000);
	  driver.close();
  }
}
