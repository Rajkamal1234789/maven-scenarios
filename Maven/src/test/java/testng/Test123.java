package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {
	public WebDriver driver;
	@BeforeTest
	
	public void launch() {
		
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	@Test
	
	public void data() {
		
	driver.findElement(By.name("q")).sendKeys("rajkamal");
	driver.findElement(By.name("btnK")).click();
		
	}
	
	@AfterTest
	public void close()
		{
		driver.quit();
	}
}
