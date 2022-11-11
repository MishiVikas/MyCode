package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HelpAndServicePage extends TestBase
{
	@FindBy (xpath = "//a[text()= 'All Help Topics']")
	private WebElement AllHelpTopicsLink;
	
	public boolean validationOfConditionsOfUseLink()
	{	  
	  return AllHelpTopicsLink.isDisplayed();	  
	}
	
//	Constructor of SignInpage
	public HelpAndServicePage(WebDriver driver)
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
