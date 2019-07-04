package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login3 {
	@Given("open signup page")
	public void open_signup_page() {
		System.out.println("open signup page");
	    
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
		System.out.println("firstname is"+fn);
	    
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		System.out.println("lastname is"+ln);
	    
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
	    System.out.println("dob is"+dob);
	}

	@When("user enters psd as {string}")
	public void user_enters_psd_as(String psd) {
	   System.out.println("password is"+psd);
	}

	@When("user enters cpsd as {string}")
	public void user_enters_cpsd_as(String cpsd) {
	System.out.println("confirm password is"+cpsd);  
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println(" signup ");
	    	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
		System.out.println("success");
	  	}


}
