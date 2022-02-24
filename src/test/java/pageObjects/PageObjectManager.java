package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	public Loginpage loginpage;
	public PasswordEntryPage passwordEntryPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}	
	
	public LandingPage getLandingPage()
	{
	
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public OffersPage OffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
	
	public Loginpage getLoginpage()
	{
	
		loginpage= new Loginpage(driver);
	    return loginpage;
	}
	
	public PasswordEntryPage getPasswordEntryPage()
	{
	
		passwordEntryPage= new PasswordEntryPage(driver);
	    return passwordEntryPage;
	}
}
