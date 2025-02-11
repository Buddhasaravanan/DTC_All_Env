package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceContracts_Page extends BasePage
{
	WebDriver driver;
	
	public ServiceContracts_Page (WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;

	@FindBy(id="app-nav-service-management-plans") WebElement plans;
	@FindBy(xpath="//span[contains (text(),'New service opportunity')]")  WebElement newserviceopportunity;
	
	
	
	

}
