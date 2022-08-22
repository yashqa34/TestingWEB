package TestCases;

import org.testng.annotations.Test;

import BassClasses.PageBaseClass;
import PageClasses.DashboardPage;
import PageClasses.LoginPage;

public class LoginTestcase{
	
	
	LoginPage login;
	DashboardPage Dashboard;
	@Test
	public void VaildLogin() {
		PageBaseClass Page = new PageBaseClass();
	    Page.invokeBrowser("Chorme");
		login =Page.OpenApplication();
		Dashboard =login.DoLogin("nishants440@gmail.com", "Test@1234");
		Dashboard.GetApplicationTitle("Agrotech");
		
		
		
	}

}
