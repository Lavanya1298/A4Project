package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement newOrgButton;

	public OrgHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewOrgButton() {
		return newOrgButton;
	}
	
	public void clickOnOrgBtn()
	{
		newOrgButton.click();
	}
}