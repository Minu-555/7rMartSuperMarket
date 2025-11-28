package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base 
{
	public HomePage home;
	public ManageCategoryPage manageCategory;

  @Test
 // @Parameters({"username","password"})
 // public void verifyManageCategory(String username, String password)
  //{
	//  LoginPage loginPageObj = new LoginPage(driver);
	//  loginPageObj.enterUsernameAndPassword(username, password);
	 // home= loginPageObj.clickOnLoginButton();
	  
	 // manageCategory= home.clickOnManageCategory();
	 // manageCategory.ManageCategoryClickOnNewBtn().enterCategoryItem("Test Manage Categoy item");
 // }
  public void verifyManageCategory() throws IOException
  {
	  LoginPage login= new LoginPage(driver);
	  String username= ExcelUtility.readStringData(1, 0, "LoginPageTest");
	  String password= ExcelUtility.readStringData(1, 1, "LoginPageTest");
	  login.enterUsernameAndPassword(username, password);
	  home= login.clickOnLoginButton();
	  
	  manageCategory= home.clickOnManageCategory();
	  manageCategory.manageCategoryClickOnNewBtn().enterCategoryItem("Test123455").discountClick().fileSelection().manageCategorySaveClick();
	  
	  boolean categoryCreated= manageCategory.verifyCategoryCreatedSuccessfullyMessageIsDisplayed();
	  Assert.assertTrue(categoryCreated);
	  
  }
  
}
