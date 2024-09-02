package genericUtilityOrLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class Baseclass {

	public static WebDriver driver = null;
	SeleniumUtility SUTIL = null;
	PropertiesUtility PUTIL = new PropertiesUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void createConnection()
	{
		System.out.println("connection establish");
		
	}
	
   @BeforeClass(alwaysRun = true)
     
	public void launchBrower() throws Exception
	{
	   String URL = PUTIL.getDataFromProperties("url");
	   SUTIL = new SeleniumUtility();
	   driver = new ChromeDriver();
	   SUTIL.implicit(driver,10);
	   SUTIL.maximizeWindow(driver);
	   driver.get(URL);
	   System.out.println("launching sucessfull!!");
    }

     @BeforeMethod(alwaysRun = true)
     public void LoginApp() throws Exception
     {
    	 String USERNAME = PUTIL.getDataFromProperties("username");
    	 String PASSWORD = PUTIL.getDataFromProperties("password");
    	 LoginPage lp = new LoginPage(driver);
    	 lp.loginOperation(USERNAME, PASSWORD);
    	 System.out.println("LOGIN SUCCESSFULLY");
     }
   	 
     @AfterMethod(alwaysRun = true)
     public void LogOutApp() {
    	 HomePage hp = new HomePage(driver);
    	 System.out.println("logout successfully");
    	 
     }
     @AfterClass (alwaysRun = true)
     public void closeApp()
     {
     driver.close();
     System.out.println("browswe closed successfully");
}
     @AfterSuite (alwaysRun = true)
     public void closeConnection() {
    	 System.out.println("connection close successfully");
}
     }
