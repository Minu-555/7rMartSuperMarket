package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class ManageCategoryPage 
{
	WebDriver driver;
	WaitUtility wait= new WaitUtility();
	FileUploadUtility fileUploadUtilityObj= new FileUploadUtility();
 
  public ManageCategoryPage(WebDriver driver) 
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//a[@onclick='click_button(1)']") WebElement ManageCategoryNewBtn;
  @FindBy(xpath="//input[@name='category']") WebElement categoryTextfield;
  @FindBy(xpath="//li[@id='134-selectable']") WebElement discount;
  @FindBy(xpath="//input[@id='main_img']") WebElement chooseFileBtn;
 // @FindBy(xpath="//input[@value='no']") WebElement showOntop;
 // @FindBy(xpath="//input[@id='main_img']") WebElement showOnLeft;
  @FindBy(xpath="//button[@class='btn btn-danger']") WebElement manageCategorySaveBtn;
  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement categoryCreatedSuccessfullyMessage; 


  
  public ManageCategoryPage manageCategoryClickOnNewBtn()
  {
	  wait.waitforElementToClick(driver, ManageCategoryNewBtn);
	  ManageCategoryNewBtn.click();
	  return this;
  }
  
  public ManageCategoryPage enterCategoryItem(String category)
  {
	  categoryTextfield.sendKeys(category);
	  return this;
  }
  
  public ManageCategoryPage discountClick()
  {
	  wait.waitforElementToClick(driver, discount);
	  discount.click();
	  return this;
  }
  
  public ManageCategoryPage fileSelection()
  {
	  wait.waitforElementToClick(driver, chooseFileBtn);
	  fileUploadUtilityObj.sendKeysForFileUpload(chooseFileBtn, Constant.IMAGEPATH);
      //chooseFileBtn.sendKeys("C:\\Users\\aarad\\OneDrive\\Pictures\\IMG_3464-PANO.jpg");
      return this;
  }
  
  public ManageCategoryPage javaScriptExecutor()
  {
	  
	  JavascriptExecutor executor= (JavascriptExecutor) driver;
	  executor.executeScript("window.scrollBy(0,1000)");
	  return this;
  }
  
  public ManageCategoryPage manageCategorySaveClick()
  {
	  wait.waitforElementToClick(driver, manageCategorySaveBtn);
	  manageCategorySaveBtn.click();
	  return this;
  }
  
  public boolean verifyCategoryCreatedSuccessfullyMessageIsDisplayed()
  {
	  return categoryCreatedSuccessfullyMessage.isDisplayed();
  }
  
  
  
}
