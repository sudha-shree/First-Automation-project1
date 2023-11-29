package org.xyz.automation.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Warnings 

{
  WebDriver driver;
  @Test
  public void handlealerts() throws Exception
  {
	  driver= new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.name("proceed")).click();
	  driver.switchTo().alert().accept();  
	  
	  CaptureScreenshot.Screenshotresults(driver,"handlealerts");
	  
	  
			  
  }
  @Test
  public void handleframes() throws Exception
  {
	  driver= new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  
	  driver.switchTo().frame("SingleFrame");
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys("test");
	
	 
	 
	 CaptureScreenshot.Screenshotresults(driver,"handleframes");
	 
	  
	  
	  
			  
  }
  
  
}
