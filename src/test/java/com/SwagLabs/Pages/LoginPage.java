package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.SwagLabs.baseTest.BaseTest;

public class LoginPage 
{
	
	WebDriver driver;
	public LoginPage(WebDriver driver) //from base class
	{
		this.driver = driver;
		//initialization 
		PageFactory.initElements(driver,this);
		
	}
	
	//locators
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement btn;
	
	//ActionMethods
	
	public String getAppUrl()
	{   return  driver.getCurrentUrl();   }
	
	
	public String getAppTitle()
	{    return driver.getTitle();    }
	
	
	public InventoryPage doLogin(String un, String pswd)
	{
		uname.sendKeys(un);
		password.sendKeys(pswd);
		btn.click();
		//after login , link to next page
		return new InventoryPage(driver);
     }
	
	
	

}
