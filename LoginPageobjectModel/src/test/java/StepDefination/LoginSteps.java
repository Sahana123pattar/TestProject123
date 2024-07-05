package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("I lounch the browser")
	public void i_lounch_the_browser() {
	 System.out.println("sahana");
	}

	@When("I open the orange hrm")
	public void i_open_the_orange_hrm() {
		 System.out.println("Pattar");
	}

	@Then("I verify logo present or not")
	public void i_verify_logo_present_or_not() {
		 System.out.println("Hubli");
	}

	@And("Close the browser")
	public void close_the_browser() {
		 System.out.println("karnataka");
	}


}
