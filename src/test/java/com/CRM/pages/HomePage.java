package com.CRM.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	//Encapsulation = private data + public method
	private WebDriver driver;           //Initialize driver
	
	public HomePage(WebDriver driver) //this is base class driver
	{
		this.driver = driver; // light blue - local driver , dark blue - base driver
	}

	//Locator
	private By link = By.linkText("Sign In");	

	//methods
	public String getAppUrl()  	
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
}
