package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  @Test(dataProvider="loginInputs")
  public void login(String Uname,String Pass) throws InterruptedException 
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

		Username.sendKeys(Uname);
		Thread.sleep(2000);
		Password.sendKeys(Pass);
		Thread.sleep(2000);
		LoginButton.click();
		//Actions a=new Actions(driver);
		//a.click(LoginButton).perform();
		//a.moveToElement(LoginButton).click(LoginButton).build().perform();
		//using JavaScriptExecuter click on webelement
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].click;",LoginButton);
		
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
	    }
  		@DataProvider(name="loginInputs")
  		public Object[][] getData()
  		{
  		return new Object[][]
  				{
  						{"standard_user","secret_sauce"},
  						{"locked_out_user","secret_sauce"},
  						{"problem_user","secret_sauce"}
  						
  				};
}
}				

