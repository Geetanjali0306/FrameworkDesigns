package Assignment2_PageObjectModel;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class LoginPage
{  private WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{    this.driver = driver;  }
	
	//locators
	    By uname = By.id("user-name");
	    By pass = By.name("password");
	    By loginBtn = By.id("login-button");	
	    By logoutBtn = By.id ("logout_sidebar_link");    
	
	//ActionMethods		
	    public String getAppUrl()
	       {   return driver.getCurrentUrl();  }
	
	    public String getAppTitle()
	       {    return driver.getTitle();      }
	    
	    public void setUserName(String UN)
		{       driver.findElement(uname).sendKeys(UN);   }
		
	    public void setPassword(String PWD)
		{       driver.findElement(pass).sendKeys(PWD);   }
	    
	    public  void doLogin (String UN, String PWD)
	       {
	    	    driver.findElement(uname).sendKeys(UN);
				driver.findElement(pass).sendKeys(PWD);
	    	    driver.findElement(loginBtn).click();  
	       }
   
	    public void logout()
	    {        driver.findElement(logoutBtn).click();   }
    
}
     

	








	

