package org.xyz.automation.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testclass
{
	WebDriver driver;
	@Test
	public void loginfunc() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://www.kosdev.com/latest/page/100001/welcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Home']"))).perform();
		
		act.click(driver.findElement(By.xpath("//span[text()='Welcome to kOS']"))).perform();
		
		act.click(driver.findElement(By.xpath("//span[text()='About this site']"))).perform();
		
		
		
		
		driver.findElement(By.xpath("//span[text()='Release Notes']")).click();
		
	
		
		driver.findElement(By.xpath("//span[text()='v1.0.58']")).click();
		
		
		
		driver.findElement(By.xpath("//span[text()='Getting Started']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'1: Set Up Dev Environment')]")).click();
		
		
		
		//driver.quit();
		
	
	
		
	}




}



