package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_02 extends Baseclass {
	@Test
	public void Org_02case() throws Exception {

	JavaUtility JUTIL = new JavaUtility();
	int num = JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL = new ExcelUtility();
	
	
	String OrgName =  EUTIL.readDataFromExcel("Organization", 5, 1);
	String WebSite =  EUTIL.readDataFromExcel("Organization", 5, 2);
	String Employees =  EUTIL.readDataFromExcel("Organization", 5, 3);
	String Pno =  EUTIL.readDataFromExcel("Organization", 5,4);
	String OtherPhn =  EUTIL.readDataFromExcel("Organization", 5,5);
	String Email =  EUTIL.readDataFromExcel("Organization", 5,6);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnOrg();
	OrgHomePage ohp = new OrgHomePage(driver);
	ohp.clickOnOrgBtn();
	CreateNewOrgPage cno = new CreateNewOrgPage(driver);
	cno.creatNewOrg(OrgName, WebSite, Employees, Pno, OtherPhn, Email);
	Thread.sleep(3000);
	

}
}