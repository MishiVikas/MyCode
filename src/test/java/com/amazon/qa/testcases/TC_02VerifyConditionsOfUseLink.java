package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HelpAndServicePage;

public class TC_02VerifyConditionsOfUseLink extends TestBase
{

	  HelpAndServicePage  hsp ;
	  
	@Test
	public void verifyConditionsOfUseLink()
	{
		hsp = singIn.clickOnConditionsOfUseLink();
		util.SwitchtoChildWindow();
		boolean actualResult = hsp.validationOfConditionsOfUseLink();
		Assert.assertEquals(actualResult, true, "This TC is falied");
		
	}

}
