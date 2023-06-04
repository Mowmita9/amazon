package Steps;



import org.testng.Assert;

import Common.AmazonBase;
import Pages.AmazonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginToAmazonAccount extends AmazonBase {
	
	
	///i am outy;
	AmazonPage ap;
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
		launchBrowser();
	}

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
	    ap = new AmazonPage(driver);
	    ap.clickOnSignInButton();
		
	}

	@When("i enter the {string} in user input field")
	public void i_enter_the_in_user_input_field(String user_name) {
	   
		ap = new AmazonPage(driver);
		ap.enterEmailAddress(user_name);
	}

	@When("i enter the {string} in password input field")
	public void i_enter_the_in_password_input_field(String string) {
	    
		ap = new AmazonPage(driver);
		ap.enterpassword(string);
		ap.clickonSignIn();
	}

	@Then("i can login to my amazon account successfully")
	public void i_can_login_to_my_amazon_account_successfully() {
	   
		ap = new AmazonPage(driver);
		Assert.assertEquals(ap.verifyAmazonAccount(), "Hello, Mowmita");
		
	}


	


}
