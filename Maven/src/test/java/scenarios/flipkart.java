package scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 WebElement ele=driver.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_']//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		 Actions action=new Actions(driver);
		 action.moveToElement(ele).build().perform();
		 driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[@title='Mobiles']")).click();
		 Select select=new Select(driver.findElement(By.className("fPjUPw")));
		 select.selectByValue("10000");
		 driver.findElement(By.xpath("//div[@title='6 GB & Above']")).click();
		 driver.findElement(By.partialLinkText("Motorola")).click();
		List<WebElement>prices= driver.findElements(By.className("_1vC4OE _2rQ-NK"));
		String price=null;
		 for(int i=0;i<prices.size();i++) {
			 price=prices.get(i).getText();
			 System.out.println(price);
		 }
		 
	}

}
