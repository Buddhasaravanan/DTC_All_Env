package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Pages.Login_Page;
import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps
{
	
	@Given("the user should be navigate to login page")
	public void the_user_should_be_navigate_to_login_page() throws IOException, InterruptedException 
	{
	    Base.initilizebrowser();
	}

	@When("the user entering valid login credentials")
	public void the_user_entering_valid_login_credentials() throws IOException, InterruptedException 
	{
		Login_Page lp = new Login_Page(Base.getdriver());
	    lp.Login();
	}

	@When("the user click sign in button")
	public void the_user_click_sign_in_button() 
	{
		Login_Page lp = new Login_Page(Base.getdriver());
	    lp.login_btn();
	}

	@When("the user select the company")
	public void the_user_select_the_company() 
	{
		Login_Page lp = new Login_Page(Base.getdriver());
	    lp.choosecompany();
	}

	@Then("the user should navigate to dashboard page")
	public void the_user_should_navigate_to_dashboard_page() 
	{
		Login_Page lp = new Login_Page(Base.getdriver());
	    lp.logintitle();
	}

}
