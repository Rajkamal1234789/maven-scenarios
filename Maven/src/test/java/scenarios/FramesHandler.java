package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandler {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 driver.switchTo().frame("a077aa5e");
		 driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		 System.out.println("successs");
		 driver.switchTo().defaultContent();
		 WebElement ele=driver.findElement(By.xpath("//li[@class='item118 parent']/a"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("success");
		

	}

}
