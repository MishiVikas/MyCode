package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.helpPage;

public class TC_03VerifyHelpLink extends TestBase
{
	private helpPage helpPage;
	
	@Test
	public void verifyVerifyHelpLink()
	{
		helpPage = singIn.ClickOnHelpLink();
		util.SwitchtoChildWindow();
		boolean actualResult = helpPage.validationOfConditionsOfUseLink();
		Assert.assertEquals(actualResult, true, "This TC is falied");
		
	}

}

	


