package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;


public class LoginPage 
{
	WaitUtility wait= new WaitUtility();
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement login;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashBoard;
	
	public boolean isDashBoardisDisplayed()
	{
		return dashBoard.isDisplayed();
	}
	
	public LoginPage enterUsernameAndPassword(String usernameField, String passwordField)
	{
		username.sendKeys(usernameField);
		password.sendKeys(passwordField);
		return this;
		
	}
	
	public HomePage clickOnLoginButton()
	{
		wait.waitforElementToClick(driver, login);
		login.click();
		return new HomePage(driver);
	}
	

}
