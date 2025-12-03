package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersEdit 
{
 
	WebDriver driver;
	WaitUtility wait= new WaitUtility();
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
	  @FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]") WebElement editIcon;
	   @FindBy(xpath="//input[@id='username']") WebElement editUsername;
	   @FindBy(xpath="//input[@id='password']") WebElement editPassword;
	   @FindBy(xpath="//button[@name='Update']") WebElement updateBtn;
	   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement updateAlert;

   	   
	   public AdminUsersEdit clickOnEditIcon()
	   {
		   wait.waitforElementToClick(driver, editIcon);
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
	   
	   public boolean updateSuccessfullAlert()
	    {
	 	   return updateAlert.isDisplayed();
	    }
}

