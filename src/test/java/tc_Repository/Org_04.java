package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_04 extends Baseclass {
	@Test
	public void Org_04case() throws Exception {

	JavaUtility JUTIL = new JavaUtility();
	int num = JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL = new ExcelUtility();
	
	
	String OrgName =  EUTIL.readDataFromExcel("Organization", 8, 1);
	String WebSite =  EUTIL.readDataFromExcel("Organization", 8, 2);
	String Employee =  EUTIL.readDataFromExcel("Organization", 8, 3);
	String Pno =  EUTIL.readDataFromExcel("Organization", 8,4);
	String OtherPhn =  EUTIL.readDataFromExcel("Organization", 8,5);
	String Email =  EUTIL.readDataFromExcel("Organization", 8,6);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnOrg();
	OrgHomePage ohp = new OrgHomePage(driver);
	ohp.clickOnOrgBtn();
	CreateNewOrgPage cno = new CreateNewOrgPage(driver);
	cno.creatNewOrg(OrgName, WebSite,Pno, OtherPhn, Email);
	Thread.sleep(3000);
	
	}
}

