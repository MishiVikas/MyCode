package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignInPage extends TestBase
{
	
	@FindBy (xpath = "//h1[@class= 'a-spacing-small']")
	private WebElement SignInText;
	
	@FindBy (xpath = "//input[@name= 'email']")
	private WebElement email_ID;
	
	@FindBy (xpath = "//input[@id= 'continue']")
	private WebElement continueBtn;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement signIn;
	
	@FindBy (xpath = "(//a[@class= 'a-link-normal'])[4]")
	private WebElement conditionsOfUseLink;
	
	@FindBy (xpath = "(//a[@class= 'a-link-normal'])[5]")
	private WebElement prvateNoticeLink;
	
	@FindBy (xpath = "(//a[@class= 'a-link-normal'])[6]")
	private WebElement helpLink;
		
//	Constructor of SignInpage
	public SignInPage(WebDriver driver)
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  
 
	public HelpAndServicePage clickOnConditionsOfUseLink()
	{
	  conditionsOfUseLink.click();
	  return new HelpAndServicePage (driver);	 	  
	}
	
	public boolean validateLogout()
	{
		return  helpLink.isDisplayed();
	}
	
	public helpPage ClickOnHelpLink()
	{
		helpLink.click();
		return new helpPage (driver);
	
	}
	public HelpAndServicePage ClickOnPrivateNoticeLink()
	{
		prvateNoticeLink.click();
		return new HelpAndServicePage (driver);
	 
	}	
	
	
	public void login(String email, String pass)
	{
		email_ID.sendKeys(email);
		continueBtn.click();
		password.sendKeys(pass);
		signIn.click();	  
	}

	
	
	
}
