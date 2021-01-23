package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			reportStep("This is not Login Page", "FAIL");

	}

	public LoginPage enterUserName(String data) {
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;

	}
	
	public LoginPage enterPassword(String data) {
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage(driver,test);		
	}

	public LoginPage clickLoginForFailure() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
		
	}
	public LoginPage verifyErrorMessage(String data) {		
		verifyTextContainsByXpath(prop.getProperty("Login.Error.Xpath"), data);		
		return this;		
	}
	
	public HomePage login(String userName, String password){
		return enterUserName(userName).enterPassword(password).clickLogin();
	}
	
	
	




















}





