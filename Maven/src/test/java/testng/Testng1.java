package testng;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
	
	@Test
	
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\formattingafter\\Maven\\Drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
	WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	

}
