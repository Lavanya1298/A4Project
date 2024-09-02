package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_02 extends Baseclass {
	@Test//(groups = {"sanity"} )
	public void le_02() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FirstName =  EUTIL.readDataFromExcel("Leads", 5, 1);
		String LastName = EUTIL.readDataFromExcel("Leads", 5, 2);
		String Company = EUTIL.readDataFromExcel("Leads", 5, 3);
		String Title =  EUTIL.readDataFromExcel("Leads", 5, 4);
		String Phone = EUTIL.readDataFromExcel("Leads", 2, 5);
		String Mobile = EUTIL.readDataFromExcel("Leads", 5, 6);
		String Email =  EUTIL.readDataFromExcel("Leads", 5, 7);
		String NoOfEmployees = EUTIL.readDataFromExcel("Leads", 5, 8);
		String Street = EUTIL.readDataFromExcel("Leads", 5, 9);
		String PoBox =  EUTIL.readDataFromExcel("Leads", 5, 10);
		String PCode = EUTIL.readDataFromExcel("Leads", 2, 11);
		String City = EUTIL.readDataFromExcel("Leads", 5, 12);
		String Country =  EUTIL.readDataFromExcel("Leads", 5, 13);
		String st = EUTIL.readDataFromExcel("Leads", 5, 14);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads(FirstName, LastName, Company, Title, Phone, Mobile, Email, NoOfEmployees, Street, PoBox, PCode, City, Country, st);
		Thread.sleep(3000);
		
	}

}
