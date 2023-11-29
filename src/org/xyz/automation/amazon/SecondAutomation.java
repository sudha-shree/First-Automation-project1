package org.xyz.automation.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondAutomation 

{
	@Test
	public void signupfunc() throws Exception
	{
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("customerName")).sendKeys("sudha");
		driver.findElement(By.id("ap_email")).sendKeys("mahika56@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mahibaby");
		driver.findElement(By.name("passwordCheck")).sendKeys("mahibaby");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//driver.findElement(By.className("icp-radio icp-radio-active")).click();
		driver.close();
		
		
		
		
	}

}
