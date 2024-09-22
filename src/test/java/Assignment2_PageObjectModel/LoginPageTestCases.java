package Assignment2_PageObjectModel;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginPageTestCases extends BaseClass
{  @Test (priority=1)
     public void verifyUrl() 
       {                 String url = lp.getAppUrl();
              Assert.assertTrue(url.contains("saucedemo"),"URL is invalid");
	                   System.out.println("URL is valid :"+ url);                     }
  
  @Test (priority=2)
  public void verifyTitle() 
    {                  String title = lp.getAppTitle();
              Assert.assertTrue(title.contains("Swag Labs"),"Title is invalid");
	                   System.out.println("Title is valid :"+ title);                 }
  
  @Test (priority=3)
  public void verifywithValidCredentials() 
    {                      lp.doLogin("standard_user","secret_sauce");
          Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Error - Login failed");
	                    System.out.println("Logged in successfully with Valid credentials");                }
 
  @Test (priority=4)
  public void verifywithInvalidUsername() 
    {                        lp.doLogin("user123","secret_sauce");
          Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),"test case failed username");
	                    System.out.println("Login failed due to Invalid Username");                         }
  
  @Test (priority=5)
  public void verifywithInValidPassword() 
    {                       lp.doLogin("standard_user","secret_secret");
          Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),"testcase failed");
	                    System.out.println("Login failed due to Invalid Password");                         }
  
}
