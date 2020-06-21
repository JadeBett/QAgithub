package session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverOver {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		//have them all in one method to avoid repetition
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	     driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.dell.com/en-us");	
		
	}
	
	
	@Test
	public void HoverOverTest() throws InterruptedException {
		
		  //IF YOU WANT AN ELEMENT LIBRARY USE BY THEREFORE YOU CAN HAVE A LIST OF THEM
		  WebElement DEALS_MENU_ELEMENT=(driver.findElement(By.xpath("//button[@id='l5']")));
		//By WORKSPACE_DEALS_STATION=By.linkText("Workstation Deals");     
		  Actions action=new Actions(driver);
		  action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		  //CALL ALL THE BYS AFTER THE ACTION CLASS
		 //driver.findElement(WORKSPACE_DEALS_STATION).click();
		  WebElement WORKSPACE_DEALS_STATION=(driver.findElement(By.linkText("Workstation Deals")));
		  Thread.sleep(2000);
		  WORKSPACE_DEALS_STATION.click();
		  Thread.sleep(2000);
		 
		 
	}
	@Test
	public void HoverOverTest2() throws InterruptedException {
		
		  //IF YOU WANT AN ELEMENT LIBRARY USE BY THEREFORE YOU CAN HAVE A LIST OF THEM
		  WebElement DEALS_MENU_ELEMENT=(driver.findElement(By.xpath("//button[@id='l5']")));
		   By WORKSPACE_DEALS_STATION=By.linkText("Workstation Deals");     
		  Actions action=new Actions(driver);
		  action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		  //CALL ALL THE BYS AFTER THE ACTION CLASS
		 driver.findElement(WORKSPACE_DEALS_STATION).click();
		  
		  Thread.sleep(2000);
	}
	@After
	public void CloseEverything() {
		driver.close();
		driver.quit();
		
	}

}
