package Assertion;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginHardAssertion {
  @Test
  public void login() throws InterruptedException 
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ExpectedURL="https://www.saucedemo.com/inventory.html";
		WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		Username.sendKeys("standard_user");
		Thread.sleep(2000);
		Password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
  }
}
