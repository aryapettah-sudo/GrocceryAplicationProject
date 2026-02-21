package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	
	public WebDriver driver;
	WaitUtility wait =new WaitUtility();
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;
	@FindBy(xpath ="//p[text()='Dashboard']")WebElement dashboardtile;
	@FindBy(xpath ="//b[text()='7rmart supermarket']")WebElement logintext;
	
	
	
	public LoginPage enterUsernameOnUsernameField(String usernamevalue) {
		username.sendKeys(usernamevalue);
		return this;
		
	}
	
	public LoginPage enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
		return this;
	}
	 
	 public HomePage clickOnSignInButton() {
		 wait.waitUntilElementToBeClickable(driver, signinbutton);
		 signinbutton.click();
		 return new HomePage(driver);
		
	 }
	 
	 public boolean isDashboardDisplayed() {
		return dashboardtile.isDisplayed();
			 
	 }
	 
	 public String dashboardText() {
		 return logintext.getText();
	 }

}