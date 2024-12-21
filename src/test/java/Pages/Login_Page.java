package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Base;

public class Login_Page extends BasePage {
	
	WebDriver driver;
 
	
	public Login_Page(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	
	//@FindBy(xpath="//input[contains(@id,'email')]") WebElement username;
	@FindBy(id="email") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="next") WebElement login;
	@FindBy(xpath="//span[contains (text(), 'D-Tools - DND')]") WebElement company;
	@FindBy(xpath="//*[name()='path' and contains(@d,'M6,0 L6,12')]") WebElement popup;
	@FindBy(xpath="//label[contains (text(), 'Dashboard')]") WebElement dashboardtxt;
	@FindBy(xpath="//span[contains (text(), 'Skip, will do later')]") WebElement mfa;
	@FindBy(xpath="//h3[contains (text(), 'Secure your account using MFA')]") WebElement mfatext;
	@FindBy(xpath="//span[contains (text(), ' D-tools DND - QBO')]") WebElement devcompany;
	
	
	//New Signup
	@FindBy(id="createAccount") WebElement newsignup;
	@FindBy(id="givenName") WebElement firstname;
	@FindBy(id="surname") WebElement secondnaem;
	@FindBy(id="email") WebElement emailadderss;
	@FindBy(id="newPassword") WebElement newpasword;
	@FindBy(id="reenterPassword") WebElement repassword;
	@FindBy(id="btnNext") WebElement continuebtn;
	
	
	
	
	public void Login () throws IOException, InterruptedException 
	{
		username.sendKeys(Base.getProperties().getProperty("email"));
		password.sendKeys(Base.getProperties().getProperty("pwd"));

	}
	
	public void login_btn()
	{
		login.click();
	}
	
	public void choosecompany()
	{
		
		try 
		{
			String currenturl = Base.getdriver().getCurrentUrl();
			
			if(currenturl.startsWith("dev"))
			{				
				mfa.click();
				Thread.sleep(2000);
				devcompany.click();
			}
			else
			{
				company.click();
			}
				
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void popupclose()
	{
		popup.click();
	}
	
	public boolean logintitle()
	
	{
		dashboardtxt.isDisplayed();
		return true;
	}

}
