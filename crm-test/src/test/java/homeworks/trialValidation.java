package homeworks;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class trialValidation {
	@Test
	public void UserShouldBeAbleToAddItemstobag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com//");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-nav-role='signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("angelytemaina14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("maranga11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,\"signInSubmit\")]")).click();
		Thread.sleep(3000);
		// String titleXpath= "//div[contains(@class,'nav-logo-base nav-sprite')]";
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Title not found", expectedTitle, actualTitle);

		// WebDriverWait wait= new WebDriverWait(driver,3);
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(titleXpath)));

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
