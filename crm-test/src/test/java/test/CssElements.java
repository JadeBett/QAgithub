package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements {
	@Test
 public void HandleCssElements() throws InterruptedException {
	
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
			
			WebDriver driver =new ChromeDriver();
			
           
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		
   	        driver.manage().deleteAllCookies();
 
   		    driver.manage().window().maximize();
   		    
   	        driver.get("http://www.objectspy.space/");
   	        Thread.sleep(3000);
   	        //tagname#id
   	        driver.findElement(By.cssSelector("input#sex-0")).click();
   	        Thread.sleep(3000);
   	       //tag[attribute=value] 
   	      driver.findElement(By.cssSelector("input[value='Female']")).click();
   	      Thread.sleep(3000);
   	      //tag.class[atrribute=value]
   	      //tag.class
   	     driver.findElement(By.cssSelector("label.checkbox[for=\"profession-1\"]")).click();
   	     Thread.sleep(3000);
   	     
   	         driver.close();
   	         driver.quit();
			
 }
}
