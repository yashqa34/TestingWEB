package TestCases;

import org.testng.annotations.Test;

import BassClasses.PageBaseClass;
import PageClasses.DashboardPage;
import PageClasses.LoginPage;

public class DashboardMenuTestcase  {
	
	LoginPage login;
	DashboardPage Dashboard;
	@Test
	public void Navigate_AdminRoles() {
		PageBaseClass Page = new PageBaseClass();
		Page.invokeBrowser("Chorme");
		login =Page.OpenApplication();
		Dashboard =login.DoLogin("nishants440@gmail.com", "Test@1234");
		Dashboard.AdminRoles();
		
	}
	
@Test
	public void Navigate_userManagement() {
		PageBaseClass Page = new PageBaseClass();
		Page.invokeBrowser("Chorme");
		login =Page.OpenApplication();
		Dashboard =login.DoLogin("nishants440@gmail.com", "Test@1234");
		Dashboard.UserManagement();
		Page.CloseApplication();
	}

}
