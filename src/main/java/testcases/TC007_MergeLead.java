package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC007_MergeLead extends OpentapsWrappers{
	
	@Parameters("browser")
	@BeforeClass
	public void setVaules(String browser)
	{
		browserName = browser;
		testCaseName = "TC007 Merge Lead";
		testDescription = "Merge Leads in OpenTaps & LogOut";
		category="sanity";
		dataSheetName = "TC007";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String password,  String fromLeadId, String toLead)
	{
		new LoginPage(driver, test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLead()
		.enterLeadId(fromLeadId)
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickToLead()
		.enterLeadId(toLead)
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickMergeLead()
		.confirmMerge()
		
		;
		
	}
}
