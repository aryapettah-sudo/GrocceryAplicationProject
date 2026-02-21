package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	
	public WebDriver driver;
	WaitUtility wait = new WaitUtility();
		
		public ManageNewsPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
	    }
		
		@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add'and contains (@class,'btn btn-rounded btn-danger')]")WebElement newinnews;
	    @FindBy(xpath="//textarea[@id='news']")WebElement enterthenews;
	    @FindBy(xpath="//button[@type='submit']")WebElement save;
	    @FindBy(xpath="//a[@href='javascript:void(0)']")WebElement search;
	    @FindBy(xpath="//input[@type='text']")WebElement searchtitle;
	    @FindBy(xpath="//button[@type='submit']")WebElement clicksearchbutton;
	    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement reset;
	    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertText;
		@FindBy(xpath="//h1[@class='m-0 text-dark' and text()='Manage News']")WebElement managenewstext;
	    
	    public ManageNewsPage clickOnNewButton() {
	    	wait.waitUntilElementToBeClickable(driver, newinnews);
	    	newinnews.click();
	    	return this;
		}  
	    public ManageNewsPage enterTheNewsOnNewsField(String enterthenewsvalue) {
	    	enterthenews.sendKeys(enterthenewsvalue);
	    	return this;
		}
	    public ManageNewsPage clickOnSaveButton() {
	    	wait.waitUntilElementToBeClickable(driver, save);
	    	save.click();
	    	return this;
		}
	    
	    
	   public ManageNewsPage clickOnSearchButton() {
		   wait.waitUntilElementToBeClickable(driver, search);;
		   search.click();
		   return this;
	    }
	   public ManageNewsPage enterSearchTitleOnSearchField (String searchthetitlevalue) {
		   searchtitle.sendKeys(searchthetitlevalue);
		   return this;
	    }
	   public ManageNewsPage clickOnSearchButtonAfterEnterSearchValue() {
		   wait.waitUntilElementToBeClickable(driver, clicksearchbutton);
		   clicksearchbutton.click();
		   return this;
	    }   
		
	   
	   public ManageNewsPage clickOnResetButton() {
		   wait.waitUntilElementToBeClickable(driver, reset);
		  reset.click();
		  return this;
	   }
	   
	   
	   public boolean isManageNewsDisplayed()
		{
			return managenewstext.isDisplayed();
		}
	   public boolean isAlertTextDisplayed()
		{
			return alertText.isDisplayed();
		}
	}
	    
	    