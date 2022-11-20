package ExecutePOM_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@ FindBy(xpath="//input[@id='user-name']") private WebElement UN;
		@ FindBy(xpath="//input[@id='password']") private WebElement PWD;
		@ FindBy(xpath="//input[@id='login-button']") private WebElement LgnBtn;
		//Initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		} 
		//Usage
		public void setLoginPageUN()
		{
			UN.sendKeys("standard_user");
		}
		public void setLoginPagePWD()
		{
			PWD.sendKeys("secret_sauce");
		}
		public void clickLoginPageLgnBtn()
		{
			LgnBtn.click();
		}
}
