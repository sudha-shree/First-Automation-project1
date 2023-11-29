package org.xyz.automation.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	
	WebDriver  Driver;
	
	@Test	
	public void differntfields()
	{
		Driver = new ChromeDriver();
		
		Driver.navigate().to("https://www.thetestingworld.com/testings/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.findElement(By.name("fld_username")).sendKeys("Selenuium");
		Driver.findElement(By.name("fld_username")).clear();
		Driver.findElement(By.name("fld_username")).sendKeys("Automation");
		Driver.findElement(By.name("fld_email")).sendKeys("sudhashree56@gmail.com");
		Driver.findElement(By.name("fld_password")).sendKeys("sudhamanvith92");
		Driver.findElement(By.name("fld_cpassword")).sendKeys("sudhamanvith92");
		Driver.findElement(By.name("dob")).click();
		Driver.findElement(By.name("dob")).sendKeys("11/17/1992");
				
		
		Driver.findElement(By.name("phone")).sendKeys("8904874882");
		Driver.findElement(By.name("add_type")).click();
		
		Select gen = new Select(Driver.findElement(By.name("sex")));
		gen.selectByVisibleText("Female");
		
		Select con = new Select(Driver.findElement(By.name("country")));
		con.selectByVisibleText("India");
		
		Select state = new Select(Driver.findElement(By.name("state")));
		state.selectByVisibleText("Karnataka");
		
		Select city = new Select(Driver.findElement(By.name("city")));
		city.selectByVisibleText("Mangaluru");
		
		Driver.findElement(By.name("zip")).sendKeys("575020");
		Driver.findElement(By.name("terms")).click();
		
		//Driver.findElement(By.className("displayPopup")).click();
		Driver.findElement(By.cssSelector("[type='submit']")).click();
		Driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}
	
		
		
		
	
	
	
	
	@Test(enabled=false)
	public void launchbrowser()
	{
		Driver = new ChromeDriver();
		
		Driver.navigate().to("https://www.google.com/");
		Driver.get("https://www.facebook.com/");
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		Driver.close();
		Driver.quit();
		
		
		
		
	}
	
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
	}


	

	
	
	
	
	
	

