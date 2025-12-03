package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	public void selectByVisibleText(WebElement element, String text)
	{
		Select textValue= new Select(element);
		textValue.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
        select.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element, String value)
    {
        Select select = new Select(element);
        select.selectByValue(value);
    }
	
	// Get element text
    public String getElementText(WebElement element)
    {
        return element.getText();
    }

    // Check element is displayed
    public boolean isElementDisplayed(WebElement element) 
    {
        return element.isDisplayed();
    }

 }
