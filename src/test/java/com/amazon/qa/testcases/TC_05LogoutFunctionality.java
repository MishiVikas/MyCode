package com.amazon.qa.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amazon.qa.base.TestBase;

public class TC_05LogoutFunctionality extends TestBase
{
	@Test 
	public void VarifyLogoutFuntionality()
	{
		singIn.login("mishravikas128@gmail.com", "9766404287");
		boolean loginVarification = homepage.HomePageValidation();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(loginVarification);;
		homepage.logout();
		boolean VerifyLogout= singIn.validateLogout();
		soft.assertTrue(VerifyLogout);;
		soft.assertAll();	
	}
}
