package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My Home Page. Look at the SnapShot", "FAIL");
		}
	}

	public MyLeadsPage clickLeads(){
		clickByLink(prop.getProperty("MyHome.Leads.Link"));
		return new MyLeadsPage(driver,test);
	}
	

	
	























}
