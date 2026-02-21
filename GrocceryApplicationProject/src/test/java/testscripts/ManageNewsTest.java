package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

@Test
public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNewsPage managepage;
	@Test
	public void verifyWhetherUserIsAbleToAddNewNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		String enterthenewsvalue = ExcelUtility.getStringData(0, 0, "ManageNews");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage=login.clickOnSignInButton();
		
		
		managepage=homepage.clickOnManageNewsMoreInfo();
		
		managepage.clickOnNewButton().enterTheNewsOnNewsField(enterthenewsvalue).clickOnSaveButton();
		
		boolean alertDisplayed = managepage.isAlertTextDisplayed();
		Assert.assertTrue(alertDisplayed,Constants.ADDNEWSERROR);
		
	}
	@Test	
    public void verifyWhetherUserIsAbleToSearchTheAddedNews() throws IOException {
    	String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		String searchthetitlevalue = ExcelUtility.getStringData(1, 0, "ManageNews");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage=login.clickOnSignInButton();
		
		managepage=homepage.clickOnManageNewsMoreInfo();
		
		managepage.clickOnSearchButton().enterSearchTitleOnSearchField(searchthetitlevalue).clickOnSearchButtonAfterEnterSearchValue();
		
		boolean managenewsdisplay = managepage.isManageNewsDisplayed();
		Assert.assertTrue(managenewsdisplay, Constants.SEARCHNEWSERROR );


	
	}

	@Test	
    public void verifyWhetherUserIsAbleToResetTheNews() throws IOException {
    	String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		homepage=login.clickOnSignInButton();
		
		
		managepage=homepage.clickOnManageNewsMoreInfo();
		
		managepage.clickOnResetButton();
		
		boolean managenewsdisplay = managepage.isManageNewsDisplayed();
		Assert.assertTrue(managenewsdisplay, Constants.RESETNEWSERROR );

		
	}
}