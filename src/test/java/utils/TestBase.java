package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LandingPage;

public class TestBase {

	public WebDriver driver;
	public String url;	
	
	public WebDriver WebDriverManager() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);		
		String env = prop.getProperty("environmentSelect");	
		System.out.println(env        +"env variable is fetched as");
				
		
		
		  if(env.equalsIgnoreCase("STE")){ 
			 url = prop.getProperty("QAUrl");
		  System.out.println(url +"url variable is fetched as in if loop");
		  
		  } if(env.equalsIgnoreCase("UAt"))
		  { url = prop.getProperty("QAUrlst");
		  System.out.println(url +"url variable is fetched as in if loop"); }
		 
		
		//String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();// driver gets the life
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println(url   +"+++++++++++++++++++++++++++++++++++++++");
			
		driver.get(url);
		}
		
		return driver;
		
	}
		
}

