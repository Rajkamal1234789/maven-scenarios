package scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithoutselect {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> we = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		System.out.println(we.size());
		for(int i=0;i<we.size(); i++)
		{
			System.out.println(we.get(i).getText());
			if(we.get(i).getText().equals("Oracle"))
			{
					we.get(i).click();
					break;
			}
					
		}
		}

	}


