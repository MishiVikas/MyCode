package com.amazon.qa.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignInPage;
import com.amazon.qa.util.Uitility;
import com.beust.jcommander.Parameter;

public class TestBase 
{  
	private static final String browser = null;
	public WebDriver driver ;
	public HomePage homepage;
	public SignInPage singIn;
	public Uitility util;
	
	Logger log = Logger.getLogger("com.amazon");
	

		
	
	  @BeforeMethod  
	   	public void SetUp()
		  	{
		 
	     	    System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");	
	    	    driver = new ChromeDriver();
	 
		  		driver.manage().deleteAllCookies();
		  		driver.manage().window().maximize();
		  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  		driver.get("https://www.amazon.com/");	
		  		homepage = new HomePage(driver);
		  	    singIn	= homepage.homeSignInBtnClick();
		  	    util = new Uitility (driver);
		  	}
	
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
  		
}
		
	
	



