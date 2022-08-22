package BassClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageClasses.LoginPage;

public class PageBaseClass {
	
	
	
	public static WebDriver driver;
	
	public WebDriver invokeBrowser(String BrowserName) {
		
 try {
	    if(BrowserName.equalsIgnoreCase("Chorme")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
					
			driver = new ChromeDriver(); 
			
		}else if(BrowserName.equalsIgnoreCase("Mozilla")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else {
		
			driver = new SafariDriver();
			}
		
	}catch(Exception e) {
			System.out.println(e.getMessage());
			}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
}
	
   
	public LoginPage OpenApplication() {
		driver = invokeBrowser("Chrome");
		driver.get("http://doodlebluelive.com:2143/login");
		return PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	
	/*@BeforeMethod
	public void OpenApplication() {
		driver = invokeBrowser("Chorme");
		driver.get("http://doodlebluelive.com:2143/login");
		driver.manage().window().maximize();
	
	}*/
	
	
	public void GetApplicationTitle(String expectedTitle) {
		
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}
	
	
	public void CloseApplication() {
		driver.quit();
	}
}
