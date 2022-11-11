package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HelpAndServicePage;
import com.amazon.qa.pages.helpPage;

public class TC_04PrvateNoticeLink extends TestBase
{
	 HelpAndServicePage  hsp ;
	  
		@Test
		public void verifyPrivateNoticeLink()
		{
			hsp = singIn.ClickOnPrivateNoticeLink();
			util.SwitchtoChildWindow();
			boolean actualResult = hsp.validationOfConditionsOfUseLink();
			Assert.assertEquals(actualResult, true, "This TC is falied");
			
		}

}
