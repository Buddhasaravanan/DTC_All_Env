package Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Base;

public class Opportunity_Page extends BasePage {
	
WebDriver driver;

Date d=new Date();
	
	public Opportunity_Page(WebDriver driver) 
	{
	    super(driver);
		
	}
	
	Base bc=new Base();
	

	
	@FindBy(xpath="//mat-list-item[@id='app-nav-opportunities']") WebElement opportunities;
	@FindBy(xpath="//button[@id='btn-new-opportunity']") WebElement newOpportunity;
	@FindBy(xpath="//input[@id='opportunityName']") WebElement opportunityName;
	@FindBy(id="opportunityProjectType")  WebElement selectProjectType;
	@FindBy(id="buildingTypeId")  WebElement selectBulidingType;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement listbox;
	//@FindBy(xpath="//div[contains (text(), 'Select market sector')]") WebElement selectMarketType;
	@FindBy(id="marketSector")  WebElement selectMarketType;
	@FindBy(xpath="//input[@placeholder='Client name']") WebElement clientName;
	@FindBy(xpath="//div[@id='btn-create-opportunity']") WebElement next;
	@FindBy(xpath="//input[@id='opportunityMeasurementLabel']") WebElement squareFeet;
	//@FindBy(xpath="(//div[contains (text(),'Create')])[3]") WebElement create;
	@FindBy(id="btn-create-opportunity")  WebElement create;
	@FindBy(xpath="//span[contains (text(), 'Won')]") WebElement wonbtn;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement list;
	@FindBy(xpath="//span[contains (text(), 'Service')]") WebElement service;
	@FindBy(xpath="//span[contains (text(), 'Single Family Detached - Production')]")  WebElement markettypesingle;
	@FindBy(xpath="//span[contains (text(), 'Residential')]")  WebElement residential;
	@FindBy(id="opportunityBudget")  WebElement oppbudget;
	//@FindBy(xpath="//div[@aria-expanded='true']")  WebElement quotetype;
	@FindBy(xpath="//ng-select[@id=\"quoteType\"]")  WebElement quotetype;
	@FindBy(xpath="//span[contains (text(), 'Bid/Spec')]")  WebElement bid;
	@FindBy(xpath="//button[contains (text(), 'OK')]")  WebElement cacshpopup;
	
	
	
	
	public void click_opportunity() 
	{
		try 
		{
			cacshpopup.click();
			opportunities.click();
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void click_newopportunity()
	{
		newOpportunity.click();
	}
	
	public void oppname() throws IOException
	{
		opportunityName.sendKeys(Base.getProperties().getProperty("oppname") + " " + d );
	}
	
	public void projectype()
	{
		try
		{
			selectProjectType.click();		
			Thread.sleep(1000);
			service.click();
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void markettype()
	{
		try
		{
			WebElement mrk = selectMarketType;
			mrk.click();
			Thread.sleep(1000);
			markettypesingle.click();
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 
		
		
	}
	
	public void client() throws IOException, InterruptedException, AWTException
	{
		clientName.sendKeys(Base.getProperties().getProperty("Cname") + Keys.ENTER);
		//Thread.sleep(3000);
		//Base.Enter();
		//Thread.sleep(3000);
		
	}
	
	public void NXTbtn() throws InterruptedException
	{
		try 
		{
			next.click();
			Thread.sleep(2000);
			next.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 
		
	}
	
	public void  Sqfeet() throws IOException
	{
		squareFeet.sendKeys(Base.getProperties().getProperty("sqfeet"));
	}
	
	public void createopp() throws InterruptedException
	{
		try
		{
			create.click();
			Thread.sleep(10000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 
		
	}
	

	public boolean createoppvalidation()
	{
		wonbtn.isDisplayed();
		return true;
		
	}
	
	
	public void residential()
	{
		try 
		{
			selectBulidingType.click();
			Thread.sleep(1000);
			residential.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void budget() throws IOException
	{
		oppbudget.sendKeys(Base.getProperties().getProperty("Budget"));
	}
	
	
	public void quotetype()
	{
		quotetype.click();
		bid.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
