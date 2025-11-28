package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base
{
	public HomePage home;
  @Test
  @Parameters({"username","password"})
  public void verifyLogout(String username, String password) 
  {
	 LoginPage loginpageObj= new LoginPage(driver);
	 loginpageObj.enterUsernameAndPassword(username, password);
	 home= loginpageObj.clickOnLoginButton();
	 
	 home.clickOnAdminClick().clickOnLogoutClick(); 
	 
	
	 String expected= "Login | 7rmart supermarket1";
	 String actual= driver.getTitle();
	 Assert.assertEquals(actual, expected,"Logout failed");
  }
}
