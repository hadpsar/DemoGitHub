package ExecutePOM_TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
	//Declaration
		@FindBy(xpath="//div[@ class='app_logo']") private WebElement logo;
		//Initialization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Usage
		public void verifyHomePageLogo()
		{
			boolean res=logo.isDisplayed();
			if(res==true)
			{
				System.out.println("Logo is visible");
			}
			else
			{
				System.out.println("Logo is invisible");
			}
		}
	}

