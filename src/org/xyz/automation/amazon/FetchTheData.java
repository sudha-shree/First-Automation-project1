package org.xyz.automation.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchTheData 
{
	
	
	WebDriver  Driver;
	
		
	@Test
	public void differentfields()
	{
		Driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		String ExpUrl="https://www.amazon.com/";
		Driver.get(ExpUrl);
		String ActUrl = Driver.getCurrentUrl();
		System.out.println(ActUrl);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActUrl, ExpUrl);
		
		String ExpSearch="Go";
		String ActSearch=Driver.findElement(By.cssSelector("[type='submit']")).getAttribute("value");
		sa.assertEquals(ActSearch,ExpSearch);
		
		String ExpTitle = "Amazon.com. Spend less. Smile more.";
		String ActTitle = Driver.getTitle();
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpSearch1= "Search Amazon";
		String ActSearch1=Driver.findElement(By.id("twotabsearchtextbox")).getAttribute("placeholder");
		System.out.println(ActSearch1);
		sa.assertEquals(ActSearch1, ExpSearch1);
		
		
		sa.assertAll();
		
		
				
		
	}
}
