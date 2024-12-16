package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Pages.CO_Page;
import Pages.Quote_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ChangeOrder_Steps 
{
	
	CO_Page cop = new CO_Page(Base.getdriver());
	Quote_Page qp = new Quote_Page(Base.getdriver());
	
	@When("user navigate change order")
	public void user_navigate_change_order() throws InterruptedException 
	{
	    cop.changeorder();
	}

	@When("user click new change order button")
	public void user_click_new_change_order_button() 
	{
	   cop.createnewchangeorder();
	}

	@When("user select external co and giving a name")
	public void user_select_external_co_and_giving_a_name() throws IOException 
	{
	    cop.nameofco();
	}

	@When("user click create and open change order")
	public void user_click_create_and_open_change_order() 
	{
	    cop.openco();
	}

	@Then("Validate new CO created")
	public void validate_new_co_created() 
	{
		Assert.assertTrue(cop.covalidation());
	}

	@When("user go to new co and select design section")
	public void user_go_to_new_co_and_select_design_section() throws InterruptedException 
	{
	   cop.designsection();;
	}

	@When("user remove original item with keep accessory")
	public void user_remove_original_item_with_keep_accessory() throws InterruptedException 
	{
	    cop.removeitemwithkeepaccessory();
	}

	@Then("Validate item removed and keep accessory")
	public void validate_item_removed_and_keep_accessory() 
	{
	    Assert.assertEquals(cop.validationremoveitem(), "removed");
	}

	@When("user remove original item keep labor")
	public void user_remove_original_item_keep_labor() throws InterruptedException 
	{
	    cop.keeplabor();
	}

	@Then("Validate keep labor")
	public void validate_keep_labor() 
	{
		Assert.assertEquals(cop.validationkeeplabor(), "removed");
	}

	@When("user add item to change order")
	public void user_add_item_to_change_order() throws IOException, InterruptedException 
	{
	    qp.serach_item();
	    qp.add_item();
	}

	@Then("Validate add item to CO")
	public void validate_add_item_to_co() 
	{
		Assert.assertEquals(qp.itemvalidation(), "items added");
	}

	@When("user copy item to all location")
	public void user_copy_item_to_all_location() 
	{
	    cop.copyitem();
	}

	@Then("Validate copy item")
	public void validate_copy_item() 
	{
		Assert.assertEquals(cop.copyitemvalidation(), "Items copied to locations");
	}

	@When("user replace the item")
	public void user_replace_the_item() throws InterruptedException, IOException 
	{
	  cop.replace();
	}

	@Then("Validate replace item")
	public void validate_replace_item() 
	{
		Assert.assertEquals(cop.replacevalidation(), "Bell 5173-0");
	}

	@When("user create proposal")
	public void user_create_proposal() throws InterruptedException 
	{
	    qp.createmultimeadiaproposal();
	}

	@Then("Validate proposal created")
	public void validate_proposal_created() 
	{
	    Assert.assertTrue(true);
	}

	@When("user accept the change order")
	public void user_accept_the_change_order() throws IOException, InterruptedException 
	{
	    qp.presentproposal();
	}

	@Then("Validate accepted CO")
	public void validate_accepted_co() 
	{
		 Assert.assertTrue(true);
	}

	@When("user select internal co and giving a name")
	public void user_select_internal_co_and_giving_a_name() throws IOException 
	{
	    cop.createinternalco();
	}

	@Then("Validate new internal CO created")
	public void validate_new_internal_co_created() 
	{
		Assert.assertTrue(cop.internalcovalidation());
	}

	@Then("user add item")
	public void user_add_item() throws IOException, InterruptedException 
	{
		qp.serach_item();
	    qp.add_item();
	}

	@Then("Validate item added to CO")
	public void validate_item_added_to_co() 
	{
		Assert.assertEquals(qp.itemvalidation(), "items added");
	}

	@When("user approve the internal CO")
	public void user_approve_the_internal_co() throws InterruptedException 
	{
	    cop.approveinternalco();
	}
	
	@When("user back to CO dashboard")
	public void user_back_to_co_dashboard() throws InterruptedException 
	{
	    cop.coback();
	}

	
	
	
}
