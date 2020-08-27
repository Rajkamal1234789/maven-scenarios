package ExcelUtilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	@DataProvider
 
	public Iterator<Object[]> getTestData() throws Exception{
		ArrayList<Object[]> testData= TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	
	public void halfEbayPageTest(String firstname,String lastname,String address1,String address2,String city,String state,String zipcode,String emai) {
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys(address1);
		
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys(address2);
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);
		
		Select select=new Select(driver.findElement(By.id("state")));
		
		select.selectByVisibleText(state);
		
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys(zipcode);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emai);
		
		
		
		
	}
		
		
		
		
		
		
		
	

}
