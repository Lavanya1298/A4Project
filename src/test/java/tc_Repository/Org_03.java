package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;


	public class Org_03 extends Baseclass {
		@Test
		public void Org_03case() throws Exception {

		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		
		
		String OrgName =  EUTIL.readDataFromExcel("Organization", 8, 1);
		String WebSite =  EUTIL.readDataFromExcel("Organization", 8, 2);
		String BillingAddress =  EUTIL.readDataFromExcel("Organization", 8, 3);
		String BillingCity =  EUTIL.readDataFromExcel("Organization", 8,4);
		String BillingState =  EUTIL.readDataFromExcel("Organization", 8,5);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage ohp = new OrgHomePage(driver);
		ohp.clickOnOrgBtn();
		CreateNewOrgPage cno = new CreateNewOrgPage(driver);
		cno.creatNewOrg(OrgName, WebSite, BillingAddress, BillingCity, BillingState );
		Thread.sleep(3000);
		
		}
	}

