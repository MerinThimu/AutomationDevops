package com.CRM.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;           //Initialize driver
	}
	//locators
	 private By email = By.id("email-id");
	 private By password = By.id("password");
	 private By submit = By.id("submit-id");
	 		
	 //methods
	 public String doLogin(String em,String pw)
	 {
		 driver.findElement(email).sendKeys(em);
		 driver.findElement(password).sendKeys(pw);
		 driver.findElement(submit).click();
		 
		 return driver.getCurrentUrl();
	 }

}
