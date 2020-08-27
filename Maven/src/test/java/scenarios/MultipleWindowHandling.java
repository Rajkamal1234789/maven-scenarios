package scenarios;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		
		driver.findElement(By.className("nav-input")).submit();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Cubelelo QiYi 3x3 Silver Mirror Cube Speed Cube Magic Cube Puzzle Toy")).click();
		
		Set<String>windowid=driver.getWindowHandles();
		
		Iterator<String> it=windowid.iterator();
		
		String first= it.next();
		String second=it.next();
		
		driver.switchTo().window(second);
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("sfl-button")).click();
		
		Thread.sleep(6000);
		
		driver.close();
		
		driver.switchTo().window(first);
		
		Thread.sleep(6000);
		
		driver.close();
		
		System.out.println("multiple window hanling is performed successfully");
		
		

	}

}
