package Action;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {
  @Test
  public void keyboardFunctions() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement CurrentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAddress.sendKeys("abc pune");
		Actions a=new Actions(driver);
		//ctrl+A
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		//Scroll
		JavascriptExecutor js=((JavascriptExecutor)driver);
	    //Scroll down
	    js.executeScript("scroll(0,400)");
		//ctrl+C
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		//press TAB Key
		a.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		//ctrl+V
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();


  }
}
