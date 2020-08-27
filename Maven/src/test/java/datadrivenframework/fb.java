package datadrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class fb {
	static WebDriver driver;
	public static void main(String[] args) throws Exception{
		
	
		
		 
		
		ExcelFileUtil excel=new ExcelFileUtil("F:\\formattingafter\\Maven\\TestData\\fb.xlsx");
		
		
		int rowcount=excel.rowCount("kamal");
		
		System.out.println("number of rows are:"+rowcount);
		
		for(int i=1;i<=rowcount;i++) {
			
			String username=excel.getData("kamal", i, 0);
			
			String password=excel.getData("kamal",i, 1);
			
			System.out.println(username+" "+ password);
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			driver.findElement(By.id("email")).clear();
			
			driver.findElement(By.id("email")).sendKeys(username);
			
			driver.findElement(By.id("pass")).clear();
			
			driver.findElement(By.id("pass")).sendKeys(password);
			
			driver.findElement(By.id("u_0_b")).click();
			
			Thread.sleep(10000);
			String title=driver.getTitle();
			System.out.println(title);
			
			
			
		if(title.equalsIgnoreCase("Facebook")) {
			excel.setData("kamal", i, 2,"pass");
		}
		else {
			excel.setData("kamal", i, 2,"fail");
		}
			
			Thread.sleep(2000);
			driver.quit();
			
			
			
			
			
		}
	}

}
