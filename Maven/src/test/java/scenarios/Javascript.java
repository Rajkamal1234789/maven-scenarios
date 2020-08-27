package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String url=js.executeScript("return document.URL;").toString();
	System.out.println("url of the current webpage is:"+url);
	String domain=js.executeScript("return document.domain;").toString();
	System.out.println("domain of the current webpage is:"+domain);
//		js.executeScript("document.getElementById('email').value='rajkamalmmt@gmail.com';");
//		js.executeScript("document.getElementById('pass').value='muleesb';");
//		WebElement login=driver.findElement(By.id("u_0_b"));
//		js.executeScript("arguments[0].click();",login);
//		
		// getting titile if thse webpage using javascriptexecutor
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		//get text of webelement using javascriptexecutor
		
//		String text=js.executeScript("return document.getElementById('u_0_b').innerHtml").toString();
//		System.out.println("text of login webelement is:"+text);
		
		
	}

}
