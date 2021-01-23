package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC004_DeleteLead extends OpentapsWrappers {
	
	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName = browser;
		testCaseName = "TC004 Delete Lead";
		testDescription = "Delete Lead from OpenTaps & LogOut";
		category="sanity";
		dataSheetName = "TC004";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNo, String text)
	{
		
		String  rcdDeleted = "";
		new LoginPage(driver, test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNo)
		.clickFindLeads()
		.clickFirstResultingLead()
		.getTextById(rcdDeleted)
		.clickDelete()
		
		.clickFindLeads()
		//.clickPhoneTab()
		.enterLeadId(rcdDeleted)
		.clickFindLeads()
		.verifyDeletion(text);
	}

}
