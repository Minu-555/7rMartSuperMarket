package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import pages.ManageNewsPage;

public class ManageFooterTextTest extends Base
{
	public HomePage home;
	public ManageFooterTextPage manageFooter;
  @Test
  @Parameters({"username", "password"})
  public void verifyFooterTextEdit(String username, String password)
  {
	  LoginPage loginPageObj = new LoginPage(driver);
	  loginPageObj.enterUsernameAndPassword(username, password);
	  home= loginPageObj.clickOnLoginButton();
	  
	  manageFooter= home.clickOnManageFooterText();
	  manageFooter.clickOnEditButton().enterAddress("Trivandrum").enterEmail("test@1234").enterPhoneNumber("9084345672").clickOnUpdateButton();
	  
	  boolean footerTextUpdated= manageFooter.footerTextUpdatedSuccessfullyAlert();
	  Assert.assertTrue(footerTextUpdated);
  }
}
