package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.OpentapsWrappers;

public class TC002_LoginFailure extends OpentapsWrappers{
	
	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName=browser;
		testCaseName="TC002 - Login Failure";
		testDescription="Login to Opentaps(Negative)";
		category="neagtive";
		dataSheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void loginOpentaps(String userName, String password,
								String error) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure();
		
	}
	
}










