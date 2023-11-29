package org.xyz.automation.facebook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LearnKeyboardMouse 
{
   WebDriver driver;
   
   @Test(enabled=false)
   public void leankeyboard()
   {
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	   Actions act = new Actions(driver);
	   
	   act.sendKeys("sudhashree56@gmail.com");
	   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
	   act.sendKeys("cutesudd@gmail.com");
	   
	   act.sendKeys(Keys.TAB).perform();
	   act.sendKeys("sudhasujatha").perform();
	   act.sendKeys(Keys.ENTER).perform();
	   
	   
   }
   @Test
   public void learnmouse()
   {
	   driver = new ChromeDriver();
	   driver.get("https://www.mphasis.com/home.html");

	   
	   Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	   //act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
      act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
      //act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
      act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
      // switch window 1 to switch window 2
      
     Set<String> windid=driver.getWindowHandles();
     Iterator<String> itr = windid.iterator();
     String win1 = itr.next();
     String win2= itr.next();
     driver.switchTo().window(win2);
     driver.switchTo().window(win1);
      
      
      
   
   
   
   
   
   
   }
}

	   

		  

		  
	   
	   
   
   

