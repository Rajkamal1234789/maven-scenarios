package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchinBrowser {

	public static void main(String[] args) throws Exception {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		//System.setProperty("webdriver.chrome.driver", "F:\\formattingafter\\Maven\\Drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement electronics=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[1]/span"));
		
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a")).click();
		
		WebElement dropdown=driver.findElement(By.className("fPjUPw"));
		
		Select sel=new Select(dropdown);
		sel.selectByValue("10000");
		
		driver.findElement(By.className("_1GEhLw")).click();
		
		driver.findElement(By.linkText("Motorola")).click();
		
		
		
		

	}

}
