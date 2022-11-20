package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollactions {
  @Test
  public void ScrollFunctions() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//Scroll
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Scroll down
		js.executeScript("scroll(0,300)");
		Thread.sleep(2000);
	
		//Scroll up
		js.executeScript("scroll(0,-100)");
		
  }
}
