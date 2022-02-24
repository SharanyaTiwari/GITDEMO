package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordEntryPage {
	
	public WebDriver driver;

	public PasswordEntryPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public By passwdTextBox = By.xpath("//*[@id='ap_password']");	
	public By signinButton = By.xpath("//*[@id='signInSubmit']");	
		
	//@FindBy(xpath = "//*[@id='ap_email']")
	//public WebElement userNamePass;
}
