package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIFrame {
	@Test
	public void handleIFrame() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 driver.get("https://docs.oracle.com/javase/8/docs/api/");
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("packageListFrame");
		 
		 Thread.sleep(3000);
		 
		 new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("java.sql")));
		 
		 driver.findElement(By.linkText("java.sql")).click();
		 Thread.sleep(5000);
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("packageFrame");
		  
		  driver.findElement(By.linkText("Blob")).click();
		  Thread.sleep(3000);
		  driver.close();
		  driver.quit();
	
	}

}
