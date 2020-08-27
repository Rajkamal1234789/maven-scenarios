package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testfb {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		fbpage fb=new fbpage(driver);
		
		fb.em("rajkamalmmt@gmail.com");
		fb.p("muleesb");
		fb.cl();
	
	}

}
