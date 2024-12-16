package Pages;

import java.io.IOException;

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
	@FindBy(xpath="(//mat-icon[@svgicon='deleteIcon'])[1]") WebElement removeitem;
	@FindBy(xpath="//label[contains (text(),' Keep the accessories, and convert them to items')]") WebElement keepaccessory;
	@FindBy(xpath="//span[contains (text(),'Yes, remove')]") WebElement yesremove;
	@FindBy(xpath="//mat-icon[@svgicon='unDeleteIcon']") WebElement undeletionbtn;
	@FindBy(xpath="//label[contains (text(),'Remove product, but keep the associated labor')]") WebElement keeplabor;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[1]") WebElement hower1stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[2]") WebElement hower2stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[3]") WebElement hower3stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[4]") WebElement hower4stitem;
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
	@FindBy(xpath="//div[contains (text(), 'Internal')]") WebElement internalco;
	@FindBy(xpath="//span[contains (text(), ' Approve change order ')]") WebElement approvechangeorder;
	@FindBy(xpath="//span[text() = 'Removed']") WebElement removed;
	@FindBy(xpath="//span[text() = 'Added']") WebElement added;
	@FindBy(xpath="//input[@id='add-product-search']") WebElement itemsearch;
	@FindBy(xpath="//span[contains (text(), 'Select')]") WebElement selectitem;
	@FindBy(xpath="//div[@id='item_0']") WebElement firstitem;
	@FindBy(id="itemName") WebElement itemname;
	@FindBy(xpath="//span[contains (text(), 'Approve change order')]") WebElement Approveco;
	@FindBy(xpath="(//span[contains (text(), 'Approve')])[2]") WebElement Approve1;
	@FindBy(xpath="(//mat-icon[@svgicon='backIcon'])[1]") WebElement cobackicon;
	
	
	
	
	
	
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
		removeitem.click();
		Thread.sleep(2000);	
		keepaccessory.click();
		yesremove.click();
		Thread.sleep(2000);	
	}
	
	
	public boolean validationremoveitem()
	{
		boolean removetag = removed.isDisplayed();
		return removetag;  
	}
	
	
	public void keeplabor() throws InterruptedException
	{
		removeitem.click();
		keeplabor.click();
		yesremove.click();
		Thread.sleep(2000);	
	}
	
	public boolean validationkeeplabor()
	{
		boolean removetag = removed.isDisplayed();
		return removetag;  
	}
	
	public void copyitem()
	{
		hower1();
		copyitem.click();
		alllocation.click();
		copybtn.click();
	}
	
	public String copyitemvalidation()
	{
		String toast = toastmsg.getText();
		return toast;	
	}
	
	public void createinternalco() throws IOException
	{
		createnewco.click();
		internalco.click();
		coname.sendKeys(Base.getProperties().getProperty("InternalCOName"));
		createcobtn.click();
	}
	
	public boolean internalcovalidation()
	{
		boolean ov = cooverview.isDisplayed();
		return ov;
	}
	
	public void replace() throws InterruptedException, IOException
	{
		hower1();
		replace.click();
		Thread.sleep(2000);	
		itemsearch.click();
		itemsearch.sendKeys(Base.getProperties().getProperty("replaceitem"));
		Thread.sleep(3000);
		firstitem.click();
		selectitem.click();
		Thread.sleep(2000);
		maintainprice.click();
		keeplabor.click();
		keepaccessory.click();
		replacebtn.click();
	}
	
	public String replacevalidation()
	{
		String itm = itemname.getText();
		return itm;
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
	
}




