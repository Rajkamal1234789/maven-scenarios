package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoverxpath {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://freecrm.co.in/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//li[@class='rd-navbar--has-dropdown rd-navbar-submenu']//child::a[text()='CRM']"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//ul[@class='rd-navbar-dropdown rd-navbar-open-right']//li//a[text()='HIPAA CRM ']")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		
		
		
		
	}

}
