package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BassClasses.PageBaseClass;

public class LoginPage extends PageBaseClass{
	
	
	@FindBy(xpath = "//input[@type= 'text']") public WebElement Email;
	@FindBy(xpath = "//input[@type ='password']") public WebElement password;
	@FindBy(xpath = "//button[text() ='SIGN IN']") public WebElement SigninBtn;
	
	
	public LoginPage(WebDriver driver) {
		
            this.driver =driver;
	}
	 
	
	
	
	public DashboardPage DoLogin(String email ,String pass) {
		
		Email.sendKeys(email);
		password.sendKeys(pass);
		SigninBtn.click();
		return PageFactory.initElements(driver, DashboardPage.class);
		
		
	}
	
}
