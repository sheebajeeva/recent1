package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login4 {
	@Given("application displays welcome message")
	public void application_displays_welcome_message() {
	   System.out.println("welcome");
	}

	@Given("users un and psd")
	public void users_un_and_psd() {
	  System.out.println("username and password is entered");
	}

	@Given("click signin")
	public void click_signin() {
		System.out.println("signin");
	  
	}

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
	    System.out.println("searches for iphone");
	}

	@When("user adding the searched product to cart")
	public void user_adding_the_searched_product_to_cart() {
	  System.out.println("added to cart");
	}

	@When("user performing payment process using netbanking")
	public void user_performing_payment_process_using_netbanking() {
	   System.out.println("paid using netbanking");
	}

	@When("user click on signout button")
	public void user_click_on_signout_button() {
	    System.out.println("signout");
	}


}
