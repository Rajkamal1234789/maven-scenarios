package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesusingJavascriptExecutor {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		// selecting checkboxes using JavascriptExecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement email=(WebElement) js.executeScript("return document.getElementByXpath('//input[@value='red'');");
		
		js.executeScript("document.getElementByXpath('//input[@value='red']').checked=true;");
		

	}

}
