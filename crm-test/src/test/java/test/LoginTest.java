package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginTest {
	@Test
 public void validusershouldbeabletologin() throws InterruptedException {
	
		
			System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe" );
		     WebDriver driver =new ChromeDriver();
		     
		     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		     
    	     driver.get("http://techfios.com/test/billing/?ng=login/");
    	     Thread.sleep(2000);
    	     
   	          driver.findElement(By.xpath("//*[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com"); 
    	     Thread.sleep(2000);
    	     
    	     driver.findElement(By.xpath("//input[contains(@placeholder,'assword')and contains(@class,'form')]")).sendKeys("abc123");
    	     Thread.sleep(2000);
    	     
    	     driver.findElement(By.xpath("//*[contains(text(),'Sign') and @ name='login']")).click();
    	     Thread.sleep(2000);
    	     
    	     String dashboardTitleXpath="//div[@id='page-wrapper']//descendant::h2[contains(text(),Dashboa)]";
    	     Thread.sleep(3000);
    	     //assertion validation
    	     String expectedtitle="Dashboard- TechFios Test Application - Billing";   
    	    String actualtitle=driver.getTitle();
    	    //line below will only be executed if your test case  fails  
    	  Assert.assertEquals("Dashboard page did not display ",expectedtitle, actualtitle);
    	     
    	     
    	     //explicit wait
    	     WebDriverWait wait=new  WebDriverWait(driver,1);
    	      
    	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardTitleXpath)));
    	     
   	         driver.close();
   	         driver.quit();
			
 }
}
