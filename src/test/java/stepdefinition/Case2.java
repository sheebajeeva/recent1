package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case2 {
	WebDriver driver;
	@Given("users open the application")
	public void users_open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters the un as {string}")
	public void user_enters_the_un_as(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	    
	}

	@When("user enters the psd as {string}")
	public void user_enters_the_psd_as(String password) {
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.name("Login")).click();
	}

	@Then("close the application")
	public void close_the_application() {
		driver.close();
	    System.out.println("application closed");
	}


}
