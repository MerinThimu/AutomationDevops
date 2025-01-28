package com.CRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTestCase extends BaseClass
{
  @Test(priority = 1)
  public void verifyUrl() 
  {
	 
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test fail Url not matched!"); //if fail it will print text
	  System.out.println("Test pass: Url matched!");
  }
  @Test(priority = 2)
  public void verifyTitle() 
  {
	  String actTitle = hp.getAppTitle();
      Assert.assertTrue(actTitle.contains("Customer Service"), "Title not matched!");
      System.out.println("Title matched!");
  }
  @Test(priority = 3)
  public void validateSigninLink() 
  {
	 String nextPageUrl = hp.getStatusOfLink();
	 Assert.assertTrue(nextPageUrl.contains("login"),"Test fail : Login page not open");
	 System.out.println("Test Pass! App navigating to login page");
  }
}
