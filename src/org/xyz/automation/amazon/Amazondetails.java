package org.xyz.automation.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazondetails 

{
	@Test
	public void signupfunc() 
	{
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fcustomer-preferences%2Fedit%3Fie%3DUTF8%26preferencesReturnUrl%3D%252F%26ref_%3Dtopnav_lang&ref_=topnav_lang");
	
		Select depar = new Select(driver.findElement(By.id("searchDropdownBox")));
		depar.selectByVisibleText("Amazon Devices");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		
		
	}

}
