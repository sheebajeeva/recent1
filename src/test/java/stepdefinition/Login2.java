package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {
	@Given("open newtours app")
	public void open_newtours_app() {
		System.out.println("user opens newtours application");
	    
	}

	@When("user enters un as {string} and psd as {string}")
	public void user_enters_un_as_and_psd_as(String un, String psd) {
		System.out.println("enters the un as"+un+"and psd as"+psd+"of application");
	   
	}

	@When("submit login form")
	public void submit_login_form() {
		System.out.println("click login");
	    
	}

	@Then("verify pass")
	public void verify_pass() {
		System.out.println("pass");
	    
	}

	@Then("verify failure")
	public void verify_failure() {
		System.out.println("fail");
	    
	}

}
