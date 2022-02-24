package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.Loginpage;
import pageObjects.PasswordEntryPage;
import utils.TestContextSetup;

public class AmazonPasswordPage {
	
	public WebDriver driver;
	PasswordEntryPage passwordEntryPage;
	TestContextSetup testContextSetup;
	Loginpage loginpage;
	
	public AmazonPasswordPage(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.passwordEntryPage = testContextSetup.pageObjectManager.getPasswordEntryPage();
		this.loginpage =testContextSetup.pageObjectManager.getLoginpage();
	}
	
	 @Then("^User navigate to password testbox page and put password value (.+)$")
	    public void user_navigate_to_password_testbox_page_and_put_password_value(String password) throws Throwable {
	    	testContextSetup.genericUtils.sendKeys(passwordEntryPage.passwdTextBox, password); 
	       	System.out.println("on password page");
	    	loginpage.ContinueButtonClick(passwordEntryPage.signinButton);
	    }

}
