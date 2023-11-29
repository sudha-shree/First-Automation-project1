package org.xyz.automation.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchTheData 
{
	
	
	WebDriver  Driver;
	
	@Test(enabled=false)
	public void differntfieldslogin()
	{
		Driver = new ChromeDriver();
		String ExpURL="https://www.facebook.com/";
		Driver.get(ExpURL);
		String ActURL=Driver.getCurrentUrl();
		System.out.println(ActURL);
		//Assert.assertEquals(ActURL, ExpURL);
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		String ExpTitle="Facebook - log in or sign up";
		
		String ActTitle=Driver.getTitle();
		System.out.println(ActTitle);
		sa.assertEquals(ActTitle,ExpTitle);
		String ExpUsername ="Email or phone number";
		String ActUsername=Driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsername);
		
		sa.assertEquals(ActUsername, ExpUsername);
		
		String ExpPassword = "Password";
		String ActPassword = Driver.findElement(By.name("pass")).getAttribute("placeholder");
		System.out.println(ActPassword);
		sa.assertEquals(ActPassword, ExpPassword);
		
		String ExpLogin = "Log In";
		String ActLogin = Driver.findElement(By.name("login")).getText();
		
		System.out.println(ActLogin);
		sa.assertEquals(ActLogin, ExpLogin);
				
		sa.assertAll();
	}
		@Test	
		public void differntfieldssignup() throws Exception
		{
			Driver = new ChromeDriver();
			String ExpURL="https://www.facebook.com/";
			Driver.manage().window().maximize();
			Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Driver.get(ExpURL);
			String ActURL=Driver.getCurrentUrl();
			System.out.println(ActURL);
			
			SoftAssert sa = new SoftAssert();
			//Assert.assertEquals(ActURL, ExpURL);
			String Expca = "Create new account";
			String Actca = Driver.findElement(By.xpath("//*[text()='Create new account']")).getText();
			System.out.println(Actca);
			Driver.findElement(By.xpath("//*[text()='Create new account']")).click();
			//Thread.sleep(5000);
		
			sa.assertEquals(Actca, Expca);
			String Expfn = "First name";
			String Actfn = Driver.findElement(By.name("firstname")).getAttribute("placeholder");
			System.out.println(Actfn);
			sa.assertEquals(Actfn, Expfn);
			
			String ExpDOB = "Birthday";
			String ActDOB = Driver.findElement(By.xpath("//*[text()='Birthday']")).getText();
		
			System.out.println(ActDOB);
			sa.assertEquals(ActDOB, ExpDOB);
			String Expmonth = "Month";
			String Actmonth = Driver.findElement(By.name("birthday_month")).getAttribute("aria-label");
			sa.assertEquals(Actmonth, Expmonth);
			System.out.println(Actmonth);
			sa.assertAll();
		
		
		
		
		
	}
	
	
	
	
	
}

	
	
	
	
	
	
	

		
		
	

	
	
	
	
	
	

