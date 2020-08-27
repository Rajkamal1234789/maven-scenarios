package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollingoperationsusingjavascriptexecutor {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location.href='https://www.amazon.in/';");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//a[text()='Twitter']"));
		//scrolling to a particular element
		//js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		//scrolling to the bottom of webpage
		//js.executeScript("window.scrollTo(0,document.body.ScollHeight)");
		
		js.executeScript("window.scrollBy(0,600)");
		
		
		

	}

}
