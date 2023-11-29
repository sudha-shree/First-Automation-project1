package org.xyz.automation.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RepeatFetchTheData 

{
    WebDriver driver;
    @Test
    public void differntfields() throws Exception
    {
    	driver = new ChromeDriver();
    	
    	driver.navigate().to("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	String ExpURL = "https://www.facebook.com/";
    	String ActURL = driver.getCurrentUrl();
    	SoftAssert sa = new SoftAssert ();
    	sa.assertEquals(ActURL, ExpURL);
    	
    	String ExpLogin = "Log In";
    	String ActLogin = driver.findElement(By.name("login")).getText();
    	sa.assertEquals(ActLogin, ExpLogin);
    	
    	String Expcreateacc = "Create new account";
    	String Actcreateacc = driver.findElement(By.linkText("Create new account")).getText();
    	sa.assertEquals(Actcreateacc, Expcreateacc);
    	
    	driver.findElement(By.linkText("Create new account")).click();
    	
    	//Thread.sleep(5000);
    	
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	String Expbirth = "Birthday"; 
    	
    	
    	String Actbirth = driver.findElement(By.xpath("//*[text()='Birthday']")).getText();;
    	
    	//wait.until(ExpectedConditions.textToBePresentInElement(someElement,Expbirth));
    	
    	
    	
    	sa.assertEquals(Actbirth, Expbirth);
    	driver.quit();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	sa.assertAll();
    	
    	
    	
    	
    }
}
