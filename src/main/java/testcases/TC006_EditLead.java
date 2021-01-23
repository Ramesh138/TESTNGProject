package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC006_EditLead extends OpentapsWrappers{
	
	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser)
	{
		browserName = browser;
		testCaseName = "TC006 Edit Lead";
		testDescription = "Edit Lead in OpenTaps & LogOut";
		category="sanity";
		dataSheetName = "TC006";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password, String sourceVisibleText)
	{
		new LoginPage(driver, test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickEdit()
		.selectSource(sourceVisibleText)
		.addSource()
		.update();
	}
}
