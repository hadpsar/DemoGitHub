package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//source/from
		WebElement drag=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		//dest/to
		WebElement drop=driver.findElement(By.xpath("//ol[@id='bank']"));
		//Scroll
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Scroll down
		js.executeScript("scroll(0,300)");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.dragAndDrop(drag,drop).perform();;
  }
}
