package testngperfect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D {
	
	@Test(dataProvider="raj")
	
	public void launch(String email,String password) throws Exception {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(6000);
		
	
		String title= driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("Facebook", title);
		
		
		driver.close();
		
		
	}
	
	@DataProvider(name="raj")
	public Object[][] getData(){
		
		return new Object[][] {{"rajkamalmmt@gmail.com","muleesb"},{"tdfhfh","vhjvhjvhj"}};
	}

}
