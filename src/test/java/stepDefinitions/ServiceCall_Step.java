package stepDefinitions;

import java.io.IOException;

import Pages.Project_Page;
import Pages.ServiceCall_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceCall_Step 
{
	ServiceCall_Page sc = new ServiceCall_Page(Base.getdriver());
	Project_Page pp = new Project_Page(Base.getdriver());
	

	@When("user navigate to service call page")
	public void user_navigate_to_service_call_page() 
	{
	    sc.servicecallpage();
	}
	
	@When("user create new service call")
	public void user_create_new_service_call() 
	{
	    sc.newservicecall();
	}
	
	@When("User enter the client details and click create button")
	public void user_enter_the_client_details_and_click_create_button() 
	{
	    sc.clientdetails();
	}
	
	@Then("validate new service call created")
	public void validate_new_service_call_created() 
	{
	   sc.validationsccreated();
	}
	
	@When("user scroll the page")
	public void user_scroll_the_page() 
	{
	   sc.scrollpage();
	}
	
	@When("user schedule the service call")
	public void user_schedule_the_service_call() 
	{
		sc.scrollpage();
	    sc.scheduleSC();
	}
	
	@Then("validate new schedule created")
	public void validate_new_schedule_created() 
	{
	    sc.validatescchedule();
	}
	
	@When("user navigate to worksummary")
	public void user_navigate_to_worksummary() 
	{
	   sc.worksummary();
	}
	
	@When("user add labor")
	public void user_add_labor() 
	{
		sc.addlabor();
	}
	
	@Then("validate labor added")
	public void validate_labor_added() 
	{
	    sc.laborvalidation();
	}
	
	@Then("user add truk roll fee with tax")
	public void user_add_truk_roll_fee_with_tax() 
	{
	    sc.truckroolfee();
	}
	
	@Then("validate truck roll fee added")
	public void validate_truck_roll_fee_added() 
	{
	   sc.truckrollfeevalidation();
	}
	
	@When("user add drive time fee with tax")
	public void user_add_drive_time_fee_with_tax() 
	{
	   sc.drivetimefee();
	}
	
	@Then("validate drive time fee added")
	public void validate_drive_time_fee_added() 
	{
	    sc.validationdrivetime();
	}
	
	@When("user add service call time entry")
	public void user_add_service_call_time_entry() 
	{
	    sc.timeenrtry();
	}
	
	@Then("validate service call time entry added")
	public void validate_service_call_time_entry_added() 
	{
	    sc.timenetryvalidate();
	}
	
	@When("user add repair product")
	public void user_add_repair_product() 
	{
	   sc.addrepairitem();
	}
	
	@Then("validate item added")
	public void validate_item_added() 
	{
	    sc.itemvalidate();
	}
	
	@When("user add replace product")
	public void user_add_replace_product() 
	{
	   sc.replaceitem();
	}
	
	@Then("validate item replaced")
	public void validate_item_replaced() 
	{
		 sc.itemvalidate();
	}
	
	@When("user add additional product")
	public void user_add_additional_product() 
	{
	    sc.additionalitem();
	}
	
	@When("user create payment request for service call")
	public void user_create_payment_request_for_service_call() 
	{
	    sc.paymentrequest();
	}
	
	@When("user set the terms and create")
	public void user_set_the_terms_and_create() 
	{
	    sc.setterms();
	}
	
	@Then("validate payment request created")
	public void validate_payment_request_created() 
	{
	    sc.paymentreqvalidate();
	}
	
	@When("user share the payment request")
	public void user_share_the_payment_request() throws InterruptedException, IOException 
	{
	   pp.sharepayment();
	}
	
	@Then("validate payment request shared")
	public void validate_payment_request_shared() 
	{
	    pp.paymentemailsharevalidation();
	}
	
	@When("user navigate to present mode")
	public void user_navigate_to_present_mode() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("user make the payment via card")
	public void user_make_the_payment_via_card() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("user back to serviceall dashboard")
	public void user_back_to_serviceall_dashboard() 
	{
	    sc.backtodashboard();
	}

}
