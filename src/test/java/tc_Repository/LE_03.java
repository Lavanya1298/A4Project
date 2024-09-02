package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends Baseclass {
	@Test//(groups = {"smoke"})
	public void le_03case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FirstName =  EUTIL.readDataFromExcel("Leads", 8, 1);
		String LastName = EUTIL.readDataFromExcel("Leads", 8, 2);
		String Company = EUTIL.readDataFromExcel("Leads", 8, 3);
		String Title =  EUTIL.readDataFromExcel("Leads", 8, 4);
		String Phone = EUTIL.readDataFromExcel("Leads", 8, 5);
		String Mobile = EUTIL.readDataFromExcel("Leads", 8, 6);
		String Email =  EUTIL.readDataFromExcel("Leads", 8, 7);
		String NoOfEmployees = EUTIL.readDataFromExcel("Leads", 8, 8);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads(FirstName, LastName, Company, Title, Phone, Mobile, Email, NoOfEmployees);
		Thread.sleep(3000);
		

	}

}
