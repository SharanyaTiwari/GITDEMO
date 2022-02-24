package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	
	//function to send the text in textbox
	public void sendKeys(By element, String text) throws Exception {
	    try {    
	    	try {
				driver.findElement(element).sendKeys(text);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	      
	    } catch (NoSuchElementException e) {
	      
	      throw new Exception("Error in entering text in field " );
	    }
	  }
	
	
	
	public String verifyContentOnPage(By element)
	{
		return driver.findElement(element).getText();
		
	}
}
