package com.CRM.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass {
	@BeforeClass
	public void pageSetup()
	{
		hp.getStatusOfLink();
	}
  @Test
  public void validateLogin()
  {
	  String url = lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(url.contains("customers"),"Login Fail");
	  System.out.println("Login success");
	  
  }
}
