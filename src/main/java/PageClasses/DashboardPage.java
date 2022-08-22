package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BassClasses.PageBaseClass;

public class DashboardPage extends PageBaseClass {
	
@FindBy(xpath = "//div[@id ='root']//ul//a[2]//li[text()='Admin Roles']") public WebElement adminmenu;
@FindBy(xpath = "//div[@id ='root']//ul//a[3]//li[text()='User Management']") public WebElement usermanage;	
@FindBy(xpath = "//div[@id ='root']//ul//a[4]//li[text()='Admin Users']") public WebElement adminuser;	
@FindBy(xpath = "//div[@id ='root']//ul//a[5]//li[text()='KCC Applications']") public WebElement kcc;
@FindBy(xpath = "//div[@id ='root']//ul//a[6]//li[text()='Application Approval']") public WebElement approval;	
@FindBy(xpath = "//div[@id ='root']//ul//a[7]//li[text()='Crop Status']") public WebElement crop;
@FindBy(xpath = "//div[@id ='root']//ul//a[8]//li[text()='Application Management']") public WebElement appMan;
@FindBy(xpath = "//div[@id ='root']//ul//a[9]//li[text()='Cadastral Map']") public WebElement cad;
@FindBy(xpath = "//div[@id ='root']//ul//a[10]//li[text()='Overlay Analysis']") public WebElement over;
@FindBy(xpath = "//div[@id ='root']//ul//a[11]//li[text()='Report Compilation']") public WebElement reportC;
@FindBy(xpath = "//div[@id ='root']//ul//a[12]//li[text()='Report Status']") public WebElement reportS;


	public DashboardPage (WebDriver driver) {
		
        this.driver =driver;
}
	
	
	public AdminRolesPage AdminRoles() {
		adminmenu.click();
		return PageFactory.initElements(driver, AdminRolesPage.class);
		
	}

	
   public UsermanagementPage UserManagement() {
	  usermanage.click();
	  return PageFactory.initElements(driver, UsermanagementPage.class);
		
	}
   
   public AdminUsersPage AdminUser() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, AdminUsersPage.class);
	}
	
   public KCCApplicationPage KCC_Application() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, KCCApplicationPage.class);
	}
   
   public ApplicationApprovalPage Application_Approval() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, ApplicationApprovalPage.class);
	}
   
   public CropStatusPage CropStatus() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, CropStatusPage.class);
	}
   
   
   public ApplicationManagementPage App_Mangament() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, ApplicationManagementPage.class);
	}
   
   public CadastralMapPage CadstralMap() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, CadastralMapPage.class);
	}
   
   
   public OverLayAnaPage Overlay_Anlaysis() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, OverLayAnaPage.class);
	}
   
   public ReportCompPage Report_Comp() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, ReportCompPage.class);
	}
   
   public ReportStatus Report_Status() {
		
	   adminuser.click();
	   return PageFactory.initElements(driver, ReportStatus.class);
	}
   
   
}
