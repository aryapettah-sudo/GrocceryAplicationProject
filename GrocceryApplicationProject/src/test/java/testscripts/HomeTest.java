package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	HomePage homepage;
	@Test(retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSuccessfullyLogoutAfterLogin() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage=login.clickOnSignInButton();
		
		homepage.clickOnAdminLogoutIcon();
		login=homepage.clickOnLogoutButton();
		

		String expected = "7rmart supermarket";
		String actual = login.dashboardText();
		Assert.assertEquals(expected, actual,Constants.LOGOUTERROR);
	}
		
	

}