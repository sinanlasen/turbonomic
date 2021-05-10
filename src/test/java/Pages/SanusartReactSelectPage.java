package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Driver;

public class SanusartReactSelectPage {
	
	
	public SanusartReactSelectPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//*[@class='css-193a84b e82ion09']") WebElement clear;
	public void clickClear() {
		clear.click();
	}
	
	@FindBy(xpath="//*[@aria-label='Dropdown select']") WebElement dropDown;
	public void clickDropDown() {
		dropDown.click();
	}
	
	@FindBy(xpath="//*[@role='option']") List<WebElement> options;
	public void clickOptionsByOrder(int orderNumber) {
	options.get(orderNumber-1).click();
		}
		
	public String optionsIsSelectedByOrder(int orderNumber) {
		return options.get(orderNumber-1).getAttribute("aria-selected");
	}
	
	
	
	
	 
	
}
