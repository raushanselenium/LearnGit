package selenium_training.maven_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumTest {
	@SuppressWarnings("deprecation")
	WebDriver driver;
	
	@BeforeSuite
	public void browserInvoke()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
	}
	@Test
	public void formSubmit()
	{
		driver.findElement(By.id("userName")).sendKeys("Raushan Kumar");
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
