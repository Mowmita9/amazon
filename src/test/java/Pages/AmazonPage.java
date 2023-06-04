package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	
	WebDriver driver; 
	
	public AmazonPage (WebDriver dr) {
		
		driver = dr; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signInButton;
	
	@FindBy(xpath ="//input[@id='ap_email']")
	WebElement emailBox;
	
	@FindBy(xpath ="//input[@id='continue']")
	
	WebElement continueButton;
	

	@FindBy(xpath ="//input[@id='ap_password']")
	WebElement passwordBox;

	@FindBy(xpath ="//input[@id='signInSubmit']")
	WebElement Signin;
	
	@FindBy(xpath ="//span['nav-link-accountList-nav-line-1']")
	WebElement accountName ;
	
	
	
	public void clickOnSignInButton() {
		signInButton.click();
	}
	
	public void enterEmailAddress(String user_name ) {
		
		emailBox.sendKeys(user_name);
		continueButton.click();
		
	}

	
	
	public void enterpassword(String password) {
		
	passwordBox.sendKeys(password);
		
	}
	
	public void clickonSignIn() {
		Signin.click();
	}
	
   public  String verifyAmazonAccount() {
	   
   return accountName.getText();
}
	
}
