package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageNewsPage
{
	WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement manageNewBtn;
	@FindBy(xpath="//textarea[@id='news']") WebElement newscontent;
	@FindBy(xpath="//button[@name='create']") WebElement NewsSaveBtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement newsAlert;
	
	public ManageNewsPage clickOnNewButton()
	{
		manageNewBtn.click();
		return this;
	}
	
	public ManageNewsPage enterNews(String news)
	{
		newscontent.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage saveNews()
	{
		NewsSaveBtn.click();
		return this;
	}
	
	public boolean newsCreatedSuccessfullyMessageIsDisplayed()
	   {
		   return newsAlert.isDisplayed();
	   }
  
}
