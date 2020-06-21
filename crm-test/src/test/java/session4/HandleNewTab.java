package session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewTab {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	     driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.get("https://www.yahoo.com/");	
	}
	@Test
	public void SearchForXpathOnYahoo() throws InterruptedException {
	By SEARCH_FIELD_LOCATOR=By.cssSelector("input#header-search-input");
	By W3_LINK_LOCATOR=By.linkText("XPath Tutorial - W3Schools");
	By SQL_LNK_LOCATOR=By.linkText("SQL");
	
	
	driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("Xpath");
	driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);
	//you can have an explicit wait right here just in case the system time run out like so
	new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(W3_LINK_LOCATOR));
	driver.findElement(W3_LINK_LOCATOR).click();
	
	 for(String windowHandle:driver.getWindowHandles()) {
		driver.switchTo().window(windowHandle);
	 }
	
	
	
	driver.findElement(SQL_LNK_LOCATOR).click();
	Thread.sleep(2000);
		
		
		
	}
	@After
	public void CloseEverything() {
		driver.close();
		driver.quit();
		
	}
}
