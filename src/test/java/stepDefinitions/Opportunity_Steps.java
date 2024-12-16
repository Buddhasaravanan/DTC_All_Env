package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;

import Pages.Opportunity_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opportunity_Steps 
{
	Opportunity_Page cnp = new Opportunity_Page(Base.getdriver());
	
	@When("the user click opportunity from main menu")
	public void the_user_click_opportunity_from_main_menu() 
	{
	    cnp.click_opportunity();
	}

	@When("the user click new opportunity button")
	public void the_user_click_new_opportunity_button() 
	{
	    cnp.click_newopportunity();
	}

	@When("the user entring opportunity name")
	public void the_user_entring_opportunity_name() throws IOException 
	{
	    cnp.oppname();
	}
	
	@When("the user select bulding type")
	public void the_user_select_bulding_type()
	{
	    cnp.residential();
	}
	
	@When("the user entering budget of opportunity")
	public void the_user_entering_budget_of_opportunity() throws IOException 
	{
	   cnp.budget();
	}
	
	@When("the user entering sqfeet of opportunity")
	public void the_user_entering_sqfeet_of_opportunity() throws IOException 
	{
	    cnp.Sqfeet();
	}

	@When("the user select project type and market type")
	public void the_user_select_project_type_and_market_type() 
	{
	    cnp.projectype();
	    cnp.markettype();
	}
	
	@When("the user select quote type")
	public void the_user_select_quote_type() throws InterruptedException 
	{
	   cnp.quotetype();
	   cnp.NXTbtn();
	}
	
	
	@When("the user entering client name")
	public void the_user_entering_client_name() throws IOException, InterruptedException, AWTException 
	{
	    cnp.client();
	}

	@When("the user click next button")
	public void the_user_click_next_button() throws InterruptedException 
	{
	   cnp.NXTbtn();
	}


	@When("the user click create button")
	public void the_user_click_create_button() throws InterruptedException 
	{
	    cnp.createopp();
	}

	@Then("validate the opportunity created or not")
	public void validate_the_opportunity_created_or_not() 
	{
	    Assert.assertEquals(cnp.createoppvalidation(), true);
	}
	
	
	

}
