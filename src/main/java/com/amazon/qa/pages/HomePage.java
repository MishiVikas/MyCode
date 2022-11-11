package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase
{	
	private Actions action;

	@FindBy (id = "nav-link-accountList-nav-line-1")	
	private WebElement helloSignIn;
	
	@FindBy (linkText = "Sign in")
	private WebElement signIn;
	
	@FindBy (xpath = "//a[@id='nav-link-accountList']")
	private WebElement accountAndList;
	
	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy (xpath = "//span[text()='Hello, vikas']")
	private WebElement afterSignIn;
	
	@FindBy (xpath = "//span[text()='Hello, sign in']")
	private WebElement beforeSignIn;
	
	@FindBy (xpath = "//form[@id='nav-search-bar-form']")
	private WebElement searchBox;
	
//	Constructor of Home page	
	public HomePage(WebDriver driver)
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void Searchbox()
	{	
		searchBox.sendKeys("Hii");
	}
	
	public SignInPage homeSignInBtnClick()
	{
		action.moveToElement(helloSignIn).build().perform();
		signIn.click();	
		return new SignInPage(driver);
	}	
	
	public boolean HomePageValidation()
	{
		return afterSignIn.isDisplayed();
	}
	
	public void logout()
	{
		action.moveToElement(accountAndList).build().perform();
		signOut.click();	
	}
	
	

}
