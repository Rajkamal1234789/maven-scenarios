package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openingurlwithjavascript {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.open('https://www.facebook.com');");
		js.executeScript("window.location.href=('https://www.facebook.com');");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		js.executeScript("document.getElementById('email').value='rajkamalmmt@gmail.com';");
		js.executeScript("history.go(0);");
		js.executeScript("window.history.back();");
		js.executeScript("window.history.forward();");

	}

}
