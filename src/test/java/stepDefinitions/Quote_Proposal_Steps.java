package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Pages.Quote_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Quote_Proposal_Steps 
{
	
	Quote_Page qp = new Quote_Page(Base.getdriver());
	
	@When("the user go to new quote and design section")
	public void the_user_go_to_new_quote_and_design_section() throws InterruptedException 
	{
	    qp.click_quote();
	}

	@When("the user search item")
	public void the_user_search_item() throws IOException, InterruptedException 
	{
	    qp.serach_item();
	}

	@When("the user add item to quote")
	public void the_user_add_item_to_quote() throws InterruptedException 
	{
	    qp.add_item();
	}

	@Then("validating item added to quote")
	public void validating_item_added_to_quote() 
	{
	    Assert.assertEquals(qp.itemvalidation(), "Item added");
	}

	@When("the user add accessory to item")
	public void the_user_add_accessory_to_item() throws IOException, InterruptedException 
	{
	    qp.add_accessory();
	}

	@Then("validating accessory added to quote")
	public void validating_accessory_added_to_quote() 
	{
		Assert.assertEquals(qp.itemvalidation(), "Item added");
	}

	@When("the user add new adjestment to quote")
	public void the_user_add_new_adjestment_to_quote() throws IOException, InterruptedException 
	{
	    qp.addadjestment();
	}

	@Then("Validating new adjestment added to quote")
	public void validating_new_adjestment_added_to_quote() 
	{
	    Assert.assertTrue(qp.adjestmentvalidation());
	}

	@When("the user create new optional location")
	public void the_user_create_new_optional_location() throws IOException, InterruptedException 
	{
	    qp.create_optional_location();
	}

	@Then("Validating new optional location created")
	public void validating_new_optional_location_created() 
	{
	    Assert.assertTrue(qp.optionallocationvalidation());
	}

	@When("the user search labor")
	public void the_user_search_labor() throws IOException, InterruptedException 
	{
	    qp.serach_labor();
	}

	@When("the user add labor to quote")
	public void the_user_add_labor_to_quote() 
	{
	    qp.add_labor();
	}

	@Then("Validating labor added to quote")
	public void validating_labor_added_to_quote() 
	{
		Assert.assertEquals(qp.laborvalidation(), "Item added");
	}
	
	@When("the user add exsiting service plan to quote")
	public void the_user_add_exsiting_service_plan_to_quote() 
	{
	    qp.add_service_plan();
	}

	@Then("validating service plan added or not")
	public void validating_service_plan_added_or_not() 
	{
	    
		Assert.assertTrue(qp.serviceplan_validation());      
	}


	@When("the user create new multimedia proposal")
	public void the_user_create_new_multimedia_proposal() throws InterruptedException 
	{
	   qp.createmultimeadiaproposal();
	}

	@When("the user go to present proposal and accept the proposal")
	public void the_user_go_to_present_proposal_and_accept_the_proposal() throws IOException, InterruptedException 
	{
	    qp.presentproposal();
	}
	
	@When("the user make payment via DTP")
	public void the_user_make_payment_via_dtp() 
	{
	    qp.payment();
	}


	@When("the user won the opportunity")
	public void the_user_won_the_opportunity() throws InterruptedException 
	{
	    qp.won_opportunity();
	}

	@Then("Validating new project created")
	public void validating_new_project_created() 
	{
	    Assert.assertTrue(qp.won_opportunity_validation());
	}


}
