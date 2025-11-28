package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base
{
	public HomePage home;
	public ManageNewsPage manage;
  @Test(retryAnalyzer = retry.Retry.class)
  @Parameters({"username", "password"})
  public void verifyNews(String username, String password)
  {
	  LoginPage loginPageObj = new LoginPage(driver);
	  loginPageObj.enterUsernameAndPassword(username, password);
	  home= loginPageObj.clickOnLoginButton();
	  
	  manage= home.clickOnManageNews();
	  manage.clickOnNewButton().enterNews("Sample Test").saveNews();
	  
	  boolean newsCreated= manage.newsCreatedSuccessfullyMessageIsDisplayed();
	  Assert.assertTrue(newsCreated);
  }
}
