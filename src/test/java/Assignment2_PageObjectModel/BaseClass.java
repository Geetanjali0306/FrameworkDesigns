package Assignment2_PageObjectModel;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import Assignment2_PageObjectModel.LoginPage;


public class BaseClass 
{
	    public WebDriver driver;
	    public LoginPage lp;
	    
	     
	     	@BeforeMethod
		
		public void setUp()
		{
	    	 driver = new ChromeDriver();
	    	 
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 
	    	 driver.get("https://www.saucedemo.com/");
	    	 
	    	 lp = new LoginPage(driver); 	 
	    	 
		}

}

