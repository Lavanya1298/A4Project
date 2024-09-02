package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.Baseclass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

@Listeners(genericUtilityOrLib.ListenersImplementationClass.class)//to access qualifiedclass name we should take it from listenersimplementationclass right click on class name copy qualified name
    public class LE_01 extends Baseclass
{
	@Test(retryAnalyzer = genericUtilityOrLib.RetryAnalyzerImplementationClass.class , groups = {"regression","smoke"})
	public void le_01case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FirstName =  EUTIL.readDataFromExcel("Leads", 2, 1);
		String LastName = EUTIL.readDataFromExcel("Leads", 2, 2);
		String Company = EUTIL.readDataFromExcel("Leads", 2, 3);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
		cn.createLeads( FirstName+num, LastName,Company);
		Thread.sleep(3000);
	 }

}
