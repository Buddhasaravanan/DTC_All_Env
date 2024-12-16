package stepDefinitions;


import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks 
{
	WebDriver driver;
	Properties p;
	
	@Before
	public void setup()
	{
		
	}
	
	public void teardown()
	{
		
	}
	
    @AfterStep
	public void addscreenshot(Scenario scenario) {
	    if (scenario.isFailed() && driver != null) {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshot, "image/png", scenario.getName());
	    }
	}

}
