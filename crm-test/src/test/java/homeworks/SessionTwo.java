package homeworks;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SessionTwo {
	
	WebDriver driver;
	@Before
	public void LaunchBrowser(){

		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
	     driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("http://www.techfios.com/ibilling/");
	}
	@Test
	public void userShouldBeAbleToAddDeposit() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'passwor')]")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-database']//following-sibling::span[text()='Transactions']")).click();
		driver.findElement(By.xpath("//a[text()='New Deposit']")).click();
		driver.findElement(By.xpath("//span[text()='Choose an Account']")).click();
		driver.findElement(By.xpath("//span[@id='select2-account-container']")).click();
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Expenses");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();
		
		
		String Deposit="//a[contains(text(),'Expenses')]";
		String ExpectedText="Expenses";
		String ActualText=driver.findElement(By.xpath("//a[contains(text(),'Expenses')]")).getText();
		//USING ASSERTION
		 Assert.assertEquals("deposit was not displayed", ExpectedText, ActualText);
		//====>EXPLICIT WAIT
		//WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Deposit)));
	}
	@After
   public void closeEverything() {
	   driver.close();
	   driver.quit();
   }
	
	}


