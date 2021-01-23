package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		
	}

	public HomePage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new LoginPage(driver,test);

	}

	public MyHomePage clickCRMSFA() {
		clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new MyHomePage(driver,test);

	}

}





