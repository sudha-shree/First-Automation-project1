package org.xyz.automation.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 

{
  public static void Screenshotresults(WebDriver driver,String name) throws Exception
  {
	  
	   
	 TakesScreenshot screen = (TakesScreenshot) driver;
	 
	 File f = screen.getScreenshotAs(OutputType.FILE);
	File fd = new File("./TestResults/"+name+".png") ;
	FileUtils.copyFile(f, fd);
	
  
  
  
  
  
  }
}
