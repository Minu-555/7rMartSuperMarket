package testscript;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUsersTestPage extends Base
{
	public HomePage home;
	public AdminUsersPage admin;
	FakerUtility fake= new FakerUtility();
  @Test
  @Parameters({"username","password"})
  public void verifyAdminUserInfo(String username, String password) 
  {
	  LoginPage loginPageObj = new LoginPage(driver);
	  loginPageObj.enterUsernameAndPassword(username, password);
	  home= loginPageObj.clickOnLoginButton();
	  admin= home.clickOnAdminUsers();
	  String new_username= fake.getUserName();
	  String new_password= fake.getPassword();
	  
	  admin.clickOnNew().enterUserNameAndPassword(new_username, new_password).selectUserType().clickOnSave();
	  
	  boolean userCreated= admin.isUserSuccessfullyCreatedMessageIsDisplayed();
	  Assert.assertTrue(userCreated);
  }
 
  @Test
  @Parameters({"username","password"})
  public void verifySearchData(String username, String password)
  {
	  LoginPage loginPageObj = new LoginPage(driver);
	  loginPageObj.enterUsernameAndPassword(username, password);
	  home= loginPageObj.clickOnLoginButton();
	  admin= home.clickOnAdminUsers();
	
	  admin.clickOnSearchIcon().enterUserNameForSearching("Hilbert").clickOnSearchButton();
	  
	  boolean searchElemnt= admin.searchElementIsDisplayed();
	  Assert.assertTrue(searchElemnt);
  }

}