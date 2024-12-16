package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Pages.Project_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Project_Steps 
{
	
	Project_Page prp = new Project_Page(Base.getdriver());
	
	@When("the user go to plan section")
	public void the_user_go_to_plan_section() 
	{
	    prp.plan();
	}

	@When("the user naviagte to task page")
	public void the_user_naviagte_to_task_page() throws InterruptedException 
	{
	    prp.task();
	}

	@When("the user create task")
	public void the_user_create_task() throws IOException, InterruptedException 
	{
	   prp.createtask();
	}

	@Then("validate task has been created")
	public void validate_task_has_been_created() 
	{
	    Assert.assertTrue(prp.validatetask());
	}

	@When("the user create new task group")
	public void the_user_create_new_task_group() throws IOException 
	{
	    prp.createtaskgroup();
	}

	@Then("validate task group has been created")
	public void validate_task_group_has_been_created() 
	{
	   Assert.assertEquals("Task group created", prp.validationtaskgroup(), prp.validationtaskgroup());
	}

	@When("the user create new task from newly created task group")
	public void the_user_create_new_task_from_newly_created_task_group() throws IOException, InterruptedException 
	{
		prp.newtaskgrouptask();
	}

	@When("the user edit the task")
	public void the_user_edit_the_task() throws InterruptedException 
	{
	    prp.edittask();
	}
	@When("the user create check list")
	public void the_user_create_check_list() throws IOException 
	{
	    prp.checklist();
	}

	@Then("validate check list has created")
	public void validate_check_list_has_created() 
	{
	    
		Assert.assertEquals("Checklist created", prp.CHLvalidation(), prp.CHLvalidation());
	}

	@When("the user add items to the task")
	public void the_user_add_items_to_the_task() 
	{
	    prp.additem();
	}

	@Then("validate items are added to task")
	public void validate_items_are_added_to_task() 
	{
		Assert.assertEquals("Item added", prp.addeditemvalidation(), prp.addeditemvalidation());
	}

	@When("the user close the task")
	public void the_user_close_the_task() 
	{
	    prp.taskclose();
	}

	@When("the user click schedule button from created task")
	public void the_user_click_schedule_button_from_created_task() 
	{
	    prp.clickschedulebutton();
	    prp.schedulecreatebtn();
	}

	@Then("validate schedule has been created")
	public void validate_schedule_has_been_created() 
	{
		Assert.assertEquals("Event created", prp.schudulevalidation(), prp.schudulevalidation());
	}

	@When("the user go to time tracking section")
	public void the_user_go_to_time_tracking_section() throws InterruptedException 
	{
	    prp.timetracking();
	}

	@When("the user add new time entry")
	public void the_user_add_new_time_entry() throws InterruptedException 
	{
	    prp.timeentry();
	}

	@Then("validate time entry added or not")
	public void validate_time_entry_added_or_not() 
	{
		Assert.assertEquals("Time entry added", prp.timeentryvalidation(), prp.timeentryvalidation());
	}

	@When("the user go to project overview page")
	public void the_user_go_to_project_overview_page() throws InterruptedException 
	{
	    prp.projectoverviewpage();
	}

	@When("the user go to payment page")
	public void the_user_go_to_payment_page() 
	{
	    prp.paymentpage();
	}

	@When("the user crete new payment request")
	public void the_user_crete_new_payment_request() throws InterruptedException 
	{
	    prp.cretenewpayment();
	}

	@Then("validate payment request created as per given data")
	public void validate_payment_request_created_as_per_given_data() 
	{
		Assert.assertTrue(prp.validatenewpayment());
	}

	@When("the user share payment request via email")
	public void the_user_share_payment_request_via_email() throws InterruptedException, IOException 
	{
	    prp.sharepayment();
	}

	@Then("validate payemnt shared or not")
	public void validate_payemnt_shared_or_not() 
	{
		Assert.assertEquals("Payment shared", prp.paymentemailsharevalidation(), prp.paymentemailsharevalidation());
	}

	@When("the user mark payment stats as paid")
	public void the_user_mark_payment_stats_as_paid() throws InterruptedException 
	{
	   prp.paymentstatus();
	}

	@Then("validate payment summary section")
	public void validate_payment_summary_section() 
	{
	    prp.paymentsummaryvalidation();
	}

}
