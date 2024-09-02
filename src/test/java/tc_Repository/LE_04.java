package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_04 extends Baseclass{
	@Test//(groups = {"regression"})
	
	public void le_04case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FirstName =  EUTIL.readDataFromExcel("Leads", 11, 1);
		String LastName = EUTIL.readDataFromExcel("Leads", 11, 2);
		String Company = EUTIL.readDataFromExcel("Leads", 11, 3);
		String PoBox = EUTIL.readDataFromExcel("Leads", 11, 3);
		String PCode =  EUTIL.readDataFromExcel("Leads", 11, 4);
		String City = EUTIL.readDataFromExcel("Leads", 11, 12);
		String Country =  EUTIL.readDataFromExcel("Leads", 11, 13);
		String st = EUTIL.readDataFromExcel("Leads", 11, 14);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads(FirstName+num , LastName, Company, PoBox, PCode, City, Country, st);
		Thread.sleep(3000);
		
		
	}

}
