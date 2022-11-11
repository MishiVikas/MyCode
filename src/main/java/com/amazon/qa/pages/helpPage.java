package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class helpPage extends TestBase
{
	@FindBy (xpath = "//h2[text()='Search our help library']")
	private WebElement helpLinkValidation;
	
	public boolean validationOfConditionsOfUseLink()
	{	  
	  return helpLinkValidation.isDisplayed();	  
	}
	
	
//	Constructor of SignInpage
	public helpPage(WebDriver driver)
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
