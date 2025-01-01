package Pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.Base;


public class ServiceCall_Page extends BasePage
{
	WebDriver driver;
	
	public ServiceCall_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	
	@FindBy(id="app-nav-service-management") WebElement Service;
	@FindBy(id="app-nav-service-management-orders") WebElement calls;
	@FindBy(xpath="//span[contains (text(), 'Schedule service')]") WebElement createservicecall;
	@FindBy(xpath="//input[@name='client']") WebElement clientname;
	@FindBy(xpath="//span[contains (text(), 'Bodhi')]") WebElement bodhi;
	@FindBy(xpath="//div[contains (text(), 'E.g. Customer called into office on Tuesday stated their conference room projector stopped working.')]") WebElement issuereported;
	@FindBy(xpath="//span[contains (text(), 'Done')]") WebElement issuereporteddone;
	@FindBy(xpath="(//span[contains (text(), 'Create')])[2]") WebElement createSC;
	@FindBy(xpath="//input[@placeholder='Select start date']") WebElement SCstartdate;
	@FindBy(xpath="//input[@placeholder='Select end date']") WebElement SCenddate;	
	@FindBy(xpath="(//div[@role='combobox'])[4]") WebElement servicecontractdropbox;
	@FindBy(xpath="//span[contains (text(), 'Request payment')]") WebElement requestpayment;
	@FindBy(xpath="//div[contains (text(),'04:00 PM - 05:00 PM')]") WebElement schedule9to5;	
	@FindBy(xpath="//div[contains (text(), 'All Resources')]") WebElement allresource;
	@FindBy(xpath="(//div[@role='combobox'])[6]") WebElement allavailableresource;
	@FindBy(xpath="//div[contains (text(), 'Ajai DND')]") WebElement Ajai;
	@FindBy(xpath="//span[contains (text(), 'Schedule')]") WebElement SCschedule;
	@FindBy(xpath="//span[contains (text(), 'Work Summary')]") WebElement worksummary;
	@FindBy(id="labor-time-input") WebElement labortime;
	@FindBy(xpath="//span[contains (text(), 'Add labor')]") WebElement addloabor;
	@FindBy(xpath="(//ng-select[@placeholder='Select labor type'])[2]") WebElement labortype;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement listoflabors;
	@FindBy(xpath="(//span[contains (text(), 'Add')])[5]") WebElement laboradd;
	@FindBy(xpath="(//mat-icon[@svgicon='closeIcon'])[6]") WebElement laborclosebtn;
	@FindBy(xpath="(//div[@id='labor-time-input'])[2]") WebElement truckrollfee;
	@FindBy(xpath="//input[@name='truck']") WebElement truckrollfeevalue;
	@FindBy(xpath="//ng-select[@placeholder='Select tax']") WebElement truckrollfeetax;
	@FindBy(xpath="(//div[@id='labor-time-input'])[3]") WebElement drivetimefee;
	@FindBy(xpath="(//input[@name='truck'])[2]") WebElement drivetimefeevalue;
	@FindBy(xpath="//span[contains (text(), 'Add time entry')]") WebElement SCtimeentry;
	@FindBy(id="txt-app-search") WebElement addresource;
	@FindBy(xpath="//div[@class='time-container']") WebElement houresworked;
	@FindBy(id="labor-thour-input") WebElement laborhour;
	@FindBy(id="labor-tmin-input") WebElement labormins;
	@FindBy(xpath="//ng-select[@placeholder='Select labor type']") WebElement TElabortype;
	@FindBy(xpath="(//span[contains (text(),'Add')])[4]") WebElement timenetryadd;
	@FindBy(xpath="//span[contains (text(), 'Add product')]") WebElement SCaddproduct;
	@FindBy(xpath="//span[contains (text(), 'Repair Product')]") WebElement Repairproduct;
	@FindBy(xpath="//span[contains (text(), 'Replace Product')]") WebElement replaceproduct;
	@FindBy(xpath="//span[contains (text(), 'Additional Products Used')]") WebElement Additionalproductused;
	@FindBy(xpath="//input[@id='add-product-search']") WebElement itemsearch;
	@FindBy(xpath="//div[@id='item_0']") WebElement firstitem;
	@FindBy(xpath="(//button[@id='btn-add-item'])[1]") WebElement additem;
	@FindBy(xpath="(//span[contains (text(), 'Next')])[1]") WebElement next;
	@FindBy(xpath="(//span[contains (text(), 'Add')])[1]") WebElement add;
	@FindBy(xpath="//div[contains (text(), 'Net 30')]") WebElement terms;
	@FindBy(xpath="//div[contains (text(), ' Due upon receipt ')]") WebElement dueuponreceipt;
	@FindBy(xpath="//span[contains (text(), 'Create')]") WebElement paymentreqcreate;
	@FindBy(xpath="//mat-icon[@svgicon='proposalShare']") WebElement sharepayment;
	@FindBy(xpath="//span[contains (text(), 'Email')]") WebElement email;
	@FindBy(xpath="//input[@placeholder='Type here to enter email or contact']") WebElement tomail;
	@FindBy(xpath="//span[contains (text(), 'Send')]") WebElement send;
	@FindBy(xpath="//mat-icon[@svgicon='proposalPresent']") WebElement presentproposal;
	@FindBy(xpath="//span[contains (text(), 'Submit payment')]") WebElement submitpayment;
	@FindBy(id="method-card") WebElement creditcard;
	@FindBy(xpath="//mat-icon[@svgicon='backIcon']") WebElement backicon;
	@FindBy(xpath="//*[@id='dtCloudApp']/app-root/mat-sidenav-container/mat-sidenav-content/mat-drawer-container/mat-drawer-content/main/span/span/app-service/app-service-call-detail/div/div[3]/div/div/div/div[3]/div/div[4]/div[2]") WebElement labortotal;
	
	@FindBy(xpath="//div[@class='service-call-number']") WebElement scnumber;
	
	@FindBy(xpath="(//input[@id='time-dropdown'])[1]") WebElement starttime;
	@FindBy(xpath="(//input[@id='time-dropdown'])[2]") WebElement endtime;
	@FindBy(xpath="//div[contains (text(), '07:00 AM')]") WebElement sevenam;
	@FindBy(xpath="//div[contains (text(), '03:00 PM')]") WebElement threepm;
	@FindBy(xpath="//div[@class='time-dropdown-container ng-star-inserted']") WebElement timedrop;
	@FindBy(xpath="(//div[@role='option'])[2]") WebElement task;
	@FindBy(xpath="//div[@class='ql-editor ql-blank']") WebElement issuereported1;
	@FindBy(xpath="//span[contains (text(), 'Reschedule')]") WebElement reschedule;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement mainlaborlist;
	@FindBy(xpath="//div[contains (text(), 'Sales Tax 1 (8.25%)')]") WebElement salestax;
	@FindBy(xpath="//div[contains (text(), 'June 22')]") WebElement june22;
	
	
	
	
		public void servicecallpage() 
		{
			try 
			{
				
			Service.click();
			Thread.sleep(2000);
			calls.click();
			Thread.sleep(3000);
		}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
	} 
	
	
	
	
	public void newservicecall()
	{
		try 
		{
			createservicecall.click();
			Thread.sleep(1000);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void clientdetails()
	{
		try 
		{
			clientname.sendKeys(Base.getProperties().getProperty("Clientname"));
			Thread.sleep(1000);
			bodhi.click();
			Thread.sleep(5000);
			issuereported.click();
			issuereported1.sendKeys(Base.getProperties().getProperty("Issuereported"));
			issuereporteddone.click();
			createSC.click();
			Thread.sleep(5000);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void validationsccreated()
	{
		try
		{
			WebElement reqpay = requestpayment;
			
			if(reqpay.isDisplayed())
			{
				Assert.assertTrue("Request payment element should be displayed", reqpay.isDisplayed());
			} 
			else
			{
				Assert.assertTrue(false);
				System.out.println("Request payment element is not displayed as expected.");
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void scrollpage()
	{
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor) Base.getdriver();
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void scheduleSC()
	{
		try
		{
			schedule9to5.click();
			allavailableresource.click();
			Thread.sleep(1000);
			allresource.click();
			Ajai.click();
			SCschedule.click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void validatescchedule()
	{
		try
		{
			WebElement rs = reschedule;
			
			if(rs.isDisplayed())
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.fail("Service call scheduled Validation failed");
			}
			
		}

		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void worksummary()
	{
		try
		{
			worksummary.click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void addlabor()
	{
		try
		{
			labortime.click();
			Thread.sleep(2000);
			addloabor.click();
			labortype.click();
			Thread.sleep(5000);
			june22.click();			
			Thread.sleep(2000);
			
			/*List <WebElement> laborslist = Base.getdriver().findElements(By.xpath("//ng-dropdown-panel[@role='listbox']"));
			
			for(WebElement labors : laborslist)
			{
				String laborname = labors.getText();
				
				if(laborname.equals("Standard Service"))
				{
					labors.click();
					break;
				}
				
			}*/
			
			laboradd.click();
			Thread.sleep(1000);
			laborclosebtn.click();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void laborvalidation()
	{
		try
		{
			String tmsg = toastmsg.getText();
			
			if(tmsg.equals("Labor added"))
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.fail("Labor Added validation Failed");
			}
			
			 /*WebElement total = labortotal;
			
			 String laborprice = total.getText().trim();
			 
			 laborprice = laborprice.replaceAll("[^\\d]", "");
			 
			 int ttl = Integer.parseInt(laborprice);
			 
			 if(ttl > 0)
			 {
				 Assert.assertTrue(true);
			 }
			 else 
			 {
				 Assert.assertTrue(false);
			 }*/
			
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void truckroolfee()
	{
		try
		{
			truckrollfee.click();
			Thread.sleep(1000);
			truckrollfeevalue.sendKeys(Keys.BACK_SPACE);
			truckrollfeevalue.sendKeys(Base.getProperties().getProperty("Truckrollfee"));
			
			/*List <WebElement> tax = driver.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']"));
			
			for(WebElement tax1 : tax)
			{
				String taxvalue = tax1.getText();
				
				if(taxvalue.equals("Sales Tax"))
				{
					tax1.click();
					break;
				}
			}*/
			
			truckrollfeetax.click();
			salestax.click();
			Thread.sleep(2000);
			Base.Enter();
			//labortotal.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void truckrollfeevalidation()
	{
		try
		{
			String tmsg = toastmsg.getText();
			
			if(tmsg.equals("Truck roll fee updated"))
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.fail("Truck Roll Fee Validation failed");
			}
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void drivetimefee()
	{
		try
		{
			drivetimefee.click();
			Thread.sleep(1000);
			drivetimefeevalue.sendKeys(Keys.BACK_SPACE);
			drivetimefeevalue.sendKeys(Base.getProperties().getProperty("Drivetimefee"));
			//labortotal.click();
			truckrollfeetax.click();
			salestax.click();
			Thread.sleep(2000);
			Base.Enter();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void validationdrivetime()
	{
		try
		{
			String tmsg = toastmsg.getText();
			
			if(tmsg.equals("Drive time fee updated"))
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.fail("Drive time fee Validation failed");
			}
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void timeenrtry()
	{
		JavascriptExecutor js = (JavascriptExecutor) Base.getdriver();
		Actions act = new Actions(Base.getdriver());
		
		try
		{
			SCtimeentry.click();
			Thread.sleep(2000);
			starttime.click();
			act.moveToElement(timedrop);
			js.executeScript("window.scrollBy(0, 1000)");
			sevenam.click();
			endtime.click();
			act.moveToElement(timedrop);
			js.executeScript("window.scrollBy(0, 1000)");
			threepm.click();
			TElabortype.click();
			Thread.sleep(2000);
			task.click();
			timenetryadd.click();
			Thread.sleep(2000);
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void timenetryvalidate()
	{
		String tomsg = toastmsg.getText();
		
		try
		{
			if(tomsg.equals("Time entry added"))
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
	
	public void addrepairitem()
	{
		try
		{
			SCaddproduct.click();
			Thread.sleep(2000);
			Repairproduct.click();
			Thread.sleep(2000);
			itemsearch.sendKeys(Base.getProperties().getProperty("scitemname"));
			Thread.sleep(2000);
			firstitem.click();
			Thread.sleep(2000);
			additem.click();
			Thread.sleep(2000);
			add.click();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void itemvalidate()
	{
		String tomsg = toastmsg.getText();
		
		try
		{
			if(tomsg.equals("Product added"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail("Toast Message Missing or Item not added");
			}
			//
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void replaceitem()
	{
		try
		{
			SCaddproduct.click();
			Thread.sleep(2000);
			replaceproduct.click();
			Thread.sleep(2000);
			itemsearch.sendKeys(Base.getProperties().getProperty("scitemname"));
			Thread.sleep(2000);
			firstitem.click();
			Thread.sleep(2000);
			additem.click();
			Thread.sleep(2000);
			next.click();
			itemsearch.sendKeys(Base.getProperties().getProperty("SCreplaceitem"));
			Thread.sleep(2000);
			firstitem.click();
			Thread.sleep(2000);
			additem.click();
			Thread.sleep(2000);
			add.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void additionalitem()
	{
		try
		{
			SCaddproduct.click();
			Thread.sleep(2000);
			Repairproduct.click();
			Thread.sleep(2000);
			itemsearch.sendKeys(Base.getProperties().getProperty("scitemname"));
			Thread.sleep(2000);
			firstitem.click();
			Thread.sleep(2000);
			additem.click();
			Thread.sleep(2000);
			add.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void paymentrequest()
	{
		try
		{
			requestpayment.click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void setterms()
	{
		try
		{
			/*terms.click();
			Thread.sleep(2000);
			dueuponreceipt.click();*/
			paymentreqcreate.click();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void paymentreqvalidate()
	{
		WebElement servicecallnumber = scnumber;
		
		try
		{
			if(servicecallnumber.isDisplayed())
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.fail("Payment Request Creation Faild");
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void backtodashboard()
	{
		try
		{
			backicon.click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
