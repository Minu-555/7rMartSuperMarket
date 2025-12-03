package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AdminUsersEdit;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUsersEditTest extends Base
{
	public HomePage home;
	public AdminUsersPage admin;
	public AdminUsersEdit edit;
	FakerUtility fake= new FakerUtility();
	
  @Test
  @Parameters({"username","password"})
  public void verifyAdminUserEditFeature(String username, String password) 
  {
	  	LoginPage loginPageObj = new LoginPage(driver);
	    loginPageObj.enterUsernameAndPassword(username, password);
	    
	    home = loginPageObj.clickOnLoginButton();
	    admin = home.clickOnAdminUsers();

	    
	    edit = new AdminUsersEdit(driver);//imp

	    String new_username = fake.getUserName();
	    String new_password = fake.getPassword();

	    edit.clickOnEditIcon().enterUserNameAndPassword(new_username, new_password).clickOnUpdateButton();
	    
	    boolean userUpdated= edit.updateSuccessfullAlert();
		 Assert.assertTrue(userUpdated);
	  
  }
}
