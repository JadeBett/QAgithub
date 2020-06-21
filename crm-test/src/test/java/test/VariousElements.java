package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements {
	@Test
	public void exploreVariousElements() throws InterruptedException  {
		//set chrome as your default browser
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		//you have to create an object of your chromedriver or instantiate chromedriver object
		
		WebDriver driver =new ChromeDriver();
		 ///go to site
		driver.get("http://www.objectspy.space/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 //delete cookies and history
		driver.manage().deleteAllCookies();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//slow down java 1000ms=1sec
		Thread.sleep(3000);
		 //click on radio button male
		
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);
		
		 //type something in the fields
		driver.findElement(By.name("firstname")).sendKeys("Angelyte");
		Thread.sleep(3000);
		 //click on a link
//		driver.findElement(By.linkText("Link Test : New Page")).click();
//		Thread.sleep(3000);
		
		//click on apartial link
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();	
		Thread.sleep(3000);
		
		//close the driver
		driver.close();
		
		//quit the driver/shut down the driver
		 driver.quit();
		
	}

}
