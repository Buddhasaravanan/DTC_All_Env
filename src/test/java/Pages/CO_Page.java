package Pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.Base;

public class CO_Page extends BasePage
{
	WebDriver driver;
	
	public CO_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	
	@FindBy(id="nav-project-overview") WebElement overview;
	@FindBy(id="nav-co") WebElement changeorder;
	@FindBy(xpath="//span[contains (text(), 'New change order')]") WebElement createnewco;
	@FindBy(xpath="//input[@placeholder='Change order name']") WebElement coname;
	@FindBy(xpath="//span[contains (text() , ' Create & open change order')]") WebElement createcobtn;
	@FindBy(xpath="(//div[contains (text(),'Overview')])[2]") WebElement cooverview;
	@FindBy(id="nav-design") WebElement design;
	@FindBy(xpath="//span[contains (text(),'More')]") WebElement itemmore;
	@FindBy(xpath=" //span[contains (text(),'Remove from change order')]") WebElement removeitem;
	@FindBy(xpath="//label[contains (text(),' Keep the accessories, and convert them to items')]") WebElement keepaccessory;
	@FindBy(xpath="//span[contains (text(),'Yes, remove')]") WebElement yesremove;
	@FindBy(xpath="//mat-icon[@svgicon='unDeleteIcon']") WebElement undeletionbtn;
	@FindBy(xpath="//label[contains (text(),'Remove product, but keep the associated labor')]") WebElement keeplabor;
	@FindBy(xpath="(//div[@id='showHideColumns'])[1]") WebElement hower1stitem;
	@FindBy(xpath="(//div[@id='showHideColumns'])[2]") WebElement hower2stitem;
	@FindBy(xpath="(//div[@id='showHideColumns'])[3]") WebElement hower3stitem;
	@FindBy(xpath="(//div[@id='showHideColumns'])[4]") WebElement hower4stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[5]") WebElement hower5stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[6]") WebElement hower6stitem;
	@FindBy(xpath="//mat-icon[@svgicon='copyContent']") WebElement copyitem;
	@FindBy(xpath="(//span[contains (text(), 'All')])[2]") WebElement alllocation;
	@FindBy(xpath="(//span[contains (text(),'Copy')])[2]") WebElement copybtn;
	@FindBy(xpath="//mat-icon[@svgicon='replace']") WebElement replace;
	@FindBy(xpath="//span[contains (text(), 'Maintain price')]") WebElement maintainprice;
	@FindBy(xpath="//span[contains (text(), 'Keep labor')]") WebElement replacekeeplabor;
	@FindBy(xpath="//span[contains (text(), 'Keep accessories')]") WebElement replacekeppaccossory;
	@FindBy(id="btn-replace") WebElement replacebtn;
	//@FindBy(xpath="(//div[@class='secondary-text'])[2]") WebElement internalco;
	@FindBy(xpath="//span[contains (text(), ' Approve change order ')]") WebElement approvechangeorder;
	@FindBy(xpath="//span[text() = 'Removed']") WebElement removed;
	@FindBy(xpath="//span[text() = 'Added']") WebElement added;
	@FindBy(xpath="(//input[@id='add-product-search'])[2]") WebElement itemsearch;
	@FindBy(xpath="//span[contains (text(), 'Select')]") WebElement selectitem;
	@FindBy(xpath="//div[@id='item_0']") WebElement firstitem;
	@FindBy(id="itemName") WebElement itemname;
	@FindBy(xpath="//span[contains (text(), 'Approve change order')]") WebElement Approveco;
	@FindBy(xpath="(//span[contains (text(), 'Approve')])[2]") WebElement Approve1;
	@FindBy(xpath="(//mat-icon[@svgicon='backIcon'])[1]") WebElement cobackicon;
	@FindBy(xpath="//span[contains (text(),'Add  to change order')]") WebElement coitemadd;
	@FindBy(xpath="//span[contains (text(),'Keep labor')]") WebElement Rkeeplabor;
	@FindBy(xpath="//span[contains (text(),'Keep accessories')]") WebElement Rkeepacc;
	@FindBy(xpath="//mat-icon[@svgicon='setting']") WebElement cosettings;
	@FindBy(xpath="//div[contains (text(), 'Internal')]") WebElement internalco;
	@FindBy(xpath="(//mat-icon[@svgicon='closeIcon'])[3]") WebElement closeicon;
	@FindBy(id="createChangeOrderForm") WebElement newchangeorderform;
	@FindBy(xpath="//div[@class='back-arrow']") WebElement backarrow;
	@FindBy(id="app-nav-project-change-orders") WebElement lichangeorder;
	@FindBy(xpath="//span[contains (text(), 'New change order')]") WebElement newco1;
	@FindBy(xpath="//mat-radio-button[@class='mat-mdc-radio-button mat-accent']") WebElement internalco1;
	@FindBy(xpath="//ng-select[@placeholder='Select project']") WebElement selectproject;
	
	
	
	
	
	
	public void changeorder() throws InterruptedException
	{
		changeorder.click();
		Thread.sleep(2000);
	}
	
	public void createnewchangeorder()
	{
		createnewco.click();
	}
	
	public void nameofco() throws IOException
	{
		coname.sendKeys(Base.getProperties().getProperty("ExternalCOName"));
	}
	
	public void openco()
	{
		createcobtn.click();
	}
	
	public boolean covalidation()
	{
		boolean ov = cooverview.isDisplayed();
		return ov;
	}
	
	public void designsection() throws InterruptedException
	{
		design.click();
		Thread.sleep(2000);
	}
	
	public void hower1()
	{
		Actions act = new Actions(Base.getdriver());
		
		act.moveToElement(hower1stitem).click().perform();
	}
	
	public void removeitemwithkeepaccessory() throws InterruptedException
	{
		try
		{
			itemmore.click();
			removeitem.click();
			Thread.sleep(2000);	
			keepaccessory.click();
			yesremove.click();
			Thread.sleep(2000);	
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public String validationremoveitem()
	{
		String removetag = removed.getText();
		return removetag;  
	}
	
	
	public void keeplabor() throws InterruptedException
	{
		Actions act = new Actions(Base.getdriver());
		
		try
		{
			act.moveToElement(hower2stitem).click().perform();
			itemmore.click();
			removeitem.click();
			keeplabor.click();
			yesremove.click();
			Thread.sleep(2000);	
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public String validationkeeplabor()
	{
		String removetag = removed.getText();
		return removetag;  
	}
	
	public void copyitem()
	{
		Actions act = new Actions(Base.getdriver());
		try
		{
			act.moveToElement(hower2stitem).click().perform();
			copyitem.click();
			alllocation.click();
			copybtn.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void copyitemvalidation()
	{
		String tomsg = toastmsg.getText();
		
		try
		{
			if(tomsg.equals("Items copied to locations"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("Toast Message Missing");
			}
			
	}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void createinternalco() throws IOException
	{
		Actions act = new Actions(Base.getdriver());
		
		try
		{
			/*backarrow.click();
			Thread.sleep(2000);
			lichangeorder.click();
			Thread.sleep(2000);
			newco1.click();
			Thread.sleep(2000);
			internalco1.click();
			coname.sendKeys(Base.getProperties().getProperty("InternalCOName"));
			selectproject.click();
			Thread.sleep(2000);
			Base.Enter();
			createcobtn.click();*/
			createnewco.click();
			Thread.sleep(2000);
			//act.moveToElement(internalco).click().perform();
			internalco.click();
			coname.sendKeys(Base.getProperties().getProperty("InternalCOName"));
			createcobtn.click();
			Thread.sleep(2000);
			/*cosettings.click();
			Thread.sleep(2000);
			internalco.click();
			closeicon.click();*/
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public boolean internalcovalidation()
	{
		boolean ov = cooverview.isDisplayed();
		return ov;
	}
	
	public void replace() throws InterruptedException, IOException
	{
		Actions act = new Actions(Base.getdriver());
		
		try
		{
			//act.moveToElement(hower2stitem).click().perform();
			replace.click();
			Thread.sleep(2000);	
			itemsearch.click();
			itemsearch.sendKeys(Base.getProperties().getProperty("replaceitem"));
			Thread.sleep(3000);
			firstitem.click();
			selectitem.click();
			Thread.sleep(2000);
			maintainprice.click();
			Rkeeplabor.click();
			Rkeepacc.click();
			replacebtn.click();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void approveinternalco() throws InterruptedException
	{
		Approveco.click();
		Thread.sleep(3000);
		Approve1.click();
		Thread.sleep(3000);
	}
	
	public void coback() throws InterruptedException
	{
		cobackicon.click();
		Thread.sleep(3000);
		cobackicon.click();
		Thread.sleep(3000);
	}
	
	public void additemco()
	{
		try
		{
			coitemadd.click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void coitemvalidation()
	{
		
	
	String tomsg = toastmsg.getText();
	
	try
	{
		if(tomsg.equals("Item added"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Toast Message Missing");
		}
		
}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	
}




