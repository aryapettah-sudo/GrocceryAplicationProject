package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v136.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {
	

	
private static final String Admin = null;
public WebDriver driver;
PageUtility page = new PageUtility();
WaitUtility wait = new WaitUtility();
	
	public AdminUsersPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newinadminusers;
	@FindBy(xpath="//input[@id='username']")WebElement usernameinadminusersinfo;
	@FindBy(xpath="//input[@id='password']")WebElement passwordinadminusersinfo;
	@FindBy(xpath ="//select[@id='user_type']")WebElement dropdown;
	@FindBy(xpath ="//button[@name='Create']")WebElement saveinadminuserinfo;
	@FindBy(xpath ="//a[contains(@href,'javascript:void(0)')and contains(@class,'btn-primary')]")WebElement searchinadminusers;
	@FindBy(xpath ="//input[@id='un']")WebElement usernameinsearchadminusers;
	@FindBy(xpath ="//select[@id='ut']")WebElement usertypeinsearchadminusers;
	@FindBy(xpath ="//button[@name='Search']")WebElement searchinsearchadminusers;
	@FindBy(xpath ="//a[contains(@href,'com/admin/list-admin')and contains(@class,'btn-warning')]")WebElement resetinadminusers;
	@FindBy(xpath="//h1[@class='m-0 text-dark' and text()='Admin Users']")WebElement adminUserText;
	
	 public AdminUsersPage clickOnNewButtonInAdminUsers() {
		 wait.waitUntilElementToBeClickable(driver, newinadminusers);
	    	newinadminusers.click();
	    	return this;
    }
	 public AdminUsersPage enterUsernameInAdminUsersInfo(String AdminUsername) {
		 usernameinadminusersinfo.sendKeys(AdminUsername);	
		 return this;
	}
	 public AdminUsersPage enterPasswordInAdminUsersInfo(String AdminPassword) {
		passwordinadminusersinfo.sendKeys(AdminPassword);
		return this;
	}
	 public AdminUsersPage selectUserTypeInAdminUsersInfo() {
		 page.selectDragDropWithText(dropdown, "text");
		 return this;
	}
	public AdminUsersPage clickOnSaveButtonInAdminUserInfo() {
		wait.waitUntilElementToBeClickable(driver, saveinadminuserinfo);
		saveinadminuserinfo.click();
		return this;
	}
	
	
	
	public AdminUsersPage clickOnSearchButtonInAdminUsers() {
		wait.waitUntilElementToBeClickable(driver, searchinadminusers);
		searchinadminusers.click();	
		return this;
	}
	public AdminUsersPage enterUserNameInSearchAdminUsers(String AdminSearchUsername) {
		usernameinsearchadminusers.sendKeys(AdminSearchUsername);
		return this;
	}
	public AdminUsersPage selectUserTypeInSearchAdminUsers() {
		page.selectDragDropWithText(usertypeinsearchadminusers, Admin);	
		return this;
	}
	public AdminUsersPage clickOnSearchButtonAfterEnterValues() {
		wait.waitUntilElementToBeClickable(driver, searchinsearchadminusers);
		searchinsearchadminusers.click();	
		return this;
	}
	
	
	public AdminUsersPage clickOnResetButtonInAdminUsers() {
		wait.waitUntilElementToBeClickable(driver, resetinadminusers);
		resetinadminusers.click();
		return this;
	}
	
	public boolean isAdminUserTextDisplayed()
	{
		return adminUserText.isDisplayed();
	}
}