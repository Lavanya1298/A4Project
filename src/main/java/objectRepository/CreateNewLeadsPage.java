package objectRepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class CreateNewLeadsPage {
		
		@FindBy(xpath = "//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath = "//input[@name='company']")
		private WebElement company;
		
		@FindBy(xpath = "//input[@name='designation']")
		private WebElement title;

		
		@FindBy(xpath = "//input[@name='phone']")
		private WebElement phone;
		
		@FindBy(xpath = "//input[@name='mobile']")
		private WebElement mobile;
		
		@FindBy(xpath = "//input[@name='email']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@name='noofemployees']")
		private WebElement noOfEmployees;
		
		@FindBy(xpath = "//textarea[@name='lane']")
		private WebElement street;
		
		@FindBy(xpath = "//input[@name='pobox']")
		private WebElement poBox;
		
		@FindBy(xpath = "//input[@name='code']")
		private WebElement postalCode;
		
		@FindBy(xpath = "//input[@name='city']")
		private WebElement city;
		
		@FindBy(xpath = "//input[@name='country']")
		private WebElement country;
		
		@FindBy(xpath = "//input[@name='state']")
		private WebElement state;
		
		@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
		private WebElement save;

		public CreateNewLeadsPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getCompany() {
			return company;
		}

		public WebElement getTitle() {
			return title;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getNoOfEmployees() {
			return noOfEmployees;
		}

		public WebElement getStreet() {
			return street;
		}

		public WebElement getPoBox() {
			return poBox;
		}

		public WebElement getPostalCode() {
			return postalCode;
		}

		public WebElement getCity() {
			return city;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getState() {
			return state;
		}

		public WebElement getSave() {
			return save;
		}
		
		
		public void createLeads(String fName, String lName, String cName)
		{
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			company.sendKeys(cName);
			save.click();
		}

		public void createLeads(String fName, String lName, String cName,String lTitle, String Phn,
				String mob, String	emailId, String noOfEmp, String	st, String pBox, String pCode,
				String lCity, String lCountry, String lState)
		{
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			company.sendKeys(cName);
			title.sendKeys(lTitle);
			phone.sendKeys(Phn);
			mobile.sendKeys(mob);
			email.sendKeys(emailId);
			noOfEmployees.sendKeys(noOfEmp);
			street.sendKeys(st);
			poBox.sendKeys(pBox);
			postalCode.sendKeys(pCode);
			city.sendKeys(lCity);
			country.sendKeys(lCountry);
			state.sendKeys(lState);
		}
		
		

		public void createLeads(String fName, String lName, String cName,String lTitle, String Phn,
				String mob, String	emailId, String noOfEmp)
		{
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			company.sendKeys(cName);
			title.sendKeys(lTitle);
			phone.sendKeys(Phn);
			mobile.sendKeys(mob);
			email.sendKeys(emailId);
			noOfEmployees.sendKeys(noOfEmp);
			
		}
		

		public void createLeads(String fName, String lName, String cName, String st, String pBox, String pCode,
				String lCity, String lCountry, String lState)
		{
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			company.sendKeys(cName);
			street.sendKeys(st);
			poBox.sendKeys(pBox);
			postalCode.sendKeys(pCode);
			city.sendKeys(lCity);
			country.sendKeys(lCountry);
			state.sendKeys(lState);
		}
	}


