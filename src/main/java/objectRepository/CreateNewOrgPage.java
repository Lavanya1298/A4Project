
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath = "//input[@name='employees']")
	private WebElement employees;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement Phn;
	
	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherPhn;
	
	@FindBy(xpath = "//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement BillingAddress;
	
	@FindBy(xpath = "//input[@name='bill_city']")
	private WebElement BillingCity;
	
	@FindBy(xpath = "//input[@name='bill_state']")
	private WebElement BillingState;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement save;

	public CreateNewOrgPage(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return Phn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getBillingCity() {
		return BillingCity;
	}

	public WebElement getBillingState() {
		return BillingState;
	}
	
	public void creatNewOrg(String organisationName, String web, String emp)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		save.click();
	}
	
	public void creatNewOrg(String organisationName, String web, String emp, String phoneNum, String OtherPhoneNUM
			, String emailId)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		Phn.sendKeys(phoneNum);
		otherPhn.sendKeys(OtherPhoneNUM);
		email.sendKeys(emailId);
		save.click();
		
	}
	
	public void creatNewOrg(String organisationName, String web, String billingAdds, String billingcity, String billingstse)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		BillingAddress.sendKeys(billingAdds);
		BillingCity.sendKeys(billingcity);
		BillingState.sendKeys(billingstse);
		save.click();
		
	}
	
	public void creatNewOrg(String organisationName, String web,String emp, String phoneNum, String OtherPhoneNUM
			, String emailId, String billingAdds, String billingcity, String billingstse)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		Phn.sendKeys(phoneNum);
		otherPhn.sendKeys(OtherPhoneNUM);
		email.sendKeys(emailId);
		BillingAddress.sendKeys(billingAdds);
		BillingCity.sendKeys(billingcity);
		BillingState.sendKeys(billingstse);
		save.click();
		
	}

	public void createNewOrg(String organisationName, String web, String emp,String phoneNum, String OtherPhoneNUM
			, String emailId)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		Phn.sendKeys(phoneNum);
		otherPhn.sendKeys(OtherPhoneNUM);
		
		save.click();
		
	}
}
