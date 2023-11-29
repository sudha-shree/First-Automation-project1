package org.xyz.automation.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	
	
	WebDriver  Driver;
	
	@BeforeMethod
	
	public void launchbrowser()
	{
		Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod(enabled=false)
	public void closebrowser()
	{
		Driver.close();
	}
	
	
	
	
	@Test(enabled=false)
	public void loginfunc()
	{
		//WebDriver Driver = new ChromeDriver();
		//Driver.get("https://www.facebook.com/");
		
		
		Driver.findElement(By.id("email")).sendKeys("cutesudd@gmail.com");
		Driver.findElement(By.name("pass")).sendKeys("sudhasujatha");
		//Driver.findElement(By.linkText("Forgot password?")).click();
		Driver.findElement(By.cssSelector("[type='submit']")).click();
		//Driver.close();
		
	}
	 @Test(enabled=true)
	 
	public void signupfunc() throws Exception
	{
		//WebDriver Driver = new ChromeDriver();
		//Driver.get("https://www.facebook.com/");
		
		 
		 Driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		Thread.sleep(5000);
		
		
		Driver.findElement(By.name("firstname")).sendKeys("sudhashree");
		Driver.findElement(By.name("lastname")).sendKeys("damodar sujatha");
		
		Driver.findElement(By.name("reg_email__")).sendKeys("sudhashree56@gmail.com");
		
		Driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sudhashree56@gmail.com");
		
		
		Driver.findElement(By.name("reg_passwd__")).sendKeys("mahikamanvith");
		
		
		//Driver.findElement(By.cssSelector("[type='radio']")).click();
		
		//Driver.findElement(By.name("websubmit")).click();
		
						
		Driver.findElement(By.name("sex")).click();
		
		Select mon = new Select(Driver.findElement(By.id("month")));
		mon.selectByValue("11");
		Select day = new Select(Driver.findElement(By.name("birthday_day")));
		day.selectByValue("17");
		Select yr = new Select(Driver.findElement(By.id("year")));
		yr.selectByValue("1992");
		Driver.findElement(By.name("websubmit")).click();
		
	
	
		
		
		
		//Driver.close();
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
	}


	

	
	
	
	
	
	
}
