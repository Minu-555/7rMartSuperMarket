package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersEdit 
{
 
	WebDriver driver;
	PageUtility pageUtilityObj= new PageUtility();
	
	public AdminUsersEdit(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newBtn;
	//@FindBy(xpath="//input[@id='username']") WebElement username;
	//@FindBy(xpath="//input[@id='password']") WebElement password;
	//@FindBy(xpath="//select[@name='user_type']") WebElement userType;
   // @FindBy(xpath="//button[@name='Create']") WebElement saveBtn;
	   @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody/tr[1]//a[contains(@href, 'edit')]") WebElement editIcon;
	   @FindBy(xpath="//input[@value='pearlie.bosco']") WebElement editUsername;
	   @FindBy(xpath="//input[@value='ln1rwa0kr94yi']") WebElement editPassword;
	   @FindBy(xpath="//button[@class='btn btn-block-sm btn-info']") WebElement updateBtn;


   // public AdminUsersEdit clickOnNew() 
   // {
    //	newBtn.click();
    //	return this;
    //}
    
    

   // public AdminUsersEdit enterUserNameAndPassword(String usernameField, String passwordField) 
   // {
    //	username.sendKeys(usernameField);
    //	password.sendKeys(passwordField);
    //	return this;
    //}
    
   // public AdminUsersEdit selectUserType() 
    //{
    	//Select dropdown= new Select(userType);
    	//dropdown.selectByVisibleText("Admin");
    //	pageUtilityObj.selectByVisibleText(userType, "Admin");
    	//return this;
    //}
 
    //public AdminUsersEdit clickOnSave() 
    //{
    //	saveBtn.click();
    //	return this;
    //}
	   
	   public AdminUsersEdit clickOnEditIcon()
	   {
		   editIcon.click();
		   return this;
	   }
	   
	   public AdminUsersEdit enterUserNameAndPassword(String usernameField, String passwordField)
	   {
		   editUsername.sendKeys(usernameField);
		   editPassword.sendKeys(passwordField);
		   return this;
	   }
	   
	   public AdminUsersEdit clickOnUpdateButton()
	   {
		   updateBtn.click();
		   return this;
	   }
}

