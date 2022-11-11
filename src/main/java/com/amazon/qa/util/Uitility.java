package com.amazon.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class Uitility extends TestBase
{
	 List <String> address;
	public void getScreenshot(String name ) throws IOException
{	
 
	TakesScreenshot sc = (TakesScreenshot)driver;	
    File source	= sc.getScreenshotAs(OutputType.FILE);    
    File dest = new File ("./Screenshots/"+name+".jpg");
    FileHandler.copy(source, dest);
}
	
   public Uitility(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   @SuppressWarnings("unchecked")
public void SwitchtoChildWindow()
   {
	  Set <String>  add =  driver.getWindowHandles();
	  address = new ArrayList<String>(add);
	  driver.switchTo().window(address.get(1));
   }
   
   public void SwitchtodefaultContent()
   {
	  	  driver.switchTo().defaultContent();
   }



}