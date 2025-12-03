package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage 
{
  WebDriver driver;
  public ManageFooterTextPage(WebDriver driver) 
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") WebElement editButton;
  @FindBy(xpath="//textarea[@placeholder='Enter the Address']") WebElement address;
  @FindBy(xpath="//input[@name='email']") WebElement email; 
  @FindBy(xpath="//input[@name='phone']") WebElement phone;
  @FindBy(xpath="//button[@name='Update']") WebElement updateButton;
  
  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement footerTextUpdatedAlert;

  
  public ManageFooterTextPage clickOnEditButton()
  {
	  editButton.click();
	  return this;
  }
  
  public ManageFooterTextPage enterAddress(String addressfield)
  {
	  address.sendKeys(addressfield);
	  return this;
  }
  
  public ManageFooterTextPage enterEmail(String emailField)
  {
	  email.sendKeys(emailField);
	  return this;
  }
  
  public ManageFooterTextPage enterPhoneNumber(String phoneNUmber)
  {
	  phone.sendKeys(phoneNUmber);
	  return this;
  }
  
  public ManageFooterTextPage clickOnUpdateButton()
  {
	  updateButton.click();
	  return this;
  }
  
  public boolean footerTextUpdatedSuccessfullyAlert() 
  {
	  return footerTextUpdatedAlert.isDisplayed();
  }
  
}
