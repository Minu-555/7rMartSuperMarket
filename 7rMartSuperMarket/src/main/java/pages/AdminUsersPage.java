package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage 
{
	WebDriver driver;
	PageUtility pageUtilityObj= new PageUtility();
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newBtn;
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//select[@name='user_type']") WebElement userType;
    @FindBy(xpath="//button[@name='Create']") WebElement saveBtn; 
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement userCreatedSuccessfullyAlert; 
    
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchBtn; 
    @FindBy(xpath="//input[@id='un']") WebElement searchUsername;
	@FindBy(xpath="//select[@id='ut']") WebElement searchUserType;
	@FindBy(xpath="//button[@name='Search']") WebElement searchButton;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]") WebElement searchElement;
       
    public AdminUsersPage clickOnNew() 
    {
    	newBtn.click();
    	return this;
    }

    public AdminUsersPage enterUserNameAndPassword(String usernameField, String passwordField) 
    {
    	username.sendKeys(usernameField);
    	password.sendKeys(passwordField);
    	return this;
    }
    
    public AdminUsersPage selectUserType() 
    {
    	//Select dropdown= new Select(userType);
    	//dropdown.selectByVisibleText("Admin");
    	pageUtilityObj.selectByVisibleText(userType, "Admin");
    	return this;
    }
 
    public AdminUsersPage clickOnSave() 
    {
    	saveBtn.click();
    	return this;
    }
    
    public boolean isUserSuccessfullyCreatedMessageIsDisplayed()
    {
 	   return userCreatedSuccessfullyAlert.isDisplayed();
    }
    
    public AdminUsersPage clickOnSearchIcon()
    {
    	searchBtn.click();
    	return this;
    }
    
    public AdminUsersPage enterUserNameForSearching(String usernameField)
    {
    	searchUsername.sendKeys(usernameField);
       	return this;
    }
    
    public AdminUsersPage selectUseTypeForSearching()
    {
    	//pageUtilityObj.selectByVisibleText(userType, "Admin");
    	//pageUtilityObj.selectByValue(userType, "Admin");
    	Select dropdownlist= new Select(userType);
    	dropdownlist.selectByVisibleText("Admin");
    	
    	return this;
    }
        
    public AdminUsersPage clickOnSearchButton()
    {
    	searchButton.click();
    	return this;
    }
    
    public boolean searchElementIsDisplayed()
    {
 	   return searchElement.isDisplayed();
    }
    

}


