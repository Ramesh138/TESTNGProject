package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC003_CreateLead extends OpentapsWrappers {

	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName = browser;
		testCaseName = "TC003 Create Lead";
		testDescription = "Create Lead to OpenTaps & LogOut";
		category="sanity";
		dataSheetName = "TC003";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,
			String companyName, String firstName, String lastName){

		new LoginPage(driver,test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.verifyFirstName(firstName);			

	}

}











