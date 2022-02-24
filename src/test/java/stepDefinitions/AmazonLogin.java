package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Loginpage;
import pageObjects.PasswordEntryPage;
import utils.TestContextSetup;

public class AmazonLogin {
	
	public WebDriver driver;
	Loginpage loginpage;
	PasswordEntryPage passwordEntryPage;
	TestContextSetup testContextSetup;

	public AmazonLogin(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginpage =testContextSetup.pageObjectManager.getLoginpage();
	}
	
	 @Given("^User is on Amazon page$")
	    public void user_is_on_amazon_page() throws Throwable {		 
	    
		Assert.assertTrue(testContextSetup.genericUtils.verifyContentOnPage(loginpage.logintextverify).contains("Email or mobile phone number"));
			    
	}

	 @When("^user put the input value (.+) and details as given$")
	    public void user_put_the_input_value_and_details_as_given(String name) throws Throwable {
	   
	   // loginpage.sendKeys(loginpage.userNamePass,name);loginTextBox
		 testContextSetup.genericUtils.sendKeys(loginpage.loginTextBox, name);
		 
	  }	 

	    @And("^Then click on Button$")
	    public void then_click_on_button() throws Throwable {
	        loginpage.ContinueButtonClick(loginpage.loginButton);
	    }
}
