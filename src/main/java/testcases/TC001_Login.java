package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC001_Login extends OpentapsWrappers{

	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName=browser;
		testCaseName="TC001 - Login";
		testDescription="Login and Logout from Opentaps(Positive)";
		category="smoke";
		dataSheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginOpentaps(String userName, String password,
								String name) {

		new LoginPage(driver,test)
		.login(userName, password)
		.verifyLoggedName(name)
		.clickLogout();		
	}
	

	
}










