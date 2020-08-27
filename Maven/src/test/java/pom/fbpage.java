package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class fbpage {
	

	WebDriver driver;
	public fbpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="u_0_b")
	@CacheLookup
	WebElement login;
	
	public void em(String e) {
	 email.sendKeys(e);
	}
	
	public void p(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void cl() {
		login.click();
	}
	
	

}
