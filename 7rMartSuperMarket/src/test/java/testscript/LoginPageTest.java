package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base
{
	HomePage home;
  @Test(groups = "smoke")
  public void verifyLoginWithValidUsernameAndPassword() throws IOException 
  {
	  LoginPage login= new LoginPage(driver);
	  String username= ExcelUtility.readStringData(1, 0, "LoginPageTest");
	  String password= ExcelUtility.readStringData(1, 1, "LoginPageTest");
	  login.enterUsernameAndPassword(username, password);
	  home= login.clickOnLoginButton();
	  boolean dashboardDisplayed= login.isDashBoardisDisplayed();
	  Assert.assertTrue(dashboardDisplayed,Constant.ERRORMESSAGE );
  }
  
  @Test
  @Parameters({"username","password"})
  public void verifyLoginWithinvalidUsernameAndValidpassword(String username, String Password)
  {
	  LoginPage login= new LoginPage(driver);
	  login.enterUsernameAndPassword(username, Password);
	  login.clickOnLoginButton();
  }
    
  
  @DataProvider(name="Credentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"Minu","Test123"},{"Anu","Test@123"}};
	  return data;
  }
  
  @Test(dataProvider = "Credentials", groups = "smoke")
  public void invalidUsernameAndinvalidpassword(String username, String password)
  {
	  LoginPage login= new LoginPage(driver);
	  login.enterUsernameAndPassword(username, password);
	  login.clickOnLoginButton();
  }
  

}
