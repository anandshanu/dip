package OTR;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class App_Locators {
	
	
	public App_Locators(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//input [@id ='candidate_name']")
	public WebElement candidate_name;
	@FindBy(xpath="//div[@class='react-select__indicator react-select__dropdown-indicator css-1xc3v61-indicatorContainer'][1]")
	public WebElement changed_name_dropdown;
	@FindBy(xpath="//div[text()='Yes']")
	public WebElement selection;
	@FindBy (xpath="//input[@id='changed_name']")
	public WebElement change_name;
	@FindBy(xpath="//*[local-name()='svg' and @data-testid='CalendarIcon'][1]")
	public WebElement calendaricon;
	@FindBy(xpath="//*[local-name()='svg' and @data-testid='ArrowDropDownIcon'][1]")
	public WebElement calendar_year_icon;
	@FindBy(xpath="//button[text()='1993']")
	public WebElement selection_of_year;
	@FindBy(xpath="//button[@data-timestamp='736799400000']")
	public WebElement button;
	
	
	public void candidatename(String name)
	{
		candidate_name.sendKeys(name);
		
	}
	public void changed_name_dropdown()
	{
		changed_name_dropdown.click();
	}
	public void selection()
	{
		selection.click();
	}
	public void change_name(String name)
	{
		change_name.sendKeys(name);
		change_name.clear();
		change_name.sendKeys(name);
	
	}
	
	

}
