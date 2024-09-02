
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;

/**
 * @author lavanya
 * 
 */
public class HomePage {
	
	
	@FindBy(xpath = "(//a[text()='Lead'])[1]")
	private WebElement leads;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")

	private WebElement org;

	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement preferences;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutOption;

	/**
	 * creating Constructor to initialize all the elements in the current web page
	 * @param driver
	 */
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	/**
	 * getting access to the private members(encapsulation)
	 * @return
	 */
	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	
	/**
	 * this is business library to click on leads
	 */
	public void clickOnLeads()
	{
		leads.click();
	}
	/**
	 * this is business library to click on organization
	 */
	
	public void clickOnOrg()
	{
		org.click();
	}
	
	/**
	 * this is business lib to logout
	 * @throws Exception
	 */
	public void logoutOperation(WebDriver driver) throws Exception
	{
		SeleniumUtility sutil = new SeleniumUtility();
		sutil.moveCursorToAnElement(driver ,preferences);
		Thread.sleep(3000);
		sutil.moveCursorToAnElement(driver ,signoutOption);
	
	}

}