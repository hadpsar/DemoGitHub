package HandleDynamicWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWebTable {
  @Test
  public void Test() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\VISIEST\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List <WebElement> allHeaders=driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println(allHeaders.size());
		for(WebElement ele:allHeaders)
		{
		
			String value=ele.getText();
			System.out.println(value);
		}
		
		System.out.println("==============================================================");
		List<WebElement> allData=driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		boolean dataStatus=false;
		for(WebElement ele:allData)
		{
			String value=ele.getText();
			System.out.println(value);
			if(value.contains("Ola"))
			{
				dataStatus=true;
				break;
			}
			
		}
		Assert.assertTrue(dataStatus,"Record did not found");
		
		List<WebElement> companyNames=driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[2]"));
		boolean companyStatus=false;
		for(WebElement ele:companyNames)
		{
			String value=ele.getText();
			System.out.println(value);
			if(value.contains("Java"))
			{
				companyStatus=true;
				break;
			}
			
		}
		Assert.assertTrue(companyStatus,"company did not found");
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();*/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td[1]//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]")).click();
		
		
		
		}
		
  }



