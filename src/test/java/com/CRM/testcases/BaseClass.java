package com.CRM.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CRM.pages.HomePage;
import com.CRM.pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public HomePage hp;    //object of HomePage class
    public LoginPage lp;   //Object of LoginPage class
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}
