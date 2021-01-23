package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC005_DuplicateLead extends OpentapsWrappers {
	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName = browser;
		testCaseName = "TC005 Duplicate Lead";
		testDescription = "Duplicate Lead in OpenTaps & LogOut";
		category="sanity";
		dataSheetName = "TC005";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password, String emailId)
	{
		new LoginPage(driver, test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailAddress(emailId)
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickDuplicate()
		.clickCreateLead();
		
		
	}
			

}
