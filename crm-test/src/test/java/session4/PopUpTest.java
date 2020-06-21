package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {
	@Test 
	public void PopUpHandle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.manage().window().maximize();
		 //driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 Thread.sleep(2000);
		 //or put an explicit wait as from here
		 driver.findElement(By.xpath("//form[@name='loginform']/descendant::input[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 driver.close();
		 driver.quit();
	}

}
