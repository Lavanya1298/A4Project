package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;
import objectRepository.OrgHomePage;

public class Org_01 extends Baseclass
{
	@Test
	public void Org_01case() throws Exception
	{

		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		
		
		String OrgName =  EUTIL.readDataFromExcel("Organization", 2, 1);
		String WebSite =  EUTIL.readDataFromExcel("Organization", 2, 2);
		String Employees =  EUTIL.readDataFromExcel("Organization", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage ohp = new OrgHomePage(driver);
		ohp.clickOnOrgBtn();
		CreateNewOrgPage cno = new CreateNewOrgPage(driver);
		cno.creatNewOrg(OrgName, WebSite, Employees);
		Thread.sleep(3000);
	}

}
