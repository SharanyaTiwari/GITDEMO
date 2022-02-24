package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	public WebDriver driver;

	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public By loginTextBox = By.xpath("//*[@id='ap_email']");
		
	public By loginButton =By.xpath("//*[@id='continue']");
	public By logintextverify=By.xpath("//*[@id='authportal-main-section']/div[2]/div/div[1]/form/div/div/div/div[1]/label");
	public By signinText = By.xpath("//*[@id='authportal-main-section']/div[2]/div/div[1]/form/div/div/div/h1");
	
			
	public void ContinueButtonClick(By element)
	{
		driver.findElement(element).click();		
	}
	
	public Boolean VerifyTextContent()
	{
		return driver.findElement(signinText).isDisplayed();		
	}
	
	public String getTitleLandingPageAmazon()
	{
		return driver.getTitle();
	}
	
	public String verifyContent()
	{
		return driver.findElement(logintextverify).getText();		
	}	
}
