package com.amazon.qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignInPage;
import com.amazon.qa.util.Uitility;

public class TC_01LoginFunctionality extends TestBase
{		
    

	@Test
	public void signInWithValidCredentials() throws IOException
	{		  
		singIn.login("mishravikas128@gmail.com", "9766404287");
	    boolean hp = homepage.HomePageValidation();	    
	    util.getScreenshot("amazonLoginValidation");
	    Assert.assertTrue(hp);	
	}

}
