package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class InventoryTest extends BaseTest
{
    @BeforeClass
    public void pageSetUp()
    {lp.doLogin("standard_user", "secret_sauce");}
    
	
  @Test (priority=1)
  public void validateProdcutCount() 
  {  
	  int count =ip.getTotalProductCount();
	  Assert.assertEquals(count,6,"Product count is not matched");
      System.out.println("Product count is matched and Total products are" +count);
  }
  

  @Test (priority=2)
  public void validateProdcutDetails() 
  {
	  ip.getProductDetails();
  }
  
  
  @Test (priority=3)
  public void validatAddToCart() 
  { 
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
	  //ip.addProductToCart(prop.getData("pname1"));
  }
  
  
  @Test (priority=4)
  public void validateCartPageInit() 
  { 
	  ip.openCartpage();
  
  }
  
  




}
