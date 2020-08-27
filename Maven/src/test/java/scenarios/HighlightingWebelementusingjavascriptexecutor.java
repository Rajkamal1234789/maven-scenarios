package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightingWebelementusingjavascriptexecutor {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		// using Javascript executot to highlight webelement
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border: 2px solid red;');",driver.findElement(By.id("email")));
		
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border:solid 2px white');",driver.findElement(By.id("email")));

	}

}
