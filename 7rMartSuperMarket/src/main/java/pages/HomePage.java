package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
	
	@FindBy(xpath="//div[@class='col-lg-3 col-6'][1]//child::a") WebElement adminUsers;    //admin users xpath
	
	@FindBy(xpath="//div[@class='col-lg-3 col-6'][7]//child::a") WebElement manageNews;
	
	@FindBy(xpath="//div[@class='col-lg-3 col-6'][9]//child::a") WebElement manageCategory;
	
	@FindBy(xpath="//div[@class='col-lg-3 col-6'][8]//child::a") WebElement manageFootertext;

	public ManageFooterTextPage clickOnManageFooterText()
	{
		manageFootertext.click();
		return new ManageFooterTextPage(driver);
	}
	public ManageCategoryPage clickOnManageCategory()
	{
		manageCategory.click();
		return new ManageCategoryPage(driver);
	}
	
	public AdminUsersPage clickOnAdminUsers() 
	{
	    adminUsers.click();
	    return new AdminUsersPage(driver);
	}
	
	public ManageNewsPage clickOnManageNews()
	{
		manageNews.click();
		return new ManageNewsPage(driver);
	}
	
   public HomePage clickOnAdminClick()
   {
	   admin.click();
	   return this;
   }
   
   public HomePage clickOnLogoutClick()
   {
	   logout.click();
	   return this;
   }
}
	


