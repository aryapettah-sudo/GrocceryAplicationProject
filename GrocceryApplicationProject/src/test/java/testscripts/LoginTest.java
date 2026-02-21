package testscripts;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	HomePage homepage;
	@Test(priority =1,description= "validating userlogin with valid credentials",groups="smoke")
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage=login.clickOnSignInButton();
		boolean dashboarddisplay = login.isDashboardDisplayed();
		Assert.assertTrue(dashboarddisplay, Constants.VALIDCREDENTIALERROR);
	}
	
    @Test(priority =2,description= "validating userlogin with valid username and invalid password")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnSignInButton();
		
		String expected = "7rmart supermarket";
		String actual = login.dashboardText();
		Assert.assertEquals(expected, actual,Constants.INVALIDPASSWORDERROR);
	}
	
    @Test(priority =3,description= "validating userlogin with invalid username and valid password")
    public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnSignInButton();
		
		String expected = "7rmart supermarket";
		String actual = login.dashboardText();
		Assert.assertEquals(expected, actual,Constants.INVALIDUSERNAMEERROR);
		
	}
    
    @Test(priority =4,description= "validating userlogin with invalid credentials",groups="smoke",dataProvider = "loginProvider" )
    public void verifyUserLoginWithInvalidCredentials(String usernamevalue,String passwordvalue) throws IOException {
		//String usernamevalue = ExcelUtility.getStringData(3, 0, "LoginPage");
		//String passwordvalue = ExcelUtility.getStringData(3, 1, "LoginPage");
    	
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnSignInButton();
		
		String expected = "7rmart supermarket";
		String actual = login.dashboardText();
		Assert.assertEquals(expected, actual,Constants.INVALIDCREDENTIALERROR);
	}
    
    @DataProvider(name = "loginProvider")
    public Object[][] getDataFromDataProvider() throws IOException {

     return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
       // new Object[] {ExcelUtility.getStringData(3,
       // 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
     };
    }
	

}